package com.test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class NumberGuessTestSuite {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(NumberGuessingGameTest.class);
		
		 System.out.println("\n\n*************************************************");
		 System.out.println("\nTest Cases Executed -- > "+result.getRunCount());
		 System.out.println("Failed :"+result.getFailureCount());
		 System.out.println("\n*************************************************");
	}

}
