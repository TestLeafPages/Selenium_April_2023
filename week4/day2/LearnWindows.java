package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class LearnWindows {
	public static void main(String[] args) {
		// To Open Chrome Browser
		EdgeDriver driver = new EdgeDriver();
		// To load an URL - http://leaftaps.com/opentaps/control/login
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.irctc.co.in/nget/train-search");
		// To Maximize the browser opened
		// To get the window handle of the current page
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		driver.findElement(By.linkText("FLIGHTS")).click();
		
		
		// To identify the context
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		System.out.println(windowHandles.size());
		// Converting the set into a list
		List<String> list = new ArrayList<>(windowHandles);
		// Retrieve the window handle required from the list.
		String wh = list.get(1);
		
		// To switch to other window
		driver.switchTo().window(wh);
		
		// To identify the context
				System.out.println(driver.getTitle());
				System.out.println(driver.getCurrentUrl());
				
				driver.findElement(By.xpath("//span[text()='Hotels']/..")).click();
				driver.quit();
		
	}
}
