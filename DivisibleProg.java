package NewPackageVid;
import java.util.Scanner;

public class DivisibleProg {
	
	public static void main(String args[])
	{
		
		@SuppressWarnings("resource")
		Scanner myObj = new Scanner(System.in);
		int LowLimit = myObj.nextInt();
		int UpperLimit = myObj.nextInt();
		
		System.out.printf("enter Lowerlimit", +LowLimit);
		System.out.printf("enter uppperlimit:",+UpperLimit);
		if (LowLimit < UpperLimit)
		{
			for (int i = LowLimit ; i<= UpperLimit; i++)
			{
				if(i%55==0)
					System.out.println(i);
			}
		}
	}

}
