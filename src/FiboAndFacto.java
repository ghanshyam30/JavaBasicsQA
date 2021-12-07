import java.util.*;
public class FiboAndFacto
{
	private static Scanner scanNo;

	public static void main(String[] args) {
	
	System.out.println("let us know the limit for fibo:");
	scanNo = new Scanner(System.in);
	int limit = scanNo.nextInt();
	int result = fibo(limit);
	System.out.println("Result fibo:"+result);
	
	/*
	 * If you have few methods in same class other than static main and you want to call them from main you need to
	 * 			1. Create object of the class and call method from object
	 * 			2. Declare the method as static otherwise you will get below error
	 * Cannot make a static reference to the non-static method findFactorial(int) from the type FiboAndFacto
	 */
	result = findFactorial(limit);
	System.out.println("Result facto:"+result);
	}
	
	public static int fibo(int limit)
	{
	    int result = 0;
	    int fib0 = 1;
	    int fib1 = 1;
	    if(limit == 1 || limit == 2)
    	{
    	    return 1;
    	}
    	else if(limit == 0)
    	{
    	   return 0;
    	}
    	if(limit > 2)
    	{
    	    for(int i= 3; i<= limit; i++)
    	    {
        	    result = fib0+fib1;
        	    fib0 = fib1;
        	    fib1 = result;
        	}
	    }
	    return result;
	}
	
	// Factorial
	public static int findFactorial(int number)
	{
	    int result = 1;
	    if(number == 0)
	    {
	        return 0;
	    }
	    else if(number ==1)
	    {
	        return 1;
	    }
	    else if(number >1)
	    {
	        for(int i=1; i <= number; i++)
	        {
	            result = result * i;
	        }
	        
	    }
	    return result;
	}
}
