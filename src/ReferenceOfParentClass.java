class Demo_base { 
	   int value = 1000; 
	   Demo_base() 
	   { 
	      System.out.println("This is the base class constructor"); 
	   } 
	} 
	  
class Demo_inherits extends Demo_base { 
	   int value = 10; 
	   String classType = "Child";
	   Demo_inherits() 
	   { 
	      System.out.println("This is the inherited class constructor"); 
	   } 
	   
	   void DoSomething()
	   {
		   System.out.println("Inside DoSomething method of child class");
	   }
	} 
	  
public class ReferenceOfParentClass { 
	   public static void main(String[] args) { 
	      Demo_inherits my_inherited_obj = new Demo_inherits();
	      System.out.println("In the main class, inherited class object has been created");
	      System.out.println("Reference of inherited class type :" + my_inherited_obj.value); 
	      System.out.println("============================ Parent Reference Obj ==========================");
	      Demo_base my_obj = my_inherited_obj; 
	      // OR Demo_base my_obj = new Demo_inherits();         // They both work functionally the same
	      System.out.println("In the main class, parent class object has been created");
	      System.out.println("Reference of base class type : " + my_obj.value); 
	      
	      /*  Below lines of code will complain that the method and variable are undefined for the class Demo_base
	      my_obj.DoSomething();
	      System.out.println("Class type:"+my_obj.classType);
	      */
	      my_inherited_obj.DoSomething();
	   } 
	}