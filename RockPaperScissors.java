/*
 * [RockPaperScissors].java
 * Author:  [Aayan Verma - 811757663] 
 * Submission Date:  [10 - 7 - 21]
 *
 * Purpose: The purpose of the program is to create a rock paper scissors game
 * versus the computer. It takes the input of the user and a randomly generated
 * choice bythe computer and pits it against one another to
 * create a game which goes until the points to win has been acheieved 
 * by either side. By using loops and nested loops it 
 * is able to prompt the user until input is valid and
 * uses a loop to decide who is the winner.
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

public class RockPaperScissors {
	public static void main(String[] args) {

		// Declaring variables to use during program
		String userMove;
		String computerMove;
		String computerMessage = "The computer chose ";
		int userScore = 0;
		int computerScore = 0;

		// Initializing scanner
		Scanner keyboard = new Scanner(System.in);

		// Points to win System.out.print
		System.out.print("Points to win: ");
		int pointsToWin = keyboard.nextInt();

		// this line is added to avoid skipping the next nextLine
		keyboard.nextLine();
		// While loop to determine when a winner and when a winner has been decided
		while (userScore < pointsToWin && computerScore < pointsToWin) {
			System.out.print("Rock, paper, or scissors? ");
			// remove extra whitespace and convert all to lower-case to match computer choice
			userMove = keyboard.nextLine().replaceAll("\\s+", "").toLowerCase();
			// while loop if user input is not valid
			while (!(userMove.equals("rock") || userMove.equals("paper") || userMove.equals("scissors"))) {
				System.out.print("Rock, paper, or scissors? ");
				userMove = keyboard.nextLine().replaceAll("\\s+", "").toLowerCase();
			}
			// Get computer's move from provided code
			computerMove = ComputerOpponent.getMove();
			if (computerMove.equals(userMove)) {
				System.out.print(
						computerMessage + computerMove + ", so it's a tie. (" + userScore + "-" + computerScore + ")");
			} else { // Computing a computer victory
				if ((computerMove.equals("rock") && userMove.equals("scissors"))
						|| (computerMove.equals("scissors") && userMove.equals("paper"))
						|| (computerMove.equals("paper") && userMove.equals("rock"))) {
					computerScore++;
					System.out.println(computerMessage + computerMove + ", so you lose. (" + userScore + "-"
							+ computerScore + ")");
				}
				// Computing a user win
				else {
					userScore++;
					System.out.println(
							computerMessage + computerMove + ", so you win! (" + userScore + "-" + computerScore + ")");

				}
			}
		}

		// Printing out when pointsToWin is reached
		if (userScore == pointsToWin)
			System.out.println("Congratulations! You Won!");
		else
			System.out.println("Sorry, you lost. Better luck next time!");

	}
}
