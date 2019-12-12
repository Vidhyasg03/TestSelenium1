package NewPackageVid;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "vidhya seshagirirao ganapathy";
		StringBuffer SB = new StringBuffer(name);
		
		String sample = "Hello How are you";
	    String[] words = sample.split(" ");
	    
	    
	    for(String word:words)
	    {
	       String firstSub = word.substring(0, 1);
	       String secondSub = word.substring(1);
	     String result = result+firstSub.toLowerCase()+secondSub.toUpperCase()+" ";
	     System.out.println(result); 
	    }
	    
		
		
		
		
		
		/*//SB.append(name);
		SB = SB.reverse();
		System.out.println(SB);
		
		char[] name1=name.toCharArray();
		for(int i =name1.length-1; i>=0;i--)
		{
			System.out.println(name1[i]);
		}
		
		int findindex = name.indexOf('h');
		System.out.println(findindex);

		boolean Newname =name.contains("Vid");
		System.out.println(Newname);*/
		
	//	printmethod(name);
	//	caseconvertor(SB);
	}

	/*static void printmethod(String name)
	{
		if(name.length()==0)
		return;
		String words[] = name.split(" ");
		for (String word:words )
		{
			System.out.println(Character.toUpperCase(word.charAt(0))+ " ");
		}
	
	}
	
	static void caseconvertor(String SB)
	{
		if(SB.length()==0)
			return;
		int ln=SB.length();
		System.out.println(ln);
		for (int i =0; i <=ln; i++)
		{
			Character c = SB.charAt(i);
			if(Character.isLowerCase(c))
				//SB.replace(i, i+1,Character.toUpperCase(c)+ "");
			SB.replace(i,i+1,Character.toUpperCase(c));
			else
				SB.replace(i, i+1,Character.toLowerCase(c)+ "");
		}
	}*/
	
	
}
