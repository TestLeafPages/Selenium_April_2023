package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WebTableAssignment {
	public static void main(String[] args) throws InterruptedException {
		// To Open Chrome Browser
		EdgeDriver driver = new EdgeDriver();
		// To load an URL - http://leaftaps.com/opentaps/control/login
		driver.get("https://erail.in/");
		// To Maximize the browser opened
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement from = driver.findElement(By.id("txtStationFrom"));
		from.clear();
		from.sendKeys("MS",Keys.TAB);
		
		WebElement to = driver.findElement(By.id("txtStationTo"));
		to.clear();
		to.sendKeys("MDU",Keys.TAB);
		
		driver.findElement(By.id("chkSelectDateOnly")).click();
		Thread.sleep(2000);
		//finding the table
		WebElement table = driver.findElement(By.xpath("(//div[@id='divTrainsList']/table)[1]"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
//		for (int i = 0; i < rows.size(); i++) {
//			WebElement eachrow = rows.get(i);
//			List<WebElement> cols = eachrow.findElements(By.tagName("td"));
//			for (int j = 0; j < cols.size(); j++) {
//				System.out.println(cols.get(j).getText());
//			}
//		}
		List<String> list1 = new ArrayList<>();
		for (int i = 0; i < rows.size(); i++) {
			WebElement eachrow = rows.get(i);
			List<WebElement> cols = eachrow.findElements(By.tagName("td"));
			String text = cols.get(1).getText();
			System.out.println(text);
			list1.add(text);
		}
		
		driver.findElement(By.linkText("Train Name")).click();
		
		List<String> list2 = new ArrayList<>();
		for (int i = 0; i < rows.size(); i++) {
			WebElement eachrow = rows.get(i);
			List<WebElement> cols = eachrow.findElements(By.tagName("td"));
			String text = cols.get(1).getText();
			System.out.println(text);
			list2.add(text);
		}
		Collections.sort(list1);
		list1.equals(list2);
		
		
		
		
		
		
		
		
		
		
		
	}
}
