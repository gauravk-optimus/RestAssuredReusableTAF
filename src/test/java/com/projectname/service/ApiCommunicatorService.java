package com.projectname.service;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.io.IOException;

import org.json.JSONException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * "ApiCommunicatorService" class is used for sending Post Requests
 * 
 * @author Optimus
 *
 */

public class ApiCommunicatorService {
	
	private static ApiCommunicatorService apiCommunicatorService;
	private static Logger log = LoggerFactory.getLogger(ApiCommunicatorService.class);
    
	private ApiCommunicatorService(){
		
	}
	
	public static ApiCommunicatorService getApiInstance() {
		if (apiCommunicatorService == null) {
			apiCommunicatorService = new ApiCommunicatorService();
		}
		return apiCommunicatorService;
	}
	
	/**
	 * Sending Post Requests
	 * 
	 * @param apiURL
	 * 			host url and port
	 * @param requestData
	 * 			Jaison Payload
	 * @return
	 * 			response for the sent request data
	 * @throws IOException
	 * @throws JSONException
	 */
	public Response sendPostRequest(String apiURL, String requestData) throws IOException, JSONException {
		
		RestAssured.baseURI = apiURL;
		RequestSpecBuilder builder = new RequestSpecBuilder();
		RequestSpecification requestSpec = builder.build();
		builder.setBody(requestData);
		builder.setContentType(ContentType.JSON);
		RequestSpecification request = RestAssured.given().spec(requestSpec).contentType(ContentType.JSON).body(requestData);
		Response response = (Response) request.post(apiURL, new Object[0]);
		log.info("Response has been returned as a response Object after post operation");
		response.then().log().all();		
		return response;
	}
	
	/**
	 * Sending Get Requests
	 * 
	 * @param apiURL
	 * 			host url and port
	 * @return
	 * 			response for the sent request data
	 * @throws IOException
	 * @throws JSONException
	 */
	public Response sendGetRequest(String apiURL) throws IOException, JSONException {
		
		RestAssured.baseURI = apiURL;
		RequestSpecBuilder builder = new RequestSpecBuilder();
		RequestSpecification requestSpec = builder.build();
		builder.setContentType(ContentType.JSON);
		RequestSpecification request = RestAssured.given().spec(requestSpec).contentType(ContentType.JSON);
		Response response = (Response) request.get(apiURL, new Object[0]);
		log.info("Response has been returned as a response Object after get operation");
		response.then().log().all();		
		return response;
	}
	
	/**
	 * Sending Put Requests 
	 * @param apiURL
	 * 			host url and port
	 * @return
	 * 			response for the sent request data
	 * @throws IOException
	 * @throws JSONException
	 */
	public Response sendPutRequest(String apiURL) throws IOException, JSONException {
		
		RestAssured.baseURI = apiURL;
		RequestSpecBuilder builder = new RequestSpecBuilder();
		RequestSpecification requestSpec = builder.build();
		builder.setContentType(ContentType.JSON);
		RequestSpecification request = RestAssured.given().spec(requestSpec).contentType(ContentType.JSON);
		Response response = (Response) request.put(apiURL, new Object[0]);
		log.info("Response has been returned as a response Object after put operation");
		response.then().log().all();		
		return response;
	}
	
	/**
	 * Sending Delete Requests 
	 * @param apiURL
	 * 			host url and port
	 * @return
	 * 			response for the sent request data
	 * @throws IOException
	 * @throws JSONException
	 */
	public Response sendDeleteRequest(String apiURL) throws IOException, JSONException {
		
		RestAssured.baseURI = apiURL;
		RequestSpecBuilder builder = new RequestSpecBuilder();
		RequestSpecification requestSpec = builder.build();
		builder.setContentType(ContentType.JSON);
		RequestSpecification request = RestAssured.given().spec(requestSpec).contentType(ContentType.JSON);
		Response response = (Response) request.delete(apiURL, new Object[0]);
		log.info("Response has been returned as a response Object after delete operation");
		response.then().log().all();		
		return response;
	}
}