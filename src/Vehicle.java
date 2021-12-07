// Classes and Objects - Chapter1

public class Vehicle extends Transport{
	String vehicleName;		// Instance variable declaration
	int vehicleNumber;
	private float totalFare;
    public Vehicle(String companyName,String typeofTransport,int numberOfDays,int vehicleNumber,String vehicleName)
    {
    	super(companyName,typeofTransport,numberOfDays,34);
        this.vehicleName=vehicleName;
        this.vehicleNumber = vehicleNumber;
        
    }
    public double getCharges(){
        if(this.vehicleNumber<100){
            return 2000.0;
        }
        else if(this.vehicleNumber>100 && this.vehicleNumber<500){
            return 3500.50;
        }
        else{
            return 5605.80;
        }
    }
    public float fare(){
        this.totalFare = this.chargesPerDay * this.numberOfDays;
        System.out.println("Charges will be:"+this.totalFare);
        return this.totalFare;
    }
    public static void main (String[] args) {
    	//chargesPerDay = getCharges(34);
    	// OBJ and Inheritance 
    	// Create OBJ of the class Vehicle and inherit some properties from base class Transport
        Vehicle v1= new Vehicle("Tata","Intercity",3,34,"Truck 500");
        System.out.println("Company name :"+v1.companyName);
        
        // ABSTRACTION 
        //Call to the abstract method which is in super class Transport.
        v1.changeOfCompany("Maruti");
        System.out.println("Company name :"+v1.companyName);
        System.out.println("---------------------------");
        System.out.println("Vehicle name:"+v1.vehicleName);
        System.out.println("Vehicle Number:"+v1.vehicleNumber);
        System.out.println("Number of days:"+v1.numberOfDays);
        System.out.println("Charges per day:"+v1.chargesPerDay);
        
        // OVERRIDING
        v1.overrideMe("Hundai");
        System.out.println("Override company:"+v1.companyName);
        Transport v2 = new Vehicle("Ashok Leyland","InterState",5,121,"Heavy truck");
        v2.overrideMe("Veera");
        System.out.println("Override company:"+v2.companyName);
        
//        Vehicle v2 =new Vehicle("Tata","Intercity",3,34,"Truck 500");
        
        //---------------------Polymorphic properties ------------
        System.out.println("---------------------------");
        System.out.println("Encapsulation concept");
        System.out.println("---------------------------");
        Polymorph e1 = new Polymorph();
        e1.setName("The Bad Coder");
        e1.setAge(25);
        System.out.println("The user you are looking at is "+e1.getName()+" ages "+e1.getAge());
        
        //-----------------------Interface implementation -----------------
        BasicInterface objInterfaceClass1 = new UseInterface();
        objInterfaceClass1.createTicket();
        objInterfaceClass1.cancelTicket();
        
        /*--- here is a catch of reference and object
        objInterfaceClass1.editTicket();
        
        ERROR we will get here is
        the method editTicket() is undefined for the type BasicInterface
        */
        String SubStr1 = new String("tutorials" );
        System.out.print("Found Last Index :" );
        System.out.println( SubStr1.lastIndexOf( "t"));
        
        
    }
    
    public void changeOfCompany(String newCompanyName) {
		this.companyName = newCompanyName;
	}

    public void overrideMe(String companyName) {
    	super.overrideMe("Honda");
    	this.companyName = companyName;
    }

}

class Polymorph{
	/* Structure of the class Polymorph
	 * Class:
	 * 		Variables	: Age,Name
	 * 		Methods  	: info,setName,getName,setAge,getAge
	 */
	private int age;
	private String name;
	public void info(String nameParam, int ageParam) {
		System.out.println("Detials of the employee are:"+this.name+" ages "+this.age);
	}
	public void setName(String nameParam) {
		this.name = nameParam;
	}
	public String getName() {
		return this.name;
	}
	public void setAge(int ageParam) {
		this.age = ageParam;
	}
	public int getAge() {
		return this.age;
	}
}

// CLASS which can implement methods from Interface
class UseInterface implements BasicInterface {
	// Implementation of method from Interface
	public void createTicket() {
		System.out.println("You have implemented create ticket method");
	}
	// Implementation of method from Interface
	public void cancelTicket() {
		System.out.println("You have implemented cancel ticket method");
	}
	
	// Own method can also be there
	public void editTicket() {
		System.out.println("You have implemented Edit Ticket method");
	}
}


