//Write a Java program that takes a year from user and print whether that year is a leap year or not.

package JavaHackton_Nov272019;

import java.util.Scanner;

public class JH_Program21 {

	static boolean checkYear(int year)
	{
		// TODO Auto-generated method stub
		if (year % 400 == 0) 
            return true; 
      
        // Else If a year is muliplt of 100, 
        // then it is not a leap year 
        if (year % 100 == 0) 
            return false; 
      
        // Else If a year is muliplt of 4, 
        // then it is a leap year 
        if (year % 4 == 0) 
            return true; 
        return false; 
    } 
          
    // Driver method 
    public static void main(String[] args)  
    { 
        int year ;
        System.out.println("enter the valid year");
        Scanner sc= new Scanner(System.in);
        year=sc.nextInt();
        
        System.out.println( checkYear(year)? "Leap Year" : 
                           "Not a Leap Year" ); 
    } 

}