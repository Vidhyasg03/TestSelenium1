//Q62. Write a Java method to count all vowels in a string.
package JavaHackton_Nov272019;

import java.util.Scanner;

public class Jh_Program64_Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the string to count the no of vowles");
		Scanner sc = new Scanner(System.in);
		String input;
		input =sc.nextLine();
		input=input.toLowerCase();
		System.out.println(countvowles(input));

	}
	
	public static int countvowles(String input)
	{
		int count=0;
		for (int i=0; i<input.length(); i++)
		{
			if(input.charAt(i)=='a'  || input.charAt(i)=='e' || input.charAt(i)=='i' || input.charAt(i)=='o' || input.charAt(i)=='u')
			{
				count++;
		}
		}
			return count;
	}

		
}
