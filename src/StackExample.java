import java.util.Stack;
public class StackExample
{
	public static void main(String[] args) {
	    // Declaration
		Stack<Integer> intStack = new Stack<>();
		
		// PUSH operation
		intStack.push(1);
		intStack.push(2);
		intStack.push(3);
		System.out.println("Stack: "+intStack);
		
		// PEEK operation
		System.out.println("Latest top: "+intStack.peek());
		
		// POP operation
		intStack.pop();
		System.out.println("Top after pop: "+intStack.peek());	
	}
}

/* OUTPUT
Stack: [1, 2, 3]
Latest top: 3
Top after pop: 2
 */