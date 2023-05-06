package week6.day1;

import org.testng.annotations.Test;

public class LearnInvocationCount {

	//Invocation Count -default-1
	//threadPoolSize- default -0
	//threadPoolSize come along with invocationCount
	
	@Test(invocationCount=5,threadPoolSize=3)
	public void createLead() {
		System.out.println("Createlead");
	}
}
