/*
 * [NetPay].java
 * Author:  [Aayan Verma] 
 * Submission Date:  [Submission date here]
 *
 * Purpose: A brief paragraph description of the program. What does it do?
 * This program's intention is to help the user calculate their Net Pay after deductions
 *  using the amount of house have worked as their input.
 * By prompting the user to enter the amount of hours as the variable, 
 * the program calculates the Gross pay by multiplying it by the hourly rate, while
 * also calculating and listing the different deductions from the Gross Pay 
 * and presenting it in order to inform the user on how much money they generated
 * how much will be taken away from them with different mandatory taxes and payments. 
 * This helps the user more quickly calculate their income and how much
 * money they will really be able to save/spend. 
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

public class NetPay {

	public static void main(String[] args) {
		final double FEDERAL_TAX_PERCENT = 10.00; 
		final double STATE_TAX_PERCENT = 4.5;
		final double SS_PERCENT = 6.2;
		final double MEDICARE_PERCENT = 1.45;
		final double PAY_PER_HOUR = 7.25;
	
			Scanner keyboard = new Scanner(System.in);

			System.out.print("Hours per week:\t\t");
			int HoursPerWeek = keyboard.nextInt();

			double GrossPay = (HoursPerWeek * PAY_PER_HOUR);
			System.out.println("Gross Pay:\t\t" + GrossPay);

			double federal = GrossPay * (FEDERAL_TAX_PERCENT / 100);
			double state = GrossPay * (STATE_TAX_PERCENT / 100);
			double social = GrossPay * (SS_PERCENT / 100);
			double medicare = GrossPay * (MEDICARE_PERCENT / 100);
			double netpay = GrossPay - (federal + state + social + medicare);

				System.out.println("Net Pay:\t\t" + netpay);
				System.out.println();
				System.out.println("Deductions\t\t");
				System.out.println("Federal:\t\t" + federal);
				System.out.println("State:\t\t\t" + state);
				System.out.println("Social Security:\t" + social);
				System.out.println("Medicare:\t\t" + medicare);
	
	
	
	}
}