
public class FindSubstringCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    int count = 0;
	    String stringToCheck = "someIIIstringIIIisIII";
	    while(true)
	    {
	       
	       int indexFound = stringToCheck.indexOf("II");
	       if(indexFound != -1)
	       {
	           count++;
	           
	           stringToCheck = stringToCheck.substring(indexFound+1,stringToCheck.length());
	           System.out.println("New string to work on:"+stringToCheck);
	       }
	       else
	       {
	           break;
	       }
	    }
	    System.out.println("Count:"+count);
	}

}
