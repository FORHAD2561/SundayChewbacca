package com.upskill.java_4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

import javax.swing.plaf.synth.Region;

public class Array_hashmap_hashset_hashTable {

	public static void main(String[] args) {
		//Array store multipul data using index
		
		
		int age = 30;                                                //variable
		
		int[] ageChewbacca = new int[]{24, 45, 29, 25, 33, 28};      //Array
		//Array Index                  0    1   2   3   4    5
		
		System.out.println("Student age : " + ageChewbacca[5] );
		
		String[] nameChewbacca = new String[]{"Forhad", "Zoha", "jahid", "joy", "Alex", "mamun"};
        //Array Index                           0         1        2        3     4        5
		System.out.println("Student age : " + ageChewbacca[1]);
		System.out.println("Student name : " + nameChewbacca[1]);
		
		//Array Index 
		
		System.out.println("Student name : " + nameChewbacca[1]);
		System.out.println("Total Student  : " + nameChewbacca.length);
		
		//Multi-Dimentional array
		
		int[][] ageChewbacca2D = {{24, 45, 29, 35, 33, 28},      //[0][0]   [0][1]  [0][2]  [0][3]  [0][4]   [0][5]
				                  {24, 45, 28}}; 		         //[1][0]   [1][1]  [1][2]
				
		System.out.println("Student age 2D: " + ageChewbacca2D[1][2]);
		
		
	
		// Hashmap store multiple data using key-value pair, Implementation of map interface
		HashMap<String, Integer> Student = new HashMap<String, Integer>();
		
		Student.put("Forhad", 24);
		Student.put("zoha", 45);
		Student.put("jahid", 29);
		Student.put("joy", 35);
		Student.put("Alex", 33);
		Student.put("mamun", 28);
		System.out.println("Student Age: "+ Student.get("Alex"));
		
		
		HashMap<String, String> capital = new HashMap<String, String>();
		capital.put("BD", "Dhaka");
		capital.put("USA", "Washingtion DC");
		capital.put("UK", "London");
		capital.put("India", "New Delhi");
		
		System.out.println("Capital city: " + capital.get("BD"));

		//Hashset store unordered collection containing unique value, Implementation of map interface
	
		HashSet<String> car = new HashSet<String>();
		car.add("BMW");
		car.add("Audi");
		car.add("Toyota");
		System.out.println("car :" + car);
		
		
		// HashTable store multiple data using key-value pair, but is synchronized (only one thread can be modified)
		
		Hashtable<String, String> Region = new Hashtable<String, String>();
		Region.put("BD", "Asia");
		Region.put("USA", "North America");
		System.out.println("Region : " + Region.get("USA"));
		
		}
		
	}

