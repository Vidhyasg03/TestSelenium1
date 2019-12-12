package NewPackageVid;

import java.util.Scanner;

public class Greaternumber {

	
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the the a, b, c value");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (a > b  && a >c )
		{
				
			System.out.println( a +" is first greatest number");
			if (b > c )
			{
				System.out.println(b+ "is second greater");
			}
			
			else 
			{
				System.out.println(c+ "is greater " );
			}
		}
	
	else if (b >c)
	{
		System.out.println( b +"b is greater" +c);
		if (a > c )
		{
			System.out.println(b+ "is second greater");
		}
		
		else 
		{
			System.out.println(c+ "is greater " );
		}
	}
	else 
	{
		System.out.println(c +"c is greater");
	}
		
}

}
