package week1.day2;

public class LearnMethods {
	// Global variables
	public int number = 5;
	private String name = "Testleaf";
	
	public void printMyName() {
		System.out.println("Testleaf");
	}
	private int getCardPin() {
//		int pin = 2345;
//		return pin;
		return 2345;
	}
	// a & b are method level variable
	double addTwoNumbers(double a, double b) {
		return a+b;
	}
	public String getCarName() {
		return "Duster";
	}
	
	public static void main(String[] args) {
		LearnMethods obj = new LearnMethods();
		
		// To access the variables
		int a = obj.number;
		String name2 = obj.name;
		
		// To access the methods
		obj.printMyName();
		int cardPin = obj.getCardPin();
		System.out.println(cardPin);
		double result = obj.addTwoNumbers(2.50, 7.50);
		System.out.println(result);
		
		String carName = obj.getCarName();
		System.out.println(carName);
	}
	
	
	
	
	
	
	

}
