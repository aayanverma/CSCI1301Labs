//*******************************************************
// CircleTester.java

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
//  A client to test the functionality of objects
//  of the class Circle. Use the default constructor
//  in the Circle class to create Circle objects. 
// 
//*******************************************************
public class CircleTester {
	public static final double THRESHOLD = 0.000000001;

	public static void main(String[] args) {

		Circle circle1 = new Circle();
		Circle circle2 = new Circle();
		circle1.setName("Circle 1");
		circle1.setX(0.0);
		circle1.setY(0.0);
		circle1.setRadius(2);
		circle2.setName("Circle 2");
		circle2.setX(2.0);
		circle2.setY(1.0);
		circle2.setRadius(1);
		System.out.println("circle1=" + circle1);
		System.out.println("circle2=" + circle2);

		// If the method setRadius is implemented correctly,
		// a call to setRadius with a negative number
		// will not change the value of the circle's radius.
		//
		circle1.setRadius(-2.0);

		// This is a unit test. It is best to have tests output pass or fail instead of
		// just a bunch of values.
		// Notice how the double comparison is done
		if (Math.abs(2 - circle1.getRadius()) < THRESHOLD)
			System.out.println("PASSED: Set Radius");
		else
			System.out.println("FAILED: Set Radius");

		//
		// Reset the center of circle1 (-3.0,4.0)
		//
		circle1.setX(-3.0);
		circle1.setY(4.0);
		
		//Testing cases but have been commented out in order for grading purposes
		
		//circle1.setX(0.0);
		//circle1.setY(0.0);
		//circle1.setRadius(1.0);
		
		//circle1.setX(5.0);
		//circle1.setY(-3.0);
		//circle1.setRadius(4.0);
		
		//circle2.setX(0.0);
		//circle2.setY(0.0);
		//circle2.setRadius(1.0);
		
		//circle2.setX(5.0)
		//circle2.setY(3.0);
		//circle2.setRadius(8.0);
		

		// print circle1 characteristics (center and radius), use a statement similar
		// to the previous println statements. Note that is not necessary to call
		// the method toString, why?
		System.out.println("center: (" + circle1.getX() + "," + circle1.getY() + ")");
		System.out.println("radius: " + circle1.getRadius());
		// set the circle2 radius to 5.3
		circle2.setRadius(5.3);
		// print circle2 characteristics (center and radius), use a statement similar to
		// the first and
		// second println statements
		System.out.println("center: (" + circle2.getX() + "," + circle2.getY() + ")");
		System.out.println("radius: " + circle2.getRadius());
		// print circle1 diameter, area and perimeter
		System.out.println("diameter: " + circle1.diameter());
		System.out.println("area: " + circle1.area());
		System.out.println("perimeter: " + circle1.perimeter());
		// print circle2 diameter, area and perimeter
		System.out.println("diameter: " + circle2.diameter());
		System.out.println("area: " + circle2.area());
		System.out.println("perimeter: " + circle2.perimeter());
		// display whether circle1 is a unit circle
		System.out.println("is circle 1 a unit circle?: " + circle1.isUnitCircle());
		// display whether circle2 is a unit circle
		System.out.println("is circle 2 a unit circle?: " + circle2.isUnitCircle());
		// your additional tests should be placed below here. Make sure to include at
		// least 3 test cases
		// for each method you write. It is best to write proper unit tests which print
		// pass, fail for each
		// test instead of just dumping values to the screen.
		System.out.println("");
		System.out.println("does circle1 = circle2?: " + circle1.equals(circle2));
		System.out.println("what is distance between circle1 and circle2?: " + circle1.distance(circle2));
		System.out.println("is circle1 smaller than circle2?: " + circle1.isSmaller(circle2));
		System.out.println("which circle has a larger diameter? (circle1 = 1 ; circle2 = -1 ; equal = 0): "
				+ circle1.compareTo(circle2));
		System.out.println("does circle1 and circle2 have intersecting areas?: " + circle1.intersects(circle2));
	}

}
