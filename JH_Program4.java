// WJP to perform ascending order Selection sort
package JavaHackton_Nov272019;

public class JH_Program4 {
	
	static void sortarray(int arr3[], int len)
	{
		for (int i=0; i< len-1; i++)
		{
			int minvalue=i;
			for(int j=i+1;j<len;j++)
			
				if(arr3[j] < arr3[minvalue])
					minvalue=j;
			//sawping
			int temp=arr3[minvalue];
			arr3[minvalue]=arr3[i];
			arr3[i]=temp;
		}
	}

	static void printarray(int arr3[], int len)
	{
		for(int i=0; i <len; i++)
			System.out.println(arr3[i]);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr3 = {22,63,55,10,30};
		int len= arr3.length;
		sortarray(arr3, len);
		printarray(arr3,len);
	}
	

}
