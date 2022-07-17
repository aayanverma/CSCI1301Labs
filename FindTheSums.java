/*
 * [FindTheSums].java
 * Author:  [Aayan Verma - 811757663] 
 * Submission Date:  [11 - 17 - 2021]
 *
 * Purpose: The purpose of the program is
 * to find the vertical and horizontal sums within a 2D array
 * using for loops and different methods to call within the
 * FindTheSumsTester class in order to calculate the sums within
 * the array.
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

public class FindTheSums {
	//method to return 2d array to a string
		public static String arrayToString(int[] [] a) {
			String s = "";
			for(int i = 0; i < a.length; i++) {
				for(int j = 0; j < a[0].length; j++) {
					s += a[i][j];
					//add a space between digits if not last element
					if (j < a[0].length - 1)
						s += " ";
				}
				//new line if not
				if (i < a.length - 1)
					s += "\n";
			}
			return s;
		}
		
		//returns find horizontal sum
		public static int[][] horizontalSums(int[][] a, int sumToFind) {
			int[][] b = new int [a.length][a[0].length];
			for(int i = 0; i < b.length; i++) 
				for(int j = 0; j < b[0].length; j++)
					//elements in b to be 0
					b[i][j] = 0;
			//Search for the sums
			for (int i = 0; i < a.length; i++) {
				for(int j = 0; j < a[0].length; j++) {
					int sum = 0, track = 0;
					//find possible sums with search loop
					for (int k = j; k < a[0].length; k++) {
						if (sum < sumToFind) {
							sum += a[i][k];
							track++;
						}
					}
					if (sum == sumToFind) {
						for (int k = 0; k < track; k++)
							b[i][j + k] = a[i][j + k];
					}
					
				}
				
			}
			return b;
		}
		
		//find all vertical sums and return b 
		public static int[][] verticalSums(int[][] a, int sumToFind) {
			//array b = array a
			int[][] b = new int[a.length][a[0].length];
			for(int i = 0; i < b.length; i++)
				for (int j = 0; j < b[0].length; j++)
					b[i][j] = 0;
			
			//Search loop
			for (int i = 0; i < a[0].length; i++) {
				for(int j = 0; j < a.length; j++) {
					int sum = 0, track = 0;
					for(int k = j; k < a.length; k++) {
						if (sum < sumToFind) {
							sum += a[k][i];
							track++;
						}
					}
					if (sum == sumToFind) {
						for (int k = 0; k < track; k++) {
							b[j + k][i] = a[j + k][i];
						}
					}
				}
			}
				return b;
		}
		
		
}
