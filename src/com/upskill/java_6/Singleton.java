package com.upskill.java_6;

public class Singleton {

	//Singleton is class that can have only one object

	//
	private Singleton(){
		
}		
	
  //private static object of the class
	private static  Singleton SingletonObj = new Singleton();
	
	//public static instance method
	public static  Singleton getInstance(){
		return SingletonObj;
}	
		
	protected static void upskill(){
		System.out.println("Upskill method from Singletone Class ");
	}

}
