import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
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
		someOtherNewHash.put("Notage", "20");
		System.out.println("Item 1 age:"+someOtherNewHash.get("age"));
		System.out.println("Item 1 Notage:"+someOtherNewHash.get("Notage"));
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
		 * OPERATIONS on Hashmap
		 * Iterator iterHash = someHash.entrySet().iterator();
		 * In the iterator creation you can see that type of iterator is Map.Entry and you need to specify which kind of entry is it to avoid warnings
		 * MERGE - Merges 2 hashmaps and maintains single copy of duplicates
		 * isEmpty - to check if hashmap is empty
		 * replace(key,value) - updates record with new value
		 * clone - clones the hashmap to create new one
		 * keyset() and valueset() to get respective sets
		 * putIfAbsent(key,val)
		 * remove(key) and remove(key,val)
		 * containsKey - checks if key is present in hashmap
		 * containsValue = checks if the value is present in hashmap
		 * equals - compare 2 hash for equality
		 * size - retruns size of the hashmap
		 * 
		 */
		Iterator<Map.Entry<String,String>> iterHash = someHash.entrySet().iterator();
		while(iterHash.hasNext())
		{
			Map.Entry<String,String> someMap = (Map.Entry<String, String>) iterHash.next();
			System.out.println("Object received: key= "+someMap.getKey() + " and value= "+someMap.getValue());
		}
		
		// isEmpty
		System.out.println("Is original hashmap empty:"+someHash.isEmpty());
		
		// clone - creates shallow copy
		HashMap<String, String> cloneHash = (HashMap<String, String>) someOtherNewHash.clone();
		cloneHash.put("Notage","30");
		System.out.println("Updated value for Notage from 20 to 30 from cloned Hashmap");
		System.out.println("Now from original hashmap Notage:"+someOtherNewHash.get("Notage"));
		System.out.println("Clone hashmap value for Notage:"+cloneHash.get("Notage"));
		cloneHash.replace("notInKeys", "35");   // doesn't produce an error and does nothing
		System.out.println("Clone hashmap value for Notage after replace:"+cloneHash.get("Notage"));
		System.out.println("Size of the hashmap: "+cloneHash.size());
		
	}
}
