package learnAttributes;

import org.testng.annotations.Test;

public class LearnEnabled {
// default true
	
	@Test(priority=1,enabled=false)
	public void createLead() {
		System.out.println("createLead");
	}
	

	@Test()
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
