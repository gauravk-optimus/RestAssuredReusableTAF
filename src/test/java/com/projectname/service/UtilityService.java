package com.projectname.service;

import io.restassured.response.Response;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Random;
import java.util.Scanner;

import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.projectname.model.apirequest.DataRequest;
import com.projectname.model.apiresponse.DataResponse;
import com.projectname.utils.Constants;

/**
 * This Class is used for reading JSON files, fetching requests and response
 * 
 * @author Optimus
 *
 */
public class UtilityService {
	
	private static Logger log = LoggerFactory.getLogger(UtilityService.class);
	private static Properties config;
	private static FileInputStream inputFile;
	private static String propertyKey;
	
	static {
		 config = new Properties();		 
		 try {
			inputFile = new FileInputStream(Constants.PATH_ROOT + Constants.CONFIG_FILE_PATH);
			config.load(inputFile);
	     } catch (IOException exception) {
		    log.error("Exception occured while reading the " + propertyKey);
			exception.printStackTrace();
		 }		
	}
	
	/**
	 * Fetching property from properties file
	 * 
	 * @param propertyKey
	 * 			key to be read
	 * @return
	 * 			value corresponding to the key
	 */	
	public static String getPropertyFromFile(String propertyKey) {		
		String value = config.getProperty(propertyKey);
		log.info(value + " of property " + propertyKey + " is read by Properties Reader");		
		return value;
	}
	
	/**
	 * Fetching object for response
	 * 
	 * @param responseString
	 * 					Response as string
	 * @return
	 * @throws IOException
	 * @throws JSONException
	 */
	public static DataResponse getResponseModel(String responseString) throws IOException, JSONException {
		ObjectMapper mapper = (new ObjectMapper()).configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		DataResponse rawResponse = (DataResponse)mapper.readValue(responseString, DataResponse.class);		
		return rawResponse;
	}	
	
	/**
	 * Fetching object for requests
	 * 
	 * @param requestData
	 * 			String payload
	 * @return
	 * @throws IOException
	 * @throws JSONException
	 */
	public static DataRequest getRequestModel(String requestJsonData) throws IOException, JSONException {				
		ObjectMapper mapper = (new ObjectMapper()).configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		DataRequest monkeyRequest = (DataRequest)mapper.readValue(requestJsonData, DataRequest.class);		
		return monkeyRequest;
	}
	
	/**
	 * 
	 * Fetching the test data file from resources folder
	 * @param fileName
	 * 			name of the file to be fetched
	 * @return
	 *  		file data in string format
	 */
	public static String getTestDataFile(String filePath) {
		StringBuilder result = new StringBuilder("");
		ClassLoader classLoader = UtilityService.class.getClassLoader();
		File file = new File(classLoader.getResource(filePath).getFile());
		try (Scanner scanner = new Scanner(file)) {
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				result.append(line);
			}
			scanner.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result.toString();
	}

	/**
	 * Adding subType information in response
	 * 
	 * @param formFieldsSubType
	 *            Formfields sub type
	 * @param responseJsonObject
	 *            JSON object of response
	 * @return
	 * @throws JSONException
	 */
	public static String addSubTypeByKeyToResponse(String subType, String key, JSONObject responseJsonObject) throws JSONException{
		if (subType == null || key == null) {
			return responseJsonObject.toString();
		}
		JSONObject ordersObject = responseJsonObject.getJSONArray("mids").getJSONObject(0).getJSONArray("orders").getJSONObject(0);
		if (ordersObject.has(key)) {
			JSONObject keyObject = ordersObject.getJSONObject(key);
			keyObject.put("@type", subType);
		}
		return responseJsonObject.toString();
	}
	
	/**
	 * Adding subType information in request
	 * 
	 * @param midSettingSubType
	 * 				MidSettings sub type
	 * @param requestJsonObject
	 * 				JSON object for request
	 * @return
	 * @throws JSONException
	 */
	public static String addMidSettingsSubTypeToRequest(String midSettingSubType, JSONObject requestJsonObject) throws JSONException{
		JSONObject midSettingsObject = requestJsonObject.getJSONArray("mids").getJSONObject(0).getJSONObject("settings");
		midSettingsObject.put("@type", midSettingSubType);
		return requestJsonObject.toString();
	}	
	
	/**
	 * Adding subtype information in response
	 * 
	 * @param formFieldsSubType
	 * @param responseJsonObject
	 * @return
	 * @throws JSONException
	 */
	public static String addRawResponseSubTypeToResponse(String formFieldsSubType, JSONObject responseJsonObject) throws JSONException{
		JSONObject ordersObject = responseJsonObject.getJSONArray("mids").getJSONObject(0).getJSONArray("orders").getJSONObject(0);
		if (ordersObject.has("form_fields")) {
			JSONObject formFieldsObject = ordersObject.getJSONObject("form_fields");
			formFieldsObject.put("@type", formFieldsSubType);
		}
		return responseJsonObject.toString();
	}
	
	/**
	 * 
	 * Fetching the test data file from resources folder and then adding the sub type 
	 * @param fileName
	 * 			name of the file to be fetched
	 * @return
	 *  		file data after adding formfield subtype in string format
	 * @throws JSONException 
	 */
	public static String getTestDataWithSubType(String filePath, String subType) throws JSONException {
		String requestData = getTestDataFile(filePath);
		if (null != subType) {
			JSONObject requestJsonObject = new JSONObject(requestData);
			return addMidSettingsSubTypeToRequest(subType, requestJsonObject);
		}
		return requestData;		
	}		
	
	/**
	 * Updating process Id to get a new Process Id
	 * 
	 * @param request
	 * 			request in which process Id has to be changed
	 * @param value
	 * 			value which needs to be updated in place of process Id value
	 * @return
	 */
	public static String updateRequestProcessId(String request, String value){
		String regex = "\"process_id\"\\s*:\\s*\"\\d+\",";
		String[] parts = request.split(regex);
		regex = String.format("\"process_id\":\"%s\",", value);
		return (parts[0] + regex+ parts[1]);
	}
	
	/**
	 * Method to generate random Number	
	 * @return randomId
	 * 				random number generated
	 */
	public static String generateRandomNumber(){
		Random random = new Random();
		int randomNumber = 1000000 + random.nextInt(999999);
		String randomId = String.valueOf(randomNumber);
		return randomId;
	}		
	
	/**
	 * Getting JSON object for JSON data
	 * @param jsonData
	 * 			JSON data string for which JSON object to be fetched
	 * @return
	 * @throws JSONException
	 */
	public static JSONObject getJsonObjectFromString(String jsonData) throws JSONException {
		JSONObject responseJsonObject = new JSONObject(jsonData);
		return responseJsonObject;
	}
	
	/**
	 * Fetching response after adding subtype
	 * @param apiURL
	 * 			host url and port
	 * @param requestData
	 * 			Json Payload
	 * @return
	 * 			response for the sent request data
	 * @throws IOException
	 * @throws JSONException
	 */
	public static String getResponseWithSubtype(Response response, Map<String, String> subTypesWithKey) throws IOException, JSONException {
		log.info("Adding subtype to the response");
		JSONObject responseJsonObject = UtilityService.getJsonObjectFromString(response.asString());
		String responseafterSubTypeAdded = response.asString();
		Iterator<Entry<String, String>> it = subTypesWithKey.entrySet().iterator();
	    while (it.hasNext()) {
	        Map.Entry<String, String> pair = (Map.Entry<String, String>)it.next();
	        responseafterSubTypeAdded = UtilityService.addSubTypeByKeyToResponse(pair.getValue().toString(), pair.getKey().toString(), responseJsonObject);
	    }
		return responseafterSubTypeAdded;
	}
}