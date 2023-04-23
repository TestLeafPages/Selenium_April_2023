package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSnapShot {
	public static void main(String[] args) throws InterruptedException, IOException {
		// To Open Chrome Browser
		ChromeDriver driver = new ChromeDriver();
		// To load an URL - http://leaftaps.com/opentaps/control/login
		driver.get("https://leafground.com/dashboard.xhtml");
		// To Maximize the browser opened
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("(//ul[@class='layout-menu']/li)[2]")).click();
		driver.findElement(By.xpath("//span[text()='Alert']/..")).click();
		
		//File source = driver.getScreenshotAs(OutputType.FILE);
		File source = driver.findElement(By.xpath("//img")).getScreenshotAs(OutputType.FILE);
		File dest = new File("./snaps/IMG002.png");
		FileUtils.copyFile(source, dest);
	
	
	
	
	
	}
}
