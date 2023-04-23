package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class LearnAlertsClassroom {
	public static void main(String[] args) throws InterruptedException {
		// To Open Chrome Browser
		EdgeDriver driver = new EdgeDriver();
		// To load an URL - http://leaftaps.com/opentaps/control/login
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		// To Maximize the browser opened
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Shilpa");
		alert.accept();
		String name = "Shilpa";
		String text = driver.findElement(By.id("demo")).getText();
		if(text.toLowerCase().contains(name.toLowerCase())) {
			System.out.println("Text contains the name "+text);
		}else {
			System.out.println("The text doesnot contain the name entered");
		}
	
	
	
	}
}
