//Write a Java program to convert minutes into a number of years and days.
package JavaHackton_Nov272019;

import java.util.Scanner;

public class JH_program59 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double mintuesinayear ;
		long Years;
		int days;
		
		mintuesinayear =60*24*365;
		System.out.println("enter the value of mintues :");
		Scanner sc = new Scanner(System.in);
		double min = sc.nextDouble();
		long years = (long) (min/mintuesinayear);
		days=(int) (min/60/24) %365;
		System.out.println("entered mintues : " +min +"\n" +years+ "years " +days +"and days " );

	}

}
