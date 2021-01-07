package practice;

/**
 * This file depends on the VehicleEncap.java file as the classes in this file inherits the class in VehicleEncap file.
 */
public class EncapInherit{
    public static void main(String [] args){
        TruckEncapInherit jumbo = new TruckEncapInherit(1200);
        jumbo.setChasis("HEI3ND83NJFLJ30");
        jumbo.loadcapacity = 1200;
        CarEncapInherit venue = new CarEncapInherit(5);
        venue.setChasis("HEY7M38DH93N5FS");
        venue.setMfdYear(2019);

        // Check the child objects
        System.out.println("Truck Chasis="+jumbo.getChasis());
        System.out.println("Truck can carry the load of: "+jumbo.loadcapacity +" kgs.");

        System.out.println("Car Chasis="+venue.getChasis());
        System.out.println("Car can accomodate "+venue.numberOfPassengersAllowed+" passengers only.");
    }

}
class TruckEncapInherit extends VehicleEncap{
    int loadcapacity;
    public TruckEncapInherit(int load){
        loadcapacity = load;
    }
    

}

class CarEncapInherit extends VehicleEncap{
    int numberOfPassengersAllowed;
    public CarEncapInherit(int passengersLimit){
        numberOfPassengersAllowed = passengersLimit;
    }
}