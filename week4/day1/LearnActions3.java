package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnActions3 {
	public static void main(String[] args) {
		// To Open Chrome Browser
		ChromeDriver driver = new ChromeDriver();
		// To load an URL - http://leaftaps.com/opentaps/control/login
		driver.get("https://jqueryui.com/selectable/");
		// To Maximize the browser opened
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// Going inside the room
		// switching into the frame using index & index starts with 0
		driver.switchTo().frame(1);
		// switching into the frame using String & String is value of ID or Name attribute in the <iframe>
//		driver.switchTo().frame("frameID");
//		driver.switchTo().frame("frameName");
		// switching into the frame using Webelement
		//WebElement frameElement = driver.findElement(By.className("demo-frame"));
		//driver.switchTo().frame(frameElement);
		WebElement item2 = driver.findElement(By.xpath("//li[text()='Item 2']"));
		WebElement item4 = driver.findElement(By.xpath("//li[text()='Item 4']"));
		WebElement item6 = driver.findElement(By.xpath("//li[text()='Item 6']"));
		Actions builder = new Actions(driver);
		// accessing the phone
		builder.keyDown(Keys.CONTROL)
		.click(item2)
		.click(item4)
		.click(item6)
		.keyUp(Keys.CONTROL)
		.perform();
		// switching from frame to main web page(HTML)
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Download")).click();
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
