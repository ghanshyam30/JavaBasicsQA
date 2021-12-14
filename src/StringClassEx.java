
public class StringClassEx {

	   public static void main(String args[]) {
	      String str1 = "Hello";
	      String str2 = new String("Hello");
	      String str3 = new String("World");
	      
	      int result = str1.compareTo( str2 );
	      System.out.println("Comparison result of 2 strings Hello and Hello is = "+result);
	      
	      result = str2.compareTo( str3 );
	      System.out.println("Comparison result of 2 strings Hello and World is = "+result);
	      
	      System.out.println("Compare inline between Hello and Strings are not equal:"+ str1.compareTo("Strings are not"));
	      
	      // Equals
	      boolean result_bool = str1.equals(str2);
	      System.out.println("Equals result of 2 strings Hello and Hello is = "+result_bool);

	  		//reverse using String Buffer or String Builder
	  		StringBuffer sb = new StringBuffer("Geeks for ");
	  		sb.append("Geeks");
	  		System.out.println(sb.reverse());
	  		
	  		String newStr = "Geeks for Geeks";
	  		
	  		System.out.println("New string:"+newStr);
	  		// Find length
	  		System.out.println("Size:"+newStr.length());
	  		
	  		// Contains
	  		System.out.println("If contains \'eks\':"+newStr.contains("eks"));
	  		
	  		// Find match index - returns -1 if not found
	  		int indexOfEKS = newStr.indexOf("eks");
	  		System.out.println("Index of eks: "+indexOfEKS);
	  		
	  		// Find next match using substring
	  		indexOfEKS = newStr.substring(indexOfEKS+1,newStr.length()).indexOf("eks") + indexOfEKS+1; //added previous index because we started after that 
	  		System.out.println("Index of 2nd eks: "+indexOfEKS);
	  		            // OR 
	  		indexOfEKS = newStr.indexOf("eks",3);  // find index after location
	  		System.out.println("Index of 2nd eks: "+indexOfEKS);
	  		
	  		
	  		/*
	  		 * Problem - find numbers from given string
	  		 * input - Geeks12for345Geeks
	  		 * output- 12345
	  		 */
	  		String stringWithNumbers = "Geeks12for345Geeks";
	  		char[] charString = stringWithNumbers.toCharArray();
	  		StringBuilder sb2 = new StringBuilder();
	  		for(char charFromString: charString)
	  		{
	  			if(Character.isDigit(charFromString))
	  			{
	  				sb2.append(charFromString);
	  			}
	  		}
	  		System.out.println("Numbers found from string "+stringWithNumbers+" are "+sb2);
	   }
}

/* OUTPUT
Comparison result of 2 strings Hello and Hello is = 0
Comparison result of 2 strings Hello and World is = -15
Compare inline between Hello and Strings are not equal:-11
Equals result of 2 strings Hello and Hello is = true
skeeG rof skeeG
New string:Geeks for Geeks
Size:15
If contains 'eks':true
Index of eks: 2
Index of 2nd eks: 12
Index of 2nd eks: 12
Numbers found from string Geeks12for345Geeks are 12345
*/
