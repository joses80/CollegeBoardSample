package com.test;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * 
 * 
 * Class For NumberGuessing
 * Supports For Guessing Number From 1-100 - Can Be Modified by changing the orgNumber variable
 *
 */
public class NumberGuessingGame {

	//The variable can be changed by the calling Class
	public int maxNumberLimit = 100;
	
	
	public boolean guessNumber(InputStream in)
	{
		String strData; // Variable to hold input from Console
		boolean isNumberGuessed = false; // Variable to break the while loop once the number is found
		int intMaxLimit = maxNumberLimit + 1;
		int intCurrentLimit = intMaxLimit/2; // Starting Checkpoint From Mid Point
		int intLowLimit = intCurrentLimit ; // Lower Limit
		int counter = 0;
		boolean bleadded = false;
		Scanner input = null;
		/**
		 * Null Check and Empty Check on the Input Stream
		 * Automatic Mode - Scenario when the data set is pre-defined(example code tested with Unit test case with 
		 * pre-defined data)
		 */
		if(in!=null)
		{
			 input = new Scanner(in);
			 try {
				if(in.available()==0)
		     	return isNumberGuessed;
		    
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		/**
		 * Create input with System.in and prompt user for input
		 * User Input Mode
		 */
		else
		{
			input = new Scanner(System.in);
		}
			 
			while(!isNumberGuessed)
			{
				
				System.out.println("Is the Number "+intCurrentLimit);
				strData = input.nextLine().toString();
		       
				//Lower Limit Check Point
		        if(strData.equalsIgnoreCase("lower"))
				{
		        	counter++;
		        	if(!bleadded)
		        	{
		        		intMaxLimit = intCurrentLimit; // Max Limit Set same as the Lower Limit
		        		//Keep on finding lower limit by finding mid point and decreasing the range
		        		intCurrentLimit = intCurrentLimit/2; 
		        		
		        	}
		        	//If the is Max limit and Current Limit is different
		        	else
		        	{
		        		intMaxLimit = intCurrentLimit; // Setting Max Limit 
		        		intCurrentLimit =  (intMaxLimit + intLowLimit)/2; // Updating the current limit
		        
		        	}
		        	
				}
		        else if(strData.equalsIgnoreCase("higher"))
		        {
		        	counter++;
		        	bleadded = true;
		        	int temp = intCurrentLimit;
		        	intCurrentLimit =  (intMaxLimit +intCurrentLimit)/2; //Updating the Current Limit
		        	intLowLimit = temp; // Setting the new Low Limit
		        	
		        }
		        //Once the result has bee guessed
		        else if(strData.equalsIgnoreCase("yes"))
		        {
		         System.out.print("Great!! Guessed on "+counter+ "th time");
		         isNumberGuessed = true; 
		        }
		        
		        else if(strData.equalsIgnoreCase("Exit"))
		        {
		         System.out.print("Exiting Program!!");
		         isNumberGuessed = true; 
		        }
		        
		        else
		        {
		          System.out.println("Please select a valid option (Yes / Lower / Higher / Exit");
		        }
			}
		
		
		
		return isNumberGuessed;
		
	}
	

}
