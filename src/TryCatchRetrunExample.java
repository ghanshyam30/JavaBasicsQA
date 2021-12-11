
public class TryCatchRetrunExample {
		
	public static void main(String[] args) 
	{
			int someNumber;
			TryCatchRetrunExample tce = new TryCatchRetrunExample();
			someNumber = tce.tryCatch();
			System.out.println("Returned: "+someNumber);
	}
		
		
	@SuppressWarnings("finally")
	public int tryCatch()
	{
		    int someNumber = 10;
			int someNumberString;
			try{
			    someNumberString = someNumber/0;
			}
			catch(NumberFormatException ne)
			{
			    System.out.println("NumberFormatException caught: "+ne);
			    return 10;
			}
			catch(Exception es)
			{
			    //If there is no finally block then return statement from catch will get executed
			    System.out.println("Other General Exception caught: "+ es);
			    return 20;     //this return is not useful
			}
			// Always gets executed even if catch is executed, return statement from finally always takes last turn
			finally
			{
			    // If finally has return statement then it will the be one which will get executed
			    // If finally doesn't have return statement then parent block needs to have return statement as below return 100;
			    System.out.println("I was here in finally");
			    return 30;
			}
			
			// IF finally block has return then this statement will be unreachable
	 		// return 100;      
			
		}

}

/*  OUTPUT
Other General Exception caught: java.lang.ArithmeticException: / by zero
I was here in finally
Returned: 30
*/