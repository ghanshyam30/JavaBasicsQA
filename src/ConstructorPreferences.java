//package basics;

public class ConstructorPreferences {
	
	static int a;
	
	/* Default constructor - gets executed first and can call other parameterized constructors
	 * If user wants to call parameterized constructors then that one should be the first statement in default constructor
	 * 
	 */
	ConstructorPreferences()
	{
		this(5);
//		this(5,5);     // compile time error that only 1 this statement can be called
		System.out.println("this is default constructor!!\n a = " +a );
		
	}
	
	ConstructorPreferences(int x)
	{
		this(5,5);
		a = x;
		System.out.println("Parameterized constructor!! \n a = "+a);
	}
	
	ConstructorPreferences(int x, int y)
	{
		a = x + y;
		System.out.println("Parameterized constructor with 2 variables!! \n a = "+a);
	}
	
	
	/*
	 * In Java constructor is not a method it just looks like method
	 * When you define any return type with constructor name it becomes a method even void return type is also a method
	 */
	void ConstructorPreferences(int abc)
	{
		System.out.println("This is void constructor");
		a = abc;
		System.out.println("static value changed from non-static function: "+a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorPreferences constructorObject = new ConstructorPreferences();
		constructorObject.ConstructorPreferences(66);
		ChangeMe changeObject = new ChangeMe();
		changeObject.changed(99);
	}

}

class ChangeMe
{
	static int changeThis;
	public void changed(int changeParam)
	{
		changeThis = changeParam;
		System.out.println("Changed value: "+changeThis);
	}
}

/* OUTPUT
 Parameterized constructor with 2 variables!! 
 a = 10
Parameterized constructor!! 
 a = 5
this is default constructor!!
 a =5
 */
