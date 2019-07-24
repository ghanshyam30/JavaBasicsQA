// Classes and Objects - Chapter1

// Base class or we can say a super class as it doesn't extend any class
public abstract class Transport{
    String companyName;		// Instance variable declaration
    int numberOfDays;
    float chargesPerDay;
    
    // Abstract method which will be implemented in subclass [must]
    public abstract void changeOfCompany(String newCompanyName);
    
    //Super class contructor
    public Transport(String companyName,String typeofTransport,int numberOfDays,float chargesPerDay){
        this.companyName = companyName;
        this.numberOfDays = numberOfDays;
        this.chargesPerDay = chargesPerDay;
    }
    
    // Final method which wont be overridden
    public void overrideMe(String companyName)
    {
    	this.companyName = companyName;
    	System.out.println("Company name before override in subclass:"+this.companyName);
    }
}