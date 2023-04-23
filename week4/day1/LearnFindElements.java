package week4.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFindElements {
	public static void main(String[] args) {
		// To Open Chrome Browser
		ChromeDriver driver = new ChromeDriver();
		// To load an URL - http://leaftaps.com/opentaps/control/login
		driver.get("https://www.amazon.in/");
		// To Maximize the browser opened
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Search for a product
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Samsung Mobiles",Keys.ENTER);
		//Finding multiple elements
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='sg-row']//h2"));
		for (WebElement eachElement : elements) {
			System.out.println(eachElement.getText());
		}
	}
}
