package com.projectname.apimodulename.testscripts;

import io.restassured.response.Response;

import java.io.IOException;
import org.json.JSONException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.projectname.service.ApiCommunicatorService;
import com.projectname.service.UtilityService;
import com.projectname.utils.BaseTest;

/**
 * Class contains post test cases for Sample API prvided by 'jsonplaceholder.typicode.com'
 * 
 * @author Optimus
 *
 */
public class SampleTestClass2 extends BaseTest {

	private static Logger log;
	private String apiEndPointUrl;

	public SampleTestClass2() throws IOException {
		log = LoggerFactory.getLogger(SampleTestClass2.class);		
		apiEndPointUrl = baseUrl.append(UtilityService.getPropertyFromFile("sampleTestURL")).toString();
	}

	/**
	 * Test Case to print the response of get request
	 * 
	 * @throws IOException
	 * @throws JSONException
	 */
	@Test(description = "To verify and print the response of get request", groups = { "Smoke", "Regression" })
	public void VerifyGetResponse() throws IOException,JSONException {

		// Fetching Response with get request
		log.info("Fetching Response with get request");
		Response response = ApiCommunicatorService.getApiInstance().sendGetRequest(apiEndPointUrl);

		// Print the Output to the Console. This is optional step just for demo
		System.out.println(response.asString());

		// Assertions
		//Add your assertions here. To verify the values, we can use map as we did in class 'SampleTestClass1'
	}
}

