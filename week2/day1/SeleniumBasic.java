package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasic {
	public static void main(String[] args) {
		// To Open Chrome Browser
		ChromeDriver driver = new ChromeDriver();
		// To load an URL - http://leaftaps.com/opentaps/control/login
		driver.get("http://leaftaps.com/opentaps/control/login");
		// To Maximize the browser opened
		driver.manage().window().maximize();
		// To get the title of the page
		String title = driver.getTitle();
		System.out.println(title);
		// To get the url loaded on the page
		String url = driver.getCurrentUrl();
		System.out.println(url);
		// To close the browser
		driver.close();
	}
}
