package learnAttributes;

import org.testng.annotations.Test;

public class LearnDependsOnMethods {

	//default {}
	
	//cdme
	
	@Test()
	public void createLead() {
		System.out.println("createLead");
	}
	

	@Test(dependsOnMethods= {"createLead","deleteLead"})
	public void editLead() {
		System.out.println("editLead");
	}
	

	@Test()
	public void mergeLead() {
		System.out.println("mergeLead");
	}
	

	@Test
	public void deleteLead() {
		System.out.println("deleteLead");
	}
}
