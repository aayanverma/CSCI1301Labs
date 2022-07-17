//*******************************************************
/* Author:  [Aayan Verma - 811757663] 
 * Submission Date:  [8 - 28 - 2021]
 *
 * Purpose: The program Circle uses object oriented programming using 
 * different methods and classes to help define a circle,
 * its radius, area, perimeter and diameter, and compare it to another circle on a 2D plane. 
 * It will also account for other tests such as distance from each other, 
 * whether they have intersecting areas on the plane, and if they are a unit circle.
 * CircleTester is the code which compiles all these different classes and methods
 * to then output a series of System.out.print statements
 * neatly organizing the information calculated and for the user to decipher for their own
 * personal needs. 
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
// 
//*******************************************************
public class Circle {

	private String name; // declare the private String instance name
	private double radius; // declare the private double instance radius
	private double x; // declare the private double instance x
	private double y; // declare the private double instance y

	// Used to compare doubles. Remember, don't compare doubles directly using ==
	public static final double THRESHOLD = 0.000000001;

	// ----------------------------------------------
	// getName - returns the value of name
	// ----------------------------------------------
	public String getName() {
		return name;
		// Your code goes here
	}

	// ----------------------------------------------
	// getX - returns the value of x
	// ----------------------------------------------
	public double getX() {
		return x;
		// Your code goes here
	}

	// ----------------------------------------------
	// getY - returns the value of y
	// ----------------------------------------------
	public double getY() {
		return y;
		// Your code goes here
	}

	// ----------------------------------------------
	// getRadius - returns the value of radius
	// ----------------------------------------------
	public double getRadius() {
		return radius;
		// Your code goes here
	}

	// ----------------------------------------------
	// setName - assigns a new value to name
	// ----------------------------------------------
	public void setName(String newName) {
		name = newName;
		// Your code goes here
	}

	// ----------------------------------------------
	// setX - assigns a new value to x
	// ----------------------------------------------
	public void setX(double newX) {
		x = newX;
		// Your code goes here
	}

	// ----------------------------------------------
	// setY - assigns a new value to y
	// ----------------------------------------------
	public void setY(double newY) {
		y = newY;
		// Your code goes here
	}

	// ----------------------------------------------
	// setRadius - assigns a new value to radius
	// ----------------------------------------------
	public void setRadius(double newRadius) {
		if (newRadius >= 0) {
			radius = newRadius;
		} else {
			radius = radius;
		}
		// Your code goes here
	}

	// --------------------------------------------------------
	// area - returns the area of the circle
	// --------------------------------------------------------
	public double area() {
		return Math.PI * Math.pow(radius, 2);
		// Your code goes here
	}

	// --------------------------------------------------------
	// perimeter - returns the perimeter of the circle
	// --------------------------------------------------------
	public double perimeter() {
		return 2 * Math.PI * radius;
		// Your code goes here
	}

	// --------------------------------------------------------
	// diameter - calculates the diameter of the circle
	// --------------------------------------------------------
	public double diameter() {
		return 2 * radius;
		// Your code goes here
	}

	// --------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	// is 1 and its center is (0,0) and false
	// otherwise.
	// --------------------------------------------------------
	public boolean isUnitCircle() {
		if (Math.abs(radius - 1) < THRESHOLD && Math.abs(x - 0) < THRESHOLD && Math.abs(y - 0) < THRESHOLD) {
			return true;
		} else {
			return false;
		}
		// Your code goes here
	}

	// --------------------------------------------------------
	// toString - return a String representation of
	// this circle in the following format:
	// name: name
	// center:(x,y)
	// radius: r
	// --------------------------------------------------------
	public String toString() {
		return String.format(
				"%n " + "name: " + name + "%n " + "center: " + "(" + x + ", " + y + ")" + "%n " + "radius: " + radius);
		// Your code goes here
	}

	// Implementing a method of public boolean to compare the two circles and see if
	// their radius's and centers are the same
	// If so it will return true, and vice versa
	public boolean equals(Circle anotherCircle) {
		if ((anotherCircle.radius - radius) > THRESHOLD && (anotherCircle.x - x) > THRESHOLD
				&& (anotherCircle.y - y) > THRESHOLD) {
			return true;
		} else
			return false;
	}

	// Returns distance between two centers of each circle using the distance
	// formula
	// Returns as a double which means it will not be rounded up to the nearest
	// whole int
	public double distance(Circle anotherCircle) {
		return Math.sqrt(Math.pow(x - anotherCircle.x, 2) + Math.pow(y - anotherCircle.y, 2));
	}

	// Checks whether the diameter of circle1 is smaller than of circle2
	// Returns true when circle2 diameter is bigger and vice versa
	public boolean isSmaller(Circle anotherCircle) {
		if (diameter() < anotherCircle.diameter()) {
			return true;
		} else
			return false;

	}

	// Compares the two diameters of the circle as based on the size returns an int
	// If circle1 > circle2 it returns a 1; if circle1 < circle2 it returns a -1;
	// and if equal it returns 0
	public int compareTo(Circle anotherCircle) {
		if (diameter() > anotherCircle.diameter()) {
			return 1;
		}
		if (diameter() < anotherCircle.diameter()) {
			return -1;
		} else
			return 0;
	}

	// Checking whether the two circles will have intersecting areas
	// The boolean will return false if not, and true if there is intersecting areas

	public boolean intersects(Circle anotherCircle) {
		if (distance(anotherCircle) < (radius + anotherCircle.radius)) {
			return true;
		} else
			return false;
	}

}
