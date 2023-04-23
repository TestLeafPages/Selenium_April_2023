package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlerts {
	public static void main(String[] args) throws InterruptedException {
		// To Open Chrome Browser
		ChromeDriver driver = new ChromeDriver();
		// To load an URL - http://leaftaps.com/opentaps/control/login
		driver.get("https://leafground.com/dashboard.xhtml");
		// To Maximize the browser opened
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("(//ul[@class='layout-menu']/li)[2]")).click();
		driver.findElement(By.xpath("//span[text()='Alert']/..")).click();
		driver.findElement(By.xpath("//h5[text()=' Alert (Prompt Dialog)']/following-sibling::button")).click();
		
		// We have got an alert at this time
		// Switch our context from webpage to alert
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		System.out.println(alertText);
		alert.sendKeys("Annamalai");
		Thread.sleep(2000);
		alert.accept();
	
	
	
	
	
	
	
	}
}
