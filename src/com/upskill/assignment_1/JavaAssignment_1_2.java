package com.upskill.assignment_1;

public class JavaAssignment_1_2 {

	
	/*problem 02: 1.  A rectangle width and length are: 9 and 13 inches.
	 Write a method to display the perimeter of rectangle in console output. */
	 
	
	public static void main(String[] args) {
		rectangleperimeter();
	}			
	
	public static void rectangleperimeter(){
   
	int a = 9;
	int b = 13;
	int result = 2*(a+b);
	System.out.println("The perimeter of the rectangle with arms 9 and 13 is " + result);
	}
	
	
	}