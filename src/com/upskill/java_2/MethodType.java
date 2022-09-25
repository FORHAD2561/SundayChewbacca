package com.upskill.java_2;

public class MethodType {

	/*type of Method 
	1.void method
	2. static Method
	3. Return Type method */
	
	public static int hourlyIncome= 65;
	
	public static void main(String[] args) {
		
	MethodType obj = new MethodType();
	obj.annualIncomeVoid();	
	weeklyIncomeStatic();	
	System.out.println("My mounthly Income = " + obj.mountlyIncomeReturn());	
	
	}
      
	//void method
	public  void annualIncomeVoid(){
	int annualIncome = hourlyIncome * 2000;
	System.out.println("My Annual Income = " + annualIncome);
}

	
	//static method
	public static void weeklyIncomeStatic(){
	int weeklyIncome =  hourlyIncome * 40;
	System.out.println("My weekly Income = " + weeklyIncome);
	
	}	
	
	//Return Type Method
	public int mountlyIncomeReturn(){
	int mountlyIncome = hourlyIncome * 180;
	return mountlyIncome;
}

}
	

