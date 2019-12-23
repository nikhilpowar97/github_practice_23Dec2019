package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class alex_addtocart {
	WebDriver driver;
	@Given("Alex has registered in test me app")
	public void alex_has_registered_in_test_me_app() {
		System.setProperty("webdriver.chrome.driver", "C:\\NIKHIL p\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp");
		driver.findElement(By.linkText("SignIn")).click();
		driver.findElement(By.name("userName")).sendKeys("Lalitha");
		driver.findElement(By.name("password")).sendKeys("Password123");
		driver.findElement(By.name("Login")).click(); 
	    
	}

	@When("Alex search a product like headphones")
	public void alex_search_a_product_like_headphones() throws Exception {
		driver.findElement(By.id("myInput")).sendKeys("head");
	      driver.findElement(By.cssSelector("input[value='FIND DETAILS']")).submit();
	      
	}

	@When("Alex try to proceed to payment without adding any item in the cart")
	public void alex_try_to_proceed_to_payment_without_adding_any_item_in_the_cart() {
		driver.findElement(By.partialLinkText("Cart")).click();	
	}

	@Then("test me app does not display the cart icon")
	public void test_me_app_does_not_display_the_cart_icon() {
		Assert.assertEquals(driver.getTitle(), "View Cart");
		
		System.out.println("ALex is able to access the cart page ");
	    
	}

}
