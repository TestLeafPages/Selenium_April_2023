package week7.day2;

import org.testng.annotations.Test;

public class SubClass extends SuperClass {
	public void method1(){
		System.out.println("Subclass");
	}
	@Test
	public void method() {
//		this = new SubClass();
		this.method1();
		super.method1();
	}
	
}
