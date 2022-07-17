/*
 * [StarGraph].java
 * Author:  [Aayan Verma - 811757663] 
 * Submission Date:  [10 - 20 - 2021]
 *
 * Purpose: The program is meant to take the user input of an x value,
 * how many times the x value should be incremented, and the increment
 * and then prints out each value per increment and then prints out the amount of
 * stars per x value, rounding the decimal down. This program uses 2 arrays and
 * consistently outputs each x value increment and the y value for it using the function 
 * (y = 20.0 * |sin x| ). 
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

import java.util.Scanner;

public class StarGraph {
	public static void main(String[] args) {
		// Initializing Scanner and Variables
		Scanner keyboard = new Scanner(System.in);
		int xValues;
		double minValue;
		double increment;

		System.out.print("Please enter the number of x values to process: ");
		xValues = keyboard.nextInt();

		// Cannot compute if x < 0

		if (xValues > 0) {
			System.out.print("Enter a minimum value for x: ");
			minValue = keyboard.nextDouble();
			keyboard.nextLine();
			System.out.print("Enter the amount to increment x: ");
			increment = keyboard.nextDouble();
			keyboard.nextLine();
			// Checking whether the increment is positive or not
			if (increment > 0) {
				double[] xArray = new double[xValues];
				double[] yArray = new double[xValues];
				double x = minValue;
				double y = 0;
				System.out.println();
				// Math to print values as doubles so the decimal place shows
				System.out.println("Values");
				xArray[0] = minValue;
				yArray[0] = (20.0 * Math.abs(Math.sin(xArray[0])));
				System.out.println(
						"x: " + String.format("%.3f", xArray[0]) + ", " + "y: " + String.format("%.3f", yArray[0]));

				// For loops to initialize arrays and solve for y per increment
				for (int i = 1; i < xArray.length; i++) {
					x = increment + x;
					xArray[i] += x;
					y = (20.0 * Math.abs(Math.sin(xArray[i])));
					yArray[i] += y;
					System.out.println(
							"x: " + String.format("%.3f", xArray[i]) + ", " + "y: " + String.format("%.3f", yArray[i]));
				}
				System.out.println();

				// For loops to print out star graph, using the array

				System.out.println("Graph");

				for (int i = 0; i < xArray.length; i++) {
					System.out.print(": ");
					yArray[i] = Math.floor(yArray[i]);

					for (int j = 0; j < yArray[i]; j++) {
						System.out.print("*");
					}
					System.out.println();
				}
			}
			// If increment is negative
			else {
				System.out.println("The increment must be a decimal number greater than 0.");
			}

		}
		// If the xValues integer is negative
		else {
			System.out.println("The number of x values must be an integer greater than 0.");
		}

	}
}
