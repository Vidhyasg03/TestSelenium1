// Q55. Write a program in Java to display the multiplication table of a given integer.

package JavaHackton_Nov272019;

import java.util.Scanner;

public class JH_Program55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the multipler");
		Scanner sc= new Scanner(System.in);
		int mul;
		mul=sc.nextInt();
		int temp=1;
		int j = 1;
		while (j <= 10)
		{
			temp=mul * j;
			System.out.println(mul +"x"+j +"=" +temp);
			j++;
		}

	}

}
