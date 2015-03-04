package com.test;

import java.util.Scanner;

public class RunNumberGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		String strData; // Variable to hold input from Console
		Scanner input = new Scanner(System.in);
		System.out.println("Guess a Number between 1-100 and type 'ready to continue");
		strData = input.nextLine().toString();
		//Starting Point For the user to type "ready" to continue
		
		while(!strData.equalsIgnoreCase("ready"))
		{
	       System.out.println("Please type 'ready' to continue ..");
	       strData = input.nextLine().toString();
		}
		
		NumberGuessingGame game = new NumberGuessingGame();
		game.maxNumberLimit = 100;
		game.guessNumber(null);
		
		
	}

}
