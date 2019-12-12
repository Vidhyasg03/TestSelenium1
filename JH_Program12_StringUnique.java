//Given a string print the unique words of the string.
package JavaHackton_Nov272019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JH_Program12_StringUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the input value");
		String input = null;
		try {
			input=br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 int count = calculateNoOfUniqueWords(input);
	        System.out.println("Total number of unique words in \"" + 
	                                         input + "\" are " + count);
	}
	static int calculateNoOfUniqueWords(String input)
	{
		String[] words =input.split(" ");
		
		boolean array[]= new boolean[words.length];
		int i,j, count=0;
		for(i=0; i<words.length; i++)
		{
			if(!array[i]) // checks whether the substring is already checked or not.
				count++;
		for(j=i+1; j <words.length; j++)
		{
			if(words[j].compareTo(words[i])==0)
			{
				array[j]= true;
				count--;
			}
		}
		}
		return count;
	}

}
