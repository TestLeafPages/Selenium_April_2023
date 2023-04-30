package learnAttributes;

import org.testng.annotations.Test;

public class LearnPriority {

	// default 0
	//-ve 
//-10,-9,-5,0,2,4,5,6,7
	@Test(priority=2)
	public void createLead() {
		System.out.println("createLead");
	}
	

	@Test(priority=-1)
	public void editLead() {
		System.out.println("editLead");
	}
	

	@Test(priority=2)
	public void mergeLead() {
		System.out.println("mergeLead");
	}
	

	@Test
	public void deleteLead() {
		System.out.println("deleteLead");
	}
}
