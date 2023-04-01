package week1.day1;

public class LearnSwitchStatement {
public static void main(String[] args) {
	String option = "Second class";
	switch(option) {
	case "Balcony":
		System.out.println("Ticket cost Rs. 250");
		break;
	case "First class":
		System.out.println("Ticket cost Rs. 200");
		break;
	case "Second class":
		System.out.println("Ticket cost Rs. 150");
		break;
	default:
		System.out.println("Hey! Please choose a valid class");
		break;
	}
	
}
}
