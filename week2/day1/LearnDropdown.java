package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropdown {
	public static void main(String[] args) {
		// To Open Chrome Browser
		ChromeDriver driver = new ChromeDriver();
		
		// To load an URL - http://leaftaps.com/opentaps/control/login
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		// To Maximize the browser opened
		driver.manage().window().maximize();
		
		// To add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
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
	
		// To click on Leads
		driver.findElement(By.linkText("Leads")).click();
		
		// To click on Create Lead
		driver.findElement(By.linkText("Create Lead")).click();
		
		// To enter company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
	
		// To enter first name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Bharath Kumar");
		
		// To enter last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("D");
		
		// To find the drop down
		WebElement dropdown = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		// To handle the drop down
		Select dd = new Select(dropdown);
		
		// To select a value without select class
		dropdown.sendKeys("Employee");
		
		driver.findElement(By.xpath("(xpath)[2]"));
		
		// To select an option from the drop down using visible text
		// dd.selectByVisibleText("Employee");
		
		// To select an option from the drop down using value
		// dd.selectByValue("LEAD_EMPLOYEE");
		
		// To select an option from the drop down using index
		//  dd.selectByIndex(4);
		
		// To click on the create lead button
		// driver.findElement(By.className("smallSubmit")).click();
		
	
	}
}
