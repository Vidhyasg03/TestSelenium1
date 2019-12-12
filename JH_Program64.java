// Q64. Write a Java program to replace the second element of a ArrayList with the specified element.

package JavaHackton_Nov272019;

import java.util.ArrayList;

public class JH_Program64 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(10);
		al1.add(15);
		al1.add(25);
		System.out.println(al1);
		al1.add(2, 20); // replace the second element of a ArrayList with the specified element
		System.out.println(al1);

	}

}
