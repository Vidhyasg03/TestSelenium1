package NewPackageVid;
// Make an integer array. Write a for loop to print the integer array in reverse.

public class ArrayIntReverse {
	public static void main(String args[])
	{
		int arrayeg[] = {5,5,5,5,5};
		//System.out.println(arrayeg[0]);
		/*	for  (int i = arrayeg.length-1; i >= 0; i--)
			{
				System.out.print(arrayeg[i]);
			}*/
			
			int sum=0;
			for(int i=0; i< arrayeg.length; i++)
			{
				sum = sum +arrayeg[i];
			}
			System.out.println(sum);
		
	}

}
