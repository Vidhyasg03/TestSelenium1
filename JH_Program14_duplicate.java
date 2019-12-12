//Q14. WJP to display duplicate character in string
package JavaHackton_Nov272019;

public class JH_Program14_duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String str = "w3schools";
		String str="vidhyavid";
		  int cnt = 0;
		  char[] inp = str.toCharArray();
		  System.out.println("Duplicate Characters are:");
		  for (int i = 0; i < str.length(); i++) {
		   for (int j = i + 1; j < str.length(); j++) {
		    if (inp[i] == inp[j]) {
		     System.out.println(inp[j]);
		     cnt++;
		     break;
		    }
		   }
		  }
		 }

}
