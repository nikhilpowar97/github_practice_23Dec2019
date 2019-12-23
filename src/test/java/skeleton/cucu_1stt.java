package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class cucu_1stt {
	
	WebDriver driver;
	
	@Given("the user is on the testme app homepage")
	public void the_user_is_on_the_testme_app_homepage() {		
		System.setProperty("webdriver.chrome.driver", "C:\\NIKHIL p\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.findElement(By.linkText("SignIn")).click();
		
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("the user gives valid login and valid password")
	public void the_user_gives_valid_login_and_valid_password() {
		
		
		driver.findElement(By.name("userName")).sendKeys("Lalitha");
		
		driver.findElement(By.name("password")).sendKeys("password123");
		driver.findElement(By.name("Login")).click();
	    
	}

	@Then("user should goto next page")
	public void user_should_goto_next_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	   String username=driver.findElement(By.cssSelector("ul.nav navbar-nav")).getText();
	   System.out.println(username);
	   
	   driver.close();
	}

}
