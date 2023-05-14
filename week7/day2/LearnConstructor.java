package week7.day2;

public class LearnConstructor {
	String receivedName;
	// Constructor -> special method
	// methodname = classname
	// should not return anything
	public LearnConstructor() {
		System.out.println("This is from the constructor");
	}
	
	public LearnConstructor(String name) {
		System.out.println("The name received "+name);
		receivedName = name;
	}

	public static void main(String[] args) {
		// Without object creation, we can not execute anything.
		// So, java creates a virtual constructor to provide the object.
		LearnConstructor obj = new LearnConstructor();
		// LearnConstructor() -> calling the constructor
		// & it gives the reference of the class
		// new -> creates a new memory space in heap memory
		// to store the reference of the class
		obj.printMyName();
	}
	public void printMyName() {
		System.out.println("My name is "+receivedName);
	}
}
