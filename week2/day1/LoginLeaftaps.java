package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLeaftaps {
	public static void main(String[] args) {
		// To Open Chrome Browser
		ChromeDriver driver = new ChromeDriver();
		// To load an URL - http://leaftaps.com/opentaps/control/login
		driver.get("http://leaftaps.com/opentaps/control/login");
		// To Maximize the browser opened
		driver.manage().window().maximize();
		
		// To find username webelement
		WebElement username = driver.findElement(By.id("username"));
		
		// To type on the username
		username.sendKeys("DemoSalesManager");
		
		// To find password webelement
		WebElement password = driver.findElement(By.id("password"));
		
		// To type on the password
		password.sendKeys("crmsfa");
		
		// To find the login button
		WebElement login = driver.findElement(By.className("decorativeSubmit"));
	
		// To click on the login button
		login.click();
		
		// To find CRM/SFA link
		WebElement crmsfa = driver.findElement(By.linkText("CRM/SFA"));
	
		// To click on CRM/SFA
		crmsfa.click();
	
	
	
	
	
	}
}
