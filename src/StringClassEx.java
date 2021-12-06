
public class StringClassEx {

	   public static void main(String args[]) {
	      String str1 = "Hello";
	      String str2 = new String("Hello");
	      String str3 = new String("World");
	      
	      int result = str1.compareTo( str2 );
	      System.out.println("Comparison result of 2 strings Hello and Hello is = "+result);
	      
	      result = str2.compareTo( str3 );
	      System.out.println("Comparison result of 2 strings Hello and World is = "+result);
	      
	      System.out.println(str1.compareTo("Strings are not"));
	      
	      // Equals
	      boolean result_bool = str1.equals(str2);
	      System.out.println("Equals result of 2 strings Hello and Hello is = "+result_bool);
	   }
	}