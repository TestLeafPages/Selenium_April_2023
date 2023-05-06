package testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass {

	
//public ChromeDriver driver;

	public RemoteWebDriver driver;

	/*
	 * parameter name should be exactly matching with name inside xml
	 * input args name maybe vary
	 * order should be maintain same in parameter
	 */	
@Parameters({"url","username","password","browser"})


	@BeforeMethod
	public void preCondition(String url,String uname,String pwd,String browser) {
	
	if(browser.equalsIgnoreCase("chrome")) {
	driver  = new ChromeDriver();
	}else if(browser.equalsIgnoreCase("edge")) {
		driver= new EdgeDriver();
	}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	
	
	
	
	
	@AfterMethod
	public void postCondition() {
		driver.close();

	}
	
}
