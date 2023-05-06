package testcase;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass {

	@DataProvider(name = "fetch")
	public String[][] sendData() throws IOException {
		
		String[][] readData = ReadDataFromExcel.readData();
		
		return readData;
		
		// step:1 declare a 2D String array
		// first []-represent row
		// second []- represent column
		

		// step2 :assingn data for 2D array
		// index start with 0
		/*
		 * data[0][0] = "TestLeaf"; data[0][1] = "Dilip"; data[0][2] = "kumar";
		 * data[0][3] = "12345";
		 * 
		 * 
		 * data[1][0]="TestLeaf"; data[1][1]="Ragu"; data[1][2]="s";
		 * data[1][3]="123456789";
		 */
		 
		// step3 .return data
		//return data;
	}

	@Test(dataProvider = "fetch")
	public void createData(String cName, String fName, String lName, String phNO) {

		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phNO);
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("Testleaf")) {
			System.out.println("Lead created successfully");
		} else {
			System.out.println("Lead is not created");
		}

	}

}
