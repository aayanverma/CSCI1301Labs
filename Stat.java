/*
 * [Stat].java
 * Author:  [Aayan Verma - 811757663] 
 * Submission Date:  [11 - 12 - 2021]
 *
 * Purpose: The program uses object oriented programming to 
 * take an array of data and sort through the numbers to find the different min 
 * and max values and to find the average and the mode. 
 * It can also call upon different methods to
 * access the private data variable through getData() and setData() 
 * to make the program more functional.
 * It also can compare different sets of data to the original and 
 * can determine whether they are equivalent
 * by using the boolean to report true or false. 
 * By adding more methods, the program is now able to compute 
 * different data sets in floats, int, and long variables.
 * This gives the program more versatility. It can now also compute standard deviation, 
 * and variance in the new package.
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
public class Stat {

	// Instance Variable // Private so that data can only be accessed by getData and
	// setData
	private double[] data;

	// default constructor
	public Stat() {
		data = new double[0];
	}

	// Copying data
	public Stat(double[] d) {
		double data[] = new double[d.length];
		for (int i = 0; i < d.length; i++) {
			data[i] = d[i];
		}
		this.data = data;
	}
	
	public Stat(float[] f) {
		double[] data2 = new double[f.length];
		for(int i = 0; i < f.length; i++) {
			data2[i] = (double)f[i];
			
		}
		data = data2;
	}
	
	public Stat(int[] i) {
		double[] data2 = new double [i.length];
		for (int j = 0; j < i.length; j++) {
			data2[j] = (double)i[j];
		}
		data = data2;
	}
	
	public Stat(long[] lo) {
		double[] data2 = new double [lo.length];
		for (int i = 0; i < lo.length; i++) {
			data2[i] = (double)lo[i];
		}
		data = data2;
	}

	// Intializing getData
	public double[] getData() {
		double d[] = new double[data.length];
		for (int i = 0; i < data.length; i++) {
			d[i] = data[i];
		}
		return d;
	}

	// Setting setData
	public void setData(double[] d) {
		double data[] = new double[d.length];
		for (int i = 0; i < d.length; i++) {
			data[i] = d[i];
		}
		this.data = data;
	}

	// Creating equals Stat s
	// Used to see if both objects calling Stat object and object S have the same
	// values
	public boolean equals(Stat s) {
		boolean result = true;
		if (s.data.length == this.data.length) {
			for (int i = 0; i < s.data.length; i++) {
				if (s.data[i] != this.data[i]) {
					result = false;
				}
			}
		} else {
			result = false;
		}
		return result;
	}

	// String representing data
	public String toString() {
		String returnTemp = "";
		if(data == null || data.length == 0) {
			return "[]";
		}
		else {
			returnTemp += "[";
			for (int i = 0; i < data.length - 1; i++) {
				returnTemp += data[i];
				returnTemp += ", ";
			}
		}
		returnTemp += data[data.length - 1];
		returnTemp += "]";
		return returnTemp;
	}

	// minimum of the array
	public double min() {
		if(isEmpty()) {
			return Double.NaN;
		}
		double min = this.data[0];
		for (int i = 0; i < this.data.length; i++) {
			if (min > data[i]) {
				min = data[i];
			}
		}
		return min;
	}

	// maximum of the array
	public double max() {
		if(isEmpty()) {
			return Double.NaN;
		}
		double max = this.data[0];
		for (int i = 0; i < this.data.length; i++) {
			if (max < data[i]) {
				max = data[i];
			}
		}
		
		return max;
	}

	// average of data array
	public double average() {
		if(isEmpty()) {
			return Double.NaN;
		}
		double sum = 0;
		for (int i = 0; i < this.data.length; i++) {
			sum += this.data[i];
		}
		double average = sum / this.data.length;
		return average;
	}

	// mode of the data array

	public double mode() {
		if(isEmpty()) {
			return Double.NaN;
		}
		int count = 0;
		double mode = this.data[0];
		for (int i = 0; i < this.data.length; i++) {
			int numberCount = 0;
			double number = data[i];
			for (int a = i; a < this.data.length; a++) {
				if (data[a] == data[i]) {
					numberCount++;
				}
			}
			if (numberCount > count) {
				count = numberCount;
				mode = number;
			} else if (numberCount == count) {
				mode = Double.NaN;
			}

		}
		return mode;
	}
	
	//setData method for float
	
	public void setData(float[] f) {
		double[] data2 = new double[f.length];
		for(int i = 0; i < f.length; i++) {
			data2[i] = (double)f[i];
			data = data2;
		}
	}
	
	//setData for integers
	
	public void setData(int[] i) {
		double[] data2 = new double[i.length];
		for(int n = 0; n < i.length; n++) {
			data2[n] = (double) i[n];
			data = data2;
		}
	}
	
	
	//setData for long variables
	
	public void setData(long[] lo) {
		if(lo == null)
			data = new double[0];
		else {
			double[] data2 = new double[lo.length];
			for(int i = 0; i < lo.length; i++) {
				data2[i] = (double) lo[i];
				data = data2;
			}
		}
	}
	
	//reset the array
	
	public void reset() {
		data = new double[0];
	}
	
	//Append data to integers
	
	public void append(int[] i) {
		if(i != null) {
			double[] data2 = new double[i.length + data.length];
			// copies data array into d array
			for (int j = 0; j < data.length; j++) {
				data2[j] = data [j];
			}
			for(int j = 0; j < i.length; j++) {
				data2[j + data.length] = i[j];
			}
			data = data2;
		}
	}
	
	//Append data to doubles
	
	public void append(double[] d) {
		if(d != null) {
			double[] data2 = new double[d.length + data.length];
			// copies data array into d array
			for (int i = 0; i < data.length; i++) {
				data2[i] = data [i];
			}
			for(int i = 0; i < d.length; i++) {
				data2[i + data.length] = d[i];
			}
			data = data2;
		}
	}
	
	//Append data to floats
	
	public void append(float[] f) {
		if(f != null) {
			double[] data2 = new double[f.length + data.length];
			// copies data array into d array
			for (int i = 0; i < data.length; i++) {
				data2[i] = data [i];
			}
			for(int i = 0; i < f.length; i++) {
				data2[i + data.length] = f[i];
			}
			data = data2;
		}
	}
	
	//Append data to long 
	
	public void append(long[] lo) {
		if(lo != null) {
			double[] data2 = new double[lo.length + data.length];
			// copies data array into d array
			for (int i = 0; i < data.length; i++) {
				data2[i] = data [i];
			}
			for(int i = 0; i < lo.length; i++) {
				data2[i + data.length] = lo[i];
			}
			data = data2;
		}
	}
	
	//Check if data array is empty
	
	public boolean isEmpty() {
		if (data.length == 0) {
			return true;
		}
		else 
			return false;
	}
	
	//Loop to see how much a certain value occurs
	
	private int occursNumberOfTimes(double value) {
		int count = 0;
		for(int i = 0; i < data.length; i++) {
			if (value == data[i]) {
				count++;
			}
		}
		return count;
	}
	
	//Method to equate variance, if empty it returns a DOuble.NaN
	//If not sets variance as 0 and loops to keep adding to the variance variable
	
	public double variance() {
		if(isEmpty()) {
			return Double.NaN;
		}
		
		double variance = 0;
		for(int i = 0; i < data.length; i++) {
			variance += (data[i] - average()) * (data[i] - average());
		}
		variance = variance / data.length;
		
		return variance;
	}
	
	//Standard Deviation is the SQRT of variance 
	//Standard Deviation
	
	public double standardDeviation() {
		return Math.sqrt(variance());
	}
	
	
	
	
	
}
