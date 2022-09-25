package com.upskill.java_3;

public class Loops {
	
		/*
		Type of Loop
		     1.For Loop
		     2.While Loop
		     3.Do while Loop
		     4.Infinite Loop
		 */
	
   public static void main(String[] args) {                      
	 //PracticeForLoop();                                                                                                     
	// PracticeWhileLoop(); 
	//PracticeDoWhileLoop();
    //PracticeInfiniteLoop();
	 PracticeNestedLoop();
  }                                                                  

   public static void PracticeForLoop(){                         //For Loop - Do again and again upto upper limit  
	  int i;                                                     //Initialize the variable  
	  for (i = 1; i<= 10; i++){                                  //Setting lower limit, Upper limit, Increment or decrement
		  System.out.println("For Loops Number =" +i);           //Statement
	   }
  }

   public static void PracticeWhileLoop(){                         //While Loop - Do again and again upto condition match
	   int i = 1;                                                  //Initialize variable
	   while(i<=10){                                               //setting condition
			  System.out.println("While Loops Number =" +i);       //Statement
			  i++;                                                 //Increment or decrement
			  
	      }
      }
   
   public static void PracticeDoWhileLoop(){                      //Do While Loop - Do action then match condition match
	   int i = 1;                                                 //Initialize variable
	   do{
		   System.out.println("Do While Loops Number =" +i);     //Statement  
			  i++;                                               //Increment or decrement
	      }while (i<=10);                                        //Checking condition 
	   }

  public static void PracticeInfiniteLoop(){                     //Infinite Loop - Never Ending loop
	  int i;                                                     //Initialize the variable  
	  for (i = 1; ; i++){                                        //Setting no Upper limit
		  System.out.println("Infinite Loops Number =" +i);      //Statement

	  }
  }
  
 
  
public static void PracticeNestedLoop(){                       //Nested loop = loop inside another loop
        int i;                                                 //Initialize variable i
        int j;                                                 //Initialize variable  j
        for(i = 1; i <=10; i++){                               //Fast loop for i
           for(j = 1; j <= 10; j++){                            
        	   int mutipicationtable = i * j;
        	   System.out.print(mutipicationtable + " ");
           }
           System.out.println(" ");
        }
}
}
    	 

