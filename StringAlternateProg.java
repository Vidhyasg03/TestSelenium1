package NewPackageVid;

import java.util.Arrays;
import java.util.List;

//print alternate elements of String array array

public class StringAlternateProg {
	
	public static void main(String args[])
	{
		String word[] = {"T","H","A","N","K","Y","O", "U"};
		
	
	/*for (int i=0; i<word.length; i++){

		if(i%2 == 0) 
		{
		   //System.out.print(word[i].toLowerCase());
			
		}
		else 
		{
			System.out.print(word[i]);
		}
	} 
		int len = word.length;
		System.out.println(len);

	String rev ="";
	for (int i = len-1; i >= 0; i-- )
	{
		
		rev = rev + word[i];
		
	}
	System.out.println(rev);*/
	
	String[] name ={"v","i","d","h","y","a","s"};
	int length = name.length;
	System.out.println(length);
	for (int i = 5 ; i >= name.length; i++)
	{
		
		System.out.println("inside for loop");
			System.out.println(name[i]);
	}
	
}
	
}
