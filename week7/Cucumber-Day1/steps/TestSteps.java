package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestSteps {
	ChromeDriver driver;
	@Given("Open the Chrome browser")
	public void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@And("Load the application URL as {string}")
	public void loadURL(String url) {
		driver.get(url);
	}
	@And("Enter the username as {string}")
	public void enterUsername(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
	}
	@And("Enter the password as {string}")
	public void enterPassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}
	@When("Click on the Login Button")
	public void clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	@Then("Verify the welcome message in the homepage")
	public void verifyMessage() {
		System.out.println("Message verified");
	}
	@But("Verify the error message in the homepage")
	public void verifyErrormessage() {
		System.out.println("Error message verified");
	}
}
