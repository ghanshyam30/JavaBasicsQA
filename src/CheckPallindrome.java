
public class CheckPallindrome {

	public static void main(String[] args)
	{
		String stringToCheck = "MADBAM";   // Also check with input MADDAM
	    boolean flag = false;
	    int reverseCounter = stringToCheck.length() - 1;
	    for(int i=0;i<=stringToCheck.length()/2;i++)
	    {
	        if(stringToCheck.charAt(i) == stringToCheck.charAt(reverseCounter))
	        {
	            flag = true;
	            reverseCounter = reverseCounter - 1;
	            System.out.println("I was here: "+i);
	        }
	        else{
	            flag = false;
	            break;
	        }
	    }
	    if(flag == true)
	    {
	        System.out.println("Passed");
	    }
	    else
	    {
	        System.out.println("Failed");
	    }
	}
}
