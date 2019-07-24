import java.util.Arrays;		// Arrays class import
public class ArrayExample {
	
	static int[] listTickets={1001,1002,1003,1004,1005};
	
	public static void main(String[] args) 
	{		
		//int[] listTickets={1001,1002,1003,1004,1005,1006,1007,1008,1009,1010};
		//---------- Using  foreach loop ----------
		System.out.println("Array elements using For each loop:");
		for(int x: listTickets)
		{
			System.out.println("x="+x);
		}
		
		System.out.println("Array elements using For loop:");
		//---------------- Using for loop -----------------
		for(int i=0; i<listTickets.length;i++)
		{
			System.out.println("x="+listTickets[i]);
		}
	
		//------------------ Searching --------------------
		int searchResult = Arrays.binarySearch(listTickets, 1004);
		System.out.println("Search succeeded: index is "+searchResult);
	
		//-------------------- Sorting --------------------
		
	}
	
}
