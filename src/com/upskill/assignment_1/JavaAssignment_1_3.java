package com.upskill.assignment_1;

public class JavaAssignment_1_3 {

	/*problem 03: 1.  A function which returns the multiply value of a and b where a = 9 and b = 11.      
	Write a program which will display addition of a +b + function returns value.. */
	 
	
	public static void main(String[] args) {
		
		int a = 9;
		int b = 11;
		int multiplyfunctionvalue = multiplyfunction(a,b);
		
		System.out.println("The result is : " + (a+b+multiplyfunctionvalue));
	}	

	
	public static int multiplyfunction(int a, int b){
        return a*b;
	
	
	}
	
	
	}