/**
 * Programming Project #3
 * @author Jimmy Espinosa
 *
 */

import java.util.Scanner;
import java.util.InputMismatchException;


public class TemperatureControl {
	
	Scanner sc = new Scanner(System.in);
	

	public static void main(String[] args) throws Exception {

		boolean terminate = false;
		
		
		/* Here we will catch any exception that isn't an integer 
		 * 
		 * Our purpose here is to attempt the programming and later, we'll catch the exception
		 * 
		 * */
		
			do{
				try{
					Scanner sc = new Scanner(System.in);
					
					System.out.println("Welcome to the temperature converter!\n"
							+ "Please select the initial temperture format you want to convert.\n"
							+ "Select 1 for Celsius\nSelect 2 for Fahrenheit\nSelect 3 for Kelvin");
					double format = sc.nextDouble();
				
				
					
		
				
				/* Here begins the calling of the methods */
				if (format == 1){
					System.out.println("You've selected Celsius!");
					System.out.println("Select 1 if you wish to convert to Fahrenheit\nSelect 2 if you wish to convert to Kelvin.");
					double selection = sc.nextDouble();
					
					if(selection == 1){
						System.out.println("Please enter the temperature you with to convert: ");
						double Temp = sc.nextDouble();
						Celsius c1 = new Celsius(Temp);
						
						System.out.println("Your converted temperature from Celsius to Fahrenheit is: "
								+ c1.celsiusToFahrenheit());
						
					} else if (selection == 2){
						System.out.println("Please enter the temperature you with to convert: ");
						double Temp = sc.nextDouble();
						Celsius c2 = new Celsius(Temp);
						
						System.out.println("Your converted temperature from Celsius to Fahrenheit is: "
								+ c2.celsiusToKelvin());
					}						
				} 
				
				/* Convert Fahrenheit to Celsius/Kelvin */
				
				else if (format == 2){
					System.out.println("You've selected Fahrenheit!");
					System.out.println("Select 1 if you wish to convert to Celsius\nSelect 2 if you wish to convert to Kelvin.");
					double selection = sc.nextDouble();
					
					if(selection == 1){
						System.out.println("Please enter the temperature you with to convert: ");
						double Temp = sc.nextDouble();
						Fahrenheit f1 = new Fahrenheit(Temp);
						
						System.out.println("Your converted temperature from Fahrenheit to Celsius is: "
								+ f1.fahrenheitToCelcius());
						
					} else if (selection == 2){
						System.out.println("Please enter the temperature you with to convert: ");
						double Temp = sc.nextDouble();
						Fahrenheit f2 = new Fahrenheit(Temp);
						
						System.out.println("Your converted temperature from Fahrenheit to Kelvin is: "
								+ f2.fahrenheitToKelvin());
					}						
				} 
				
				/* Convert Kelvin to Fahrenheit/Celsius */
				
				else if (format == 3){
					System.out.println("You've selected Kelvin!");
					System.out.println("Select 1 if you wish to convert to Fahrenheit\nSelect 2 if you wish to convert to Celsius.");
					double selection = sc.nextDouble();
					
					if(selection == 1){
						System.out.println("Please enter the temperature you with to convert: ");
						double Temp = sc.nextDouble();
						Kelvin k1 = new Kelvin(Temp);
						
						System.out.println("Your converted temperature from Kelvin to Fahrenheit is: "
								+ k1.kelvinToFahrenheit());
						
					} else if (selection == 2){
						System.out.println("Please enter the temperature you with to convert: ");
						double Temp = sc.nextDouble();
						Kelvin f2 = new Kelvin(Temp);
						
						System.out.println("Your converted temperature from Kelvin to Celsius is: "
								+ f2.kelvinToCelsius());
					}						
				}
		
						sc.close();
						terminate = true;
		
				
		
		/* 
		 * Below is where we'll catch the exception and ask the user to input another value.  
		 */
		
		}catch(InputMismatchException e) {
			System.out.println("Please enter either 1, 2, or 3.");
		} 	
				
		}while (!terminate);
		
			
	}
}

/**
 * 
 *  Exceptions are incredibly important because they are used to allow the program to act eloquently.
 *  If a user inputs an incorrect format or does something that can harm the program, normally, your program would
 *  instantly throw an exception to the user. Which in this case is unattractive. While having exception controls, you can 
 *  control what happens when an exception is thrown. More importantly, you can anticipate where an error can occur and 
 *  plan accordingly. This is especially important when you're asking for input and the received input crashes the program. 
 *  Here, we can create a loop that'll record the exception as well as restart the program or method without it crashing.
 *  Also, printing the exception to a text document is also helpful because we can receive information as to what the exception is as well as
 *  what the input was. Therefore, we can adjust our parameters or exception handling to a higher degree.
 *  
 * 
 */
