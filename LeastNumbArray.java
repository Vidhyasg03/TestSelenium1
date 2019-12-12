package NewPackageVid;
import java.util.Arrays;

//Find the least number in a array

public class LeastNumbArray {
	
	public static void main(String args[])
	{
		int[] nums={6,-1,-2,-3,0,1,2,3,4};
		Arrays.sort(nums);
		System.out.println("Minimum = " + nums[0]);
		System.out.println("Maximum = " + nums[nums.length-1]);

	}

}
