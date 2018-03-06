package com.projectname.service;

import org.apache.log4j.Logger;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

/**
 * This class is for defining methods relating HTMLdumps and other logger activites
 * 
 * @author Optimus
 */
public class TestListener extends TestListenerAdapter {

	Logger logger = Logger.getLogger(TestListener.class);
	private static String ERROR_SYMBOL = " *********";
	private static String TEST_CASE_FAILURE = "***** Error test has failed ";
	private static String TEST_START = "Starting test case ";
	private static String TEST_SKIPPED = "Test SKIPPED ";
	private static String TEST_PASSED = "Test PASSED ";

	/**
	 * log the result on test failure
	 */
	@Override
	public void onTestFailure(ITestResult result) {
		logger.info(TEST_CASE_FAILURE + result.getName() + ERROR_SYMBOL);
	}

	/**
	 * log the result on test passed
	 */
	@Override
	public void onTestSuccess(ITestResult result) {
		logger.info(TEST_PASSED + result.getName() + ERROR_SYMBOL);
	}

	/**
	 * log the result on test start
	 */
	@Override
	public void onTestStart(ITestResult result) {
		logger.info(TEST_START + result.getName() + ERROR_SYMBOL);
	}

	/**
	 * log the result on test skip
	 */
	@Override
	public void onTestSkipped(ITestResult result) {
		logger.info(TEST_SKIPPED + result.getName() + ERROR_SYMBOL);
	}
}