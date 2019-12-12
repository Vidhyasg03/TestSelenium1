package NewPackageVid;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

//8) Find the greatest number in a array

public class GreatestArrayNumb {
	
	public static void main(String args[]) throws IOException
	{
		/*int[] nums={6,-1,-2,-3,0,1,2,3,4};
		Arrays.sort(nums);
		
		System.out.println(nums);
        System.out.println("Maximum = " + nums[nums.length-1]);
        for (int i=0; i < nums.length; i++)
        {
        	System.out.println(nums[i]);
        }*/
		GreatestArrayNumb gb = new GreatestArrayNumb();
		
		System.out.println("enter the fruit name");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String name = br.readLine();  
	    //System.out.println(name);
	    //GreatestArrayNumb.searchfruit(name);
	    gb.searchfruit(name);
	    //System.out.println(al);
        
	
}
	
	public String searchfruit(String name)
	{
		 ArrayList<String> al= new ArrayList<String>();
	        al.add("apple");
	        al.add("mango");
	        al.add("strawberry");
	        al.add("blueberry");
	        al.add("tomatoes");
	        al.add("pineapple");
	        //al.indexof(name);
	        if(al.contains(name))
	        {
	        int numb =al.indexOf(name);
	        System.out.println(numb);
	        }
	        else
	        {
	        	System.out.println("not found");
	        }
	        return name;
	        
	}
}
