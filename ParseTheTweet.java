/*
 * [ParseTheTweet].java
 * Author:  [Aayan Verma - 811757663] 
 * Submission Date:  [9-16-2021]
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do?
 *
 * The program's intent is to decipher a coded tweet to help
 * simplify the content into simple phrases helping the user
 * figure out the necessary details quicker. By being able to provide  
 * a location and details, the user is better equipped with the 
 * knowledge on how to differentiate during a natural disaster. 
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

public class ParseTheTweet {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		// Enter the user's tweet
		System.out.println("Enter a tweet below");
		String tweet = keyboard.nextLine();

		// Variable Declarations
		int hashtag;
		int semicolon;
		String type;
		String detail;
		String location;
		String latitude;
		String longitude;

		// Output

		hashtag = tweet.indexOf('#');
		semicolon = tweet.indexOf(';');

		type = tweet.substring(hashtag + 4, semicolon).toUpperCase();
		type = type.trim();

		tweet = tweet.substring(semicolon + 2);

		hashtag = tweet.indexOf('#');
		semicolon = tweet.indexOf(';');

		detail = tweet.substring(hashtag + 4, semicolon);
		detail = detail.trim();

		tweet = tweet.substring(semicolon + 2);

		hashtag = tweet.indexOf('#');
		semicolon = tweet.indexOf(';');

		location = tweet.substring(hashtag + 4, semicolon);
		location = location.trim();

		tweet = tweet.substring(semicolon + 2);

		hashtag = tweet.indexOf('#');
		semicolon = tweet.indexOf(';');

		latitude = tweet.substring(hashtag + 4, semicolon);
		latitude = latitude.trim();

		tweet = tweet.substring(semicolon + 2);

		hashtag = tweet.indexOf('#');
		semicolon = tweet.indexOf(';');

		longitude = tweet.substring(hashtag + 4, semicolon);
		longitude = longitude.trim();

		// System.out.print statements
		System.out.println("Type:\t\t" + type);
		System.out.println("Detail:\t\t" + detail.replace(",", "-"));
		System.out.println("Location:\t" + location.replace(",", "-"));
		System.out.println("Latitude:\t" + latitude);
		System.out.println("Longitude:\t" + longitude);

	}
}