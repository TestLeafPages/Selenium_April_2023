package week3.day1;

public class Benz extends Car{
public void sunRoof() {
	System.out.println("Sunroof from Benz");
}
public void applyBrake() {
	System.out.println("Apply Brake from Benz - ABS");
}
public static void main(String[] args) {
	Benz benz = new Benz();
//	benz.sunRoof();
//	benz.openDoor();
//	benz.applyBrake();
//	benz.soundHorn();
	benz.applyBrake();
	Vehicle veh = new Vehicle();
	veh.applyBrake();
}
}
