package NewPackageVid;

public class StringOccurance {
	
	/*static final int MAX_CHAR = 256;
	public static void main(String args[])
	{
		String value = "vidvidvid";
		CountOccurance(value);
		
	}
	
	
	static
	void CountOccurance(String value)
		{
		if (value.length()==0)
			return;
		int count[]=new int[MAX_CHAR];
		int vl= value.length();

		for(int i =0; i< vl;i++)
		{
			count[value.charAt(i)]++;
			
			char ch[]=new char[value.length()];
			 for (i = 0; i < vl; i++) 
			 	{ 
		            ch[i] = value.charAt(i); 
		            int find = 0; 
		            for (int j = 0; j <= i; j++) 
		            { 
		  
		                // If any matches found 
		                if (value.charAt(i) == ch[j])  
		                    find++;                 
		            } 
		  
		            if (find == 1)  
		                System.out.println("Number of Occurrence of " + 
		                		value.charAt(i) + " is:" + count[value.charAt(i)]);             
		        } 
			 
		}
	
		}*/
	public static int countOccurrences(String find, String string)
	  {
	    int count = 0;
	    int indexOf = 0;

	    while (indexOf > -1)
	    {
	      indexOf = string.indexOf(find, indexOf + 1);
	      if (indexOf > -1)
	        count++;
	    }

	    return count;
	  }
	
	public static void main(String args[])
	{
	/*String testString ="Vviiddhyaa";
	long java8 = testString.chars().filter(ch -> ch =='.').count();
	System.out.println("java8 = " + java8);
	countOccurences("a.b.c.d", '.'); //3
	countOccurences("hello world", 'l'); //3*/
		int occurrences = StringOccurance.countOccurrences("d", "Vviiddhyaa");
		System.out.println(occurrences); 
	
}
/*	public static long countOccurences(String s, char c){
	    return s.chars().filter(ch -> ch == c).count();
	}*/

	
}