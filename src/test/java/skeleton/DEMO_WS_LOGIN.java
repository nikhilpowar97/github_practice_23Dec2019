package skeleton;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class DEMO_WS_LOGIN {
	

	
		WebDriver driver;
		@Given("the DEMO_WS home page is opened amd log in link is clicked")
		public void the_DEMO_WS_home_page_is_opened_amd_log_in_link_is_clicked() {
			
			System.setProperty("webdriver.chrome.driver", "C:\\NIKHIL p\\chromedriver_win32\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.get("http://demowebshop.tricentis.com/");
			driver.findElement(By.linkText("Log in")).click();
			
			
			
			
		    // Write code here that turns the phrase above into concrete actions
		    //throw new cucumber.api.PendingException();
		}

		@When("i provide lohin id and password and click LOGIN btn")
		public void i_provide_lohin_id_and_password_and_click_LOGIN_btn() {
			
			driver.findElement(By.id("Email")).sendKeys("karthik456@gmail.com");
			driver.findElement(By.id("Password")).sendKeys("karthik456");
			driver.findElement(By.cssSelector("input[value='Log in']")).submit();
			
		    // Write code here that turns the phrase above into concrete actions
		    //throw new cucumber.api.PendingException();
		}

		@Then("user should goto next page of products")
		public void user_should_goto_next_page_of_products() {
			
			
			Assert.assertEquals(driver.getTitle(),"Demo Web Shop");
			System.out.println("success");
			driver.close();
			
			
			
			
			
		    // Write code here that turns the phrase above into concrete actions
		    //throw new cucumber.api.PendingException();
		}
		

	}



