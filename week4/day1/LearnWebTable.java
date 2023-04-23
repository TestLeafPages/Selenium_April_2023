package week4.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {
	public static void main(String[] args) {
		// To Open Chrome Browser
		ChromeDriver driver = new ChromeDriver();
		// To load an URL - http://leaftaps.com/opentaps/control/login
		driver.get("https://leafground.com/");
		// To Maximize the browser opened
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Find the table as an webelement
		WebElement elementTable = driver.findElement(By.xpath("//div[@id='j_idt154_content']/table"));

		// From the table found, finding the rows inside the table
		List<WebElement> elementsRows = elementTable.findElements(By.tagName("tr"));
		System.out.println("No. of rows in the table: " + elementsRows.size());

		for (int j = 1; j < elementsRows.size(); j++) {
			// Finding one row from the list of rows
			WebElement elementRow = elementsRows.get(j);

			// From a row, find the columns inside the row
			List<WebElement> elementsColumns = elementRow.findElements(By.tagName("td"));
			System.out.println("No. of data in the column: " + elementsColumns.size());

			// Iterate over the columns and get the data
			for (int i = 0; i < elementsColumns.size(); i++) {
				// Finding one column from the list of columns
				WebElement column = elementsColumns.get(i);
				System.out.println(column.getText());
			}
		}

	}
}
