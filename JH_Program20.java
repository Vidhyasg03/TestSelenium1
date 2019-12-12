// Write a Java program that keys a number from the user and generates an integer between 1 and 7 and displays the name of the weekday.

package JavaHackton_Nov272019;

import java.util.Scanner;

public class JH_Program20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the value from 1 to 7");
		Scanner sc = new Scanner(System.in);
		int number=sc.nextInt();
		 switch(number)
		 {
			 case 1 : System.out.println("1.Monday");
			 			break;
			 case 2 : System.out.println("2.tuesday");
			 			break;
			 case 3: System.out.println("3. wednesday");
			 			break;
			 case 4 : System.out.println("4. thursday"); break;
			 case 5 :System.out.println("5. friday");
			 		break;
			 case 6:System.out.println("6. saturdaay");
			 break;
			 case 7: System.out.println("7. sunday");
			 break;
			 default : System.out.println("please enter a valid number");
			 	
		 }

	}

}
