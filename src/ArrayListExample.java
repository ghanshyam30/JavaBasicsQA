import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
	/*
	 * What is array list?
	 * Ans - Ordered collection of objects, which can grow if needed unlike array
	 * Sytax - ArrayList<Integer> arrlist = new ArrayList<Integer>();
	 * get value - arrList.get(integer index of item to retrieve)
	 * add value - arrList.add(value to add)
	 * set value at some location -  arrList.set(0,33) - Updates the existing location value
	 * remove value from some location - arrList.remove(0)
	 * 
	 * Why Array List and not Array?
	 * Ans - Array do not grow, ArrayList does
	 * 		- implements collection class so has CRUD operations with higher efficiency
	 */
	
	public static void main(String[] args)
	{
		// create array list of integer type
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		
		// ADD items to the end of list
		arrList.add(1);
		arrList.add(2);
		System.out.println("Array after adding 2 items\t\t\t: "+arrList);
		// Add items to any specific location
		arrList.add(0, 33);
		System.out.println("Array after adding an item to 0th location\t: "+arrList);
		
		// Update item from existing arraylist
		arrList.set(0, 3);
		System.out.println("Array after updating 0th element to 3 value \t: "+arrList);
		
		arrList.remove(0);
		System.out.println("Array after removing the element at 0th location: "+arrList);
		
		
		/*
		 * Working with iterators
		 * Iterator iter = new Iterator(arrList);
		 */
		
		Iterator<Integer> iterArrList = arrList.iterator();
		while(iterArrList.hasNext())
		{
			int new_item = iterArrList.next();
			System.out.println("This item= "+new_item);
		}
	}
}


/* OUTPUT:
Array after adding 2 items			: [1, 2]
Array after adding an item to 0th location	: [33, 1, 2]
Array after updating 0th element to 3 value 	: [3, 1, 2]
Array after removing the element at 0th location: [1, 2]
This item= 1
This item= 2
*/