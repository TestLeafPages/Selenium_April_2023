package week1.day2;

public class LearnString {
public static void main(String[] args) {
	String name = "Testleaf";	// String literal
	String name1 = "Testleaf";
	String obj = new String("Testleaf"); // String object
	if(name.equals(obj))
	System.out.println("Same");
	else
		System.out.println("Not same");
}
}
