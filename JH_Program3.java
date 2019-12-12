//Given an array of integers check the Palindrome of the series.
package JavaHackton_Nov272019;

public class JH_Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a2= {1,2,3,3,2,1};
		int n=a2.length;
		Palindrome(a2,n);
	}
	
	public static void Palindrome(int a2[], int n)
	{
		int flag=0;
		//6/2 && 6!=0
		for(int i=0; i<=n/2 && n!=0; i++)
		{
			if(a2[i] !=a2[n-i-1])
				flag =1;
			break;
		}
		 if(flag==1)
			 System.out.println("its not a palindorme array");
		 else
			 System.out.println("its a Palindrome array");
	}

}
