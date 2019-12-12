// how too split a string in java ?

package JavaHackton_Nov272019;

public class JH_Program9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str3="vid@amazon@com";
		String[] strarr=str3.split("@");
		for(String a :strarr)
			System.out.println(a);
		      

	}

}
