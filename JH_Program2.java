package JavaHackton_Nov272019;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JH_Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array1= {4,5,3,2};
		 
		for(int a:array1)
		{
			System.out.print(a);
		}
		Arrays.sort(array1);
		
		System.out.println("\n the sorted array are");
		for (int b: array1)
		{
			System.out.println(b);
		}
		

}
}
