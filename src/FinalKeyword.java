import java.util.*;
public class FinalKeyword
{
    /*
    Difference between immutability and final keyword
    Immutability - you can replace or change reference of the variable entirely but can not modify it.
    Final - you can not change the reference of the variable but you can modify it
    */
    
	public static void main(String[] args) {
	    // Simple arraylist with some values
		ArrayList<Integer> fake=new ArrayList<>();
		fake.add(00);
		fake.add(10);
		System.out.println("Dummy arraylist created to be assigned to other arraylist variable: "+fake);
		
		// Declaration without Final
		ArrayList<Integer> value=new ArrayList<>();
        /*
        final ArrayList<Integer> value=new ArrayList<>();
            with final Declaration,line  value = fake; will give below error
            cannot assign a value to final variable value
        */
 		//final ArrayList<Integer> value=new ArrayList<>();  
		value.add(50);
		value.add(10);
		System.out.println("Original Value arraylist: "+value);
		
		// Replace or change the reference itself i.e mutability with other arraylist
		value = fake;
		System.out.println("after reassignment Value arraylist: "+value);
		
	}
}

/* OUTPUT:
Dummy arraylist created to be assigned to other arraylist variable: [0, 10]
Original Value arraylist: [50, 10]
after reassignment Value arraylist: [0, 10]
*/

