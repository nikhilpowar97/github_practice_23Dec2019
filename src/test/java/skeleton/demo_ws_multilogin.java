package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class demo_ws_multilogin {
	WebDriver driver;
	
	@Given("the test me hope page is opened")
	public void the_test_me_hope_page_is_opened() {
		System.setProperty("webdriver.chrome.driver", "C:\\NIKHIL p\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		
		
		
		
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("i provide {string} and {string}")
	public void i_provide_and(String Login, String Password) {
		
		driver.findElement(By.id("Email")).sendKeys(Login);
		driver.findElement(By.id("Password")).sendKeys(Password);
		driver.findElement(By.cssSelector("input[value='Log in']")).submit();;
		//driver.findElement(By.linkText("Log in")).click();
		
		
		
		
		
		
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}
	
	
	
	
	@Then("user should goto next")
	public void user_should_goto_next() {
		driver.findElement(By.linkText("Log Out")).click();
	    
		
		
		
		
		
		
		// Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}


}
