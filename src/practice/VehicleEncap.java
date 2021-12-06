package practice;

public class VehicleEncap {
    private int numberOfWheels;
    private String typeOfVehicle;
    private String chasisNumber;
    private int manufacturingYear;
    
    // Setters
    public void setWheels(int totalWheels){
        numberOfWheels = totalWheels;
    }
    public void setType(String vehicleType){
        typeOfVehicle = vehicleType;
    }
    public void setChasis(String chasis){
        chasisNumber = chasis;
    }
    public void setMfdYear(int yearMade){
        manufacturingYear = yearMade;
    }

    // getters
    public int getWheels(){
        return numberOfWheels;
    }
    public String getType(){
        return typeOfVehicle;
    }
    public String getChasis(){
        return chasisNumber;
    }
    public int getMfdYear(){
        return manufacturingYear;
    }

}
