package com.test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;

import org.junit.Test;

public class NumberGuessingGameTest {

	@Test
	public void testGuessNumberYes() {

		ByteArrayInputStream in = new ByteArrayInputStream(
				"Higher\nHigher\nHigher\nHigher\nhigher\nHIGHER\nyes"
						.getBytes());
		System.setIn(in);
		NumberGuessingGame numberGuessingGame = new NumberGuessingGame();
		assertSame(true, numberGuessingGame.guessNumber(in));
	}

	/**
	 * Max Trial Guess with Case Sensitive Test
	 */
	@Test
	public void testGuessNumberMaxTrialHighest() {

		ByteArrayInputStream in = new ByteArrayInputStream(
				"Higher\nHigher\nHigher\nHigher\nhigher\nHIGHER\nyes"
						.getBytes());
		System.setIn(in);
		NumberGuessingGame numberGuessingGame = new NumberGuessingGame();
		assertSame(true, numberGuessingGame.guessNumber(in));
	}

	/**
	 * Max Trial Lowest Guess with Case Sensitive Test
	 */
	@Test
	public void testGuessNumberMaxTrialLowestCase() {

		ByteArrayInputStream in = new ByteArrayInputStream(
				"Lower\nLower\nLower\nLower\nlower\nLOWER\nyes".getBytes());
		System.setIn(in);
		NumberGuessingGame numberGuessingGame = new NumberGuessingGame();
		assertSame(true, numberGuessingGame.guessNumber(in));
	}

	
	/**
	 * Empty Stream Test Case
	 */
	@Test
	public void testGuessNumberEmpty() {

		ByteArrayInputStream in = new ByteArrayInputStream("".getBytes());
		System.setIn(in);
		NumberGuessingGame numberGuessingGame = new NumberGuessingGame();
		assertSame(false, numberGuessingGame.guessNumber(in));
	}

	/**
	 * Test Case on Exit
	 */
	@Test
	public void testGuessNumberExit() {

		ByteArrayInputStream in = new ByteArrayInputStream("Exit".getBytes());
		System.setIn(in);
		NumberGuessingGame numberGuessingGame = new NumberGuessingGame();
		assertSame(true, numberGuessingGame.guessNumber(in));

	}

	/**
	 * Invalid and Exit Scenario
	 */
	@Test
	public void testGuessNumberInvalidExit() {

		ByteArrayInputStream in = new ByteArrayInputStream(" \nExit".getBytes());
		System.setIn(in);
		NumberGuessingGame numberGuessingGame = new NumberGuessingGame();
		assertSame(true, numberGuessingGame.guessNumber(in));

	}

	/**
	 * Success Test Case Invalid - Higher - Yes
	 */
	@Test
	public void testGuessNumberInvalidHigherYes() {

		ByteArrayInputStream in = new ByteArrayInputStream(
				"Invalid\nHigher\nYes".getBytes());
		System.setIn(in);
		NumberGuessingGame numberGuessingGame = new NumberGuessingGame();
		assertSame(true, numberGuessingGame.guessNumber(in));

	}

	/**
	 * Success Test Case Lower - Higher - Yes
	 * 
	 */
	@Test
	public void testGuessNumberLowerHigherYes() {

		ByteArrayInputStream in = new ByteArrayInputStream(
				"Lower\nHigher\nYes".getBytes());
		System.setIn(in);
		NumberGuessingGame numberGuessingGame = new NumberGuessingGame();
		assertSame(true, numberGuessingGame.guessNumber(in));
	}

	/**
	 * Success Test Case Higher - Lower - Yes
	 * 
	 */
	@Test
	public void testGuessNumberHigherLowerYes() {

		ByteArrayInputStream in = new ByteArrayInputStream(
				"Higher\nLower\nYes".getBytes());
		System.setIn(in);
		NumberGuessingGame numberGuessingGame = new NumberGuessingGame();
		assertSame(true, numberGuessingGame.guessNumber(in));
	}

	/**
	 * Success Test Case Higher - Yes
	 * 
	 */
	@Test
	public void testGuessNumberHigherYes() {

		ByteArrayInputStream in = new ByteArrayInputStream(
				"Higher\nYes".getBytes());
		System.setIn(in);
		NumberGuessingGame numberGuessingGame = new NumberGuessingGame();
		assertSame(true, numberGuessingGame.guessNumber(in));

	}

	/**
	 * Success Test Case Higher - Yes
	 * 
	 */
	@Test
	public void testGuessNumberLowerYes() {

		ByteArrayInputStream in = new ByteArrayInputStream(
				"Lower\nYes".getBytes());
		System.setIn(in);
		NumberGuessingGame numberGuessingGame = new NumberGuessingGame();
		assertSame("Expected", true, numberGuessingGame.guessNumber(in));
	}

}
