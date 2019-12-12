/* Write a Java method to display the middle character of a string.

Note: a) If the length of the string is odd there will be two middle characters.

b) If the length of the string is even there will be one middle character.*/

package JavaHackton_Nov272019;

import java.util.Scanner;

public class JH_program61_string {

	static String middlechar(String input1)
	{
		int len, pos =0;
		if(input1.length() %2 ==0)
		{
			pos=input1.length()/2 -1;
			len =2;
		}
		else
		{
			pos=input1.length()/2;
			len =1;
		
		}
		return input1.substring(pos, pos + len);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the input string");
		Scanner sc= new Scanner(System.in);
		String input1=sc.nextLine();
		System.out.println(middlechar(input1));

	}

}
