package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnActions1 {
	public static void main(String[] args) {
		// To Open Chrome Browser
		ChromeDriver driver = new ChromeDriver();
		// To load an URL - http://leaftaps.com/opentaps/control/login
		driver.get("https://jqueryui.com/draggable/");
		// To Maximize the browser opened
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.switchTo().frame(0);
		
		WebElement element = driver.findElement(By.id("draggable"));
		
		Point location = element.getLocation();
		int x = location.getX();
		int y = location.getY();
		
		Actions builder = new Actions(driver);
		builder
		.dragAndDropBy(element, x+100, y+100).perform();;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
