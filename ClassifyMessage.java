/*
 * [ClassifyMessage].java
 * Author:  [Aayan Verma] 
 * Submission Date:  [Sept. 23 2021]
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do? 
 * The program is intended to help classify messages in case of natural disaster
 * in order to discern quicker what is the messages purpose and and its location,
 * whether it is in the desired range or not. 
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

public class ClassifyMessage {

	enum MessageCategory {
		NEED, OFFER, ALERT, INFO, UNKNOWN
	}

	public static void main(String[] args) {

		// Declaring Variables
		String catString;
		String payload;
		double latitude;
		double longitude;
		boolean isInRange;
		MessageCategory category;

		double north = 40.231215;
		double south = 39.882343;
		double west = -105.743511;
		double east = -104.907864;

		// Initializing Scanner
		Scanner keyboard = new Scanner(System.in);

		// Prompt user to enter formatted message
		System.out.println("Please enter a formatted message:");
		catString = keyboard.next().trim();
		latitude = keyboard.nextDouble();
		longitude = keyboard.nextDouble();
		payload = keyboard.nextLine().trim();

		// If-else statements to classify message category
		if (catString.equalsIgnoreCase("smoke") || catString.equalsIgnoreCase("fire")) 
			category = MessageCategory.ALERT;
		else if (catString.equalsIgnoreCase("need"))
			category = MessageCategory.NEED;
		else if (catString.equalsIgnoreCase("offer"))
			category = MessageCategory.OFFER;
		else if (catString.equalsIgnoreCase("structure") || catString.equalsIgnoreCase("road")
				|| catString.equalsIgnoreCase("photo") || catString.equalsIgnoreCase("evac"))
			category = MessageCategory.INFO;
		else
			category = MessageCategory.UNKNOWN;

		// If-else statements to determine if message is in range
		if ((latitude >= south) && (latitude <= north) && (longitude >= west) && (longitude <= east))
			isInRange = true;
		else
			isInRange = false;

		// Print Statements
		System.out.println("Category:\t" + category);
		System.out.println("Raw Cat:\t" + catString);
		System.out.println("Message:\t" + payload);
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitude:\t" + longitude);
		System.out.println("In Range:\t" + isInRange);

	}
}
