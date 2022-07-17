/*
 * [TemperatureConverter].java
 * Author:  [Aayan Verma - 811757663] 
 * Submission Date:  [10 - 1 - 2021]
 *
 * Purpose: The program is intended to take the user's input
 * of a temperature in fahrenheit and calculate it to find the
 * equivalent in 4 other temperature scales. This way they
 * can find the correct value they are looking for in different
 * scales for their needs. The program used the debugger and 
 * breakpoints to also demonstrate how to fix bugged programs
 * way quicker, indentifying syntax errors and expression errors
 * throughout the program.
 *
 * Statement of Academic Honesty:
 *
 * The following code represents my own work. I have neither
 * received nor given inappropriate assistance. I have not copied
 * or modified code from any source other than the course webpage
 * or the course textbook. I recognize that any unauthorized
 * assistance or plagiarism will be handled in accordance with
 * the University of Georgia's Academic Honesty Policy and the
 * policies of this course. I recognize that my work is based
 * on an assignment created by the Department of Computer
 * Science at the University of Georgia. Any publishing 
 * or posting of source code for this assignment is strictly
 * prohibited unless you have written consent from the Department
 * of Computer Science at the University of Georgia.  
 */

/**
 *
 * File name: TemperatureConverter.java
 *
 *This program does the following:
 *Prompts the user to enter a temperature in Fahrenheit and a
 *temperature scale the user wants to convert it to. If both the temperature in Fahrenheit  and
 *the temperature scale are valid, the program converts the temperature in Fahrenheit to 
 *the specified temperature scale and displays the converted value.
 *
*/

import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args) {

		// Declare named constants.

		final double MIN_FAHRENHEIT = -459.67;

		// Verifying the variable works
		// System.out.println(MIN_FAHRENHEIT);

		// Declare the variables.

		double fahrenheit;
		double convertedDegrees;
		int tempScale;
		String tempScaleStr = "";

		// Creating the Scanner object
		Scanner keyboard = new Scanner(System.in);

		// Prompting the user to input desired Fahrenheit temperature
		System.out.print("Enter the temperature in Fahrenheit: ");
		fahrenheit = keyboard.nextDouble(); // Set a breakpoint here

		// Verify the user's input
		if (fahrenheit < MIN_FAHRENHEIT) { // first if-statement: Set a breakpoint here
			System.out.print("The temperature must be greater than or equal to " + MIN_FAHRENHEIT);
			System.exit(0);
		}
		// Prompting user to select which scale they would like to calculate their input
		// into
		System.out.print("Enter the temperature scales you want to convert to:\n" + "1. Kelvin \n" + "2. Rankine \n"
				+ "3. Reaumur \n" + "4. Celsius\n" + "Enter a temperature scale: ");
		tempScale = keyboard.nextInt();

		// If Statement to decide whether the scale inputed is a valid scale presented
		// in program
		if (tempScale < 1 && tempScale > 4) { // Second-if statement: Set a breakpoint here
			System.out.println("Unknown temperature scale  -" + "  cannot do calculation. Bye");
		} else {
			if (tempScale == 1) { // Set a breakpoint here
				convertedDegrees = (fahrenheit - (MIN_FAHRENHEIT)) * (5) / (9);
				tempScaleStr = "Kelvin";
			} else if (tempScale == 2) {
				convertedDegrees = fahrenheit - MIN_FAHRENHEIT;
				tempScaleStr = "Rankine";

			} else if (tempScale == 3) {
				convertedDegrees = (fahrenheit - 32) * (4) / (9); // Set a breakpoint here
				tempScaleStr = "Reamur";

			} else {
				convertedDegrees = (fahrenheit - 32) * (5) / (9); // Set a breakpoint here
				tempScaleStr = "Celsius";
			}
			// System.out.print statement to evaluate the new converted temperature
			System.out.println(
					fahrenheit + " degrees Fahrenheit is " + convertedDegrees + " degrees " + tempScaleStr + ".");
		}
	}
}
