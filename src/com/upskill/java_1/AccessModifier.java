
package com.upskill.java_1;

public class AccessModifier {
       
	//Different Access Modifiers in Java
	
	public String name = "Forhad";  //public - any class can access
	
	private int age = 30;           //private - only same class can access
	
	protected int ssn = 12345678;   //protected - class in  the same package and subclass 
	
	String city = "NEW YORK";       //default - classes in same package can access

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	

	
	
	}

 
