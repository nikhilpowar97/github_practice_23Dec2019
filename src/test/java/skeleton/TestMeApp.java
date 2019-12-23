package skeleton;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestMeApp {
	WebDriver driver;
	@Given("john launched chrome browser")
	public void john_launched_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\NIKHIL p\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
	}

	@Given("provided testmeapp site url")
	public void provided_testmeapp_site_url() {
		driver.get("http://10.232.237.143:443/TestMeApp");
	 	}

	@When("he clicks on login")
	public void he_clicks_on_login() {
		driver.findElement(By.linkText("SignIn")).click();
	}

	@Then("he shall be able to provide credentials")
	public void he_shall_be_able_to_provide_credentials() {
		driver.findElement(By.name("userName")).sendKeys("Lalitha");
		driver.findElement(By.name("password")).sendKeys("password123");
		driver.findElement(By.name("Login")).click(); 
	   	}

	@When("he clicks on register link")
	public void he_clicks_on_register_link() {
		 driver.findElement(By.linkText("SignUp")).click();
	}

	@Then("he shall be able to provide registration details")
	public void he_shall_be_able_to_provide_registration_details() {
	   Assert.assertEquals(driver.getTitle(),"Sign Up");
	   System.out.println("Registration");
	   
	}

}
