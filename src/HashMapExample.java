import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapExample {

	public static void main(String[] args)
	{
		HashMap<String, String> someHash = new HashMap<String, String>();
		someHash.put("name", "Jack");
		someHash.put("age", "20");
		
		System.out.println("Hashmap created: "+someHash);
		for(Entry<String, String> item: someHash.entrySet())
		{
			System.out.println("Item details: name: "+item.getKey() + " age: "+item.getValue());
		}
		
		HashMap<String, String> someOtherHash = new HashMap<String, String>();
		someOtherHash.put("name", "Jack");
		someOtherHash.put("age", "20");
		
		// compare 2 hashmaps
		// boolean hashEquals = someHash.equals(someOtherHash);
		// System.out.println("Result of equals operation for 2 hashmaps= "+someHash.equals(someOtherHash));
		if(someHash.equals(someOtherHash))
		{
			System.out.println("The hashmaps are equal..!!");
		}
		
		
		HashMap<String, String> someOtherNewHash = new HashMap<String, String>();
		someOtherNewHash.put("name", "Jil");
		someOtherNewHash.put("age", "20");
		// compare 2 hashmaps
		if(someOtherHash.equals(someOtherNewHash))
		{
			System.out.println("The hashmaps are equal..!!");
		}
		else
		{
			System.out.println("**** ERROR - The hashmaps are not equal *****");
		}
		
		
		
		/*
		 * OPERATIONS on Hashmaps
		 * 
		 */
	}
}
