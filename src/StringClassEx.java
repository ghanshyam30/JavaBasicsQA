
public class StringClassEx {

	   public static void main(String args[]) {
	      String str1 = "Hello";
	      String str2 = new String("Hello");
	      String str3 = new String("World");
	      
	      int result = str1.compareTo( str2 );
	      System.out.println(result);
	      
	      result = str2.compareTo( str3 );
	      System.out.println(result);
	      
	      System.out.println(str1.compareTo("Strings are not"));
	   }
	}