/*
 * [StringFun].java
 * Author:  [Aayan Verma - 811757663] 
 * Submission Date:  [10 - 14 - 21]
 *
 * Purpose: The program is designed to take the user's desired
 * string and manipulate it with their preferred command.
 * By being able to utilize for, if, else loop
 * statements, the program is able to take the user's string,
 * alter it as many times as need be, and provide the user with
 * the altered version each time, carrying each command over per
 * running of the program.
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

public class StringFun {
	public static void main(String[] args) {

		//Declaring variables and strings to use later
		String userSentence;
		String command;
		String newSentence;
		String lastManipulation;
		char newChar;
		char oldChar;
		char removeAll;
		char remove;
		int removeAt;
		
		//Prompt user to input a non-empty string

		System.out.println("Enter the string to be manipulated");
		Scanner keyboard = new Scanner(System.in);
		userSentence = keyboard.nextLine();

		//Prompt the user to select what they want to do to their string
		do {
			System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
			command = keyboard.nextLine();
			newSentence = "";
			lastManipulation = "";
			if (!command.equalsIgnoreCase("reverse") && !command.equalsIgnoreCase("replace first")
					&& !command.equalsIgnoreCase("replace last") && !command.equalsIgnoreCase("remove all")
					&& !command.equalsIgnoreCase("remove") && !command.equalsIgnoreCase("quit")) {
				System.out.println("Command invalid. Try again");
				System.out.println(
						"Please enter one of the commands (reverse, replace first, replace last, remove all, remove, quit)");
				command = keyboard.nextLine();
				System.out.println("...Execution Continues...");
			}
			//If statements correlating to reversing the string
			if (command.equalsIgnoreCase("reverse")) {
				for (int reverse = (userSentence.length() - 1); reverse > -1; reverse--) {
					newSentence += userSentence.charAt(reverse);
				}
				userSentence = newSentence;
				System.out.println("The new sentence is: " + userSentence);
			}
			//If statements to replace the first instance of a letter, the other for loop is to decipher between the string
			if (command.equalsIgnoreCase("replace first")) {
				System.out.println("Enter the character to replace");
				oldChar = keyboard.next().charAt(0);
				keyboard.nextLine();
				System.out.println("Enter the new character");
				newChar = keyboard.next().charAt(0);
				keyboard.nextLine();

				int j = -1;
				for (int replaceInt = 0; replaceInt < userSentence.length(); replaceInt++) {
					if (j < 0 && oldChar == userSentence.charAt(replaceInt)) {
						newSentence += newChar;
						j = replaceInt;
					} else {
						newSentence += userSentence.charAt(replaceInt);
					}
				}
				if (newSentence.equals(userSentence)) {
					System.out.println("The letter was not found in the word");
				} else {
					userSentence = newSentence;
					System.out.println("The new sentence is: " + userSentence);
				}
			}

			//If statement to process the replacing of the last of the user's desired letter in the string
			if (command.equalsIgnoreCase("replace last")) {
				System.out.println("Enter character to replace");
				oldChar = keyboard.next().charAt(0);
				keyboard.nextLine();
				System.out.println("Enter a new character");
				newChar = keyboard.next().charAt(0);
				keyboard.nextLine();

				int j = -1;
				for (int replaceInt = (userSentence.length() - 1); replaceInt > -1; replaceInt--) {
					if (j < 0 && oldChar == userSentence.charAt(replaceInt)) {
						newSentence += newChar;
						;
						j = replaceInt;
					} else {
						newSentence += userSentence.charAt(replaceInt);
					}
				}
				for (int reverse = (userSentence.length() - 1); reverse > -1; reverse--) {
					lastManipulation += newSentence.charAt(reverse);
				}
				if (lastManipulation.equals(userSentence)) {
					System.out.println("The letter was not found in the word");
				} else {
					userSentence = lastManipulation;
					System.out.println("The new sentence is: " + userSentence);
				}
			}
			//If and for statement to check each letter of the string and remove all the desired letters
			if (command.equalsIgnoreCase("remove all")) {
				System.out.println("Enter the character to remove");
				removeAll = keyboard.next().charAt(0);
				keyboard.nextLine();

				for (int a = 0; a < userSentence.length(); a++) {
					if (removeAll != userSentence.charAt(a)) {
						newSentence += userSentence.charAt(a);
					}
				}
				if (newSentence.equals(userSentence)) {
					System.out.println("Error: the letter you are trying to remove does not exist");
				} else {
					userSentence = newSentence;
					System.out.println("The new sentence is: " + userSentence);
				}
			}
			//If statement to go through the string and remove the user's desired character
			if (command.equalsIgnoreCase("remove")) {
				System.out.println("Enter the character to remove");
				remove = keyboard.next().charAt(0);
				System.out.println(
						"Enter the " + remove + " you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.):");
				removeAt = keyboard.nextInt();
				keyboard.nextLine();
				int count = 0;

				for (int index = 0; index < userSentence.length(); index++) {
					if (remove != userSentence.charAt(index))
						newSentence += userSentence.charAt(index);
					else {
						count++;
						if (count != removeAt)
							newSentence += userSentence.charAt(index);
					}
				}
				if (newSentence.equals(userSentence)) {
					System.out.println("Error: the letter you are trying to remove does not exist");
				} else {
					userSentence = newSentence;
					System.out.println("The new sentence is: " + userSentence);
				}
			}

		} 
		//If the user inputs quit the program will exit
		while (!command.equalsIgnoreCase("quit"));
		System.out.println("...Execution Ends...");
		System.exit(0);

	}
}
