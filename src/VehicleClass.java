/*
 * This is the basic class example
 * How to declare variables/ states in the class
 * How to declare and define the methods in the class
 * How to refer the instance variable within the class
 * 
 * Note- If any variable is declared but not defined it will have value null
 */
public class VehicleClass {
	// Class name should start with capital letter.
	int wheels;
	String color;
	String name;
	public void run() {
		System.out.println(this.name + " is running"); 
	}
	public void turn() {
		System.out.println(this.name + " is turning");
	}
	public static void main(String[] args) {
		VehicleClass v1 = new VehicleClass();
		v1.name ="BMW X5";
		v1.run();
		v1.turn();
		VehicleClass v2 = new VehicleClass();
		v2.color = "Red";
		v2.run();
		v2.turn();
		System.out.println("color of v2 "+v2.color);
		System.out.println("Name of v2 "+ v2.name);
	}
}
