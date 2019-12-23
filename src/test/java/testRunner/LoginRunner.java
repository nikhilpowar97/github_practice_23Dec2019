package testRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="C:\\NIKHIL p\\cucumber-skeleton-project-4.0\\cucumber-skeleton-project-4.0\\src\\test\\resources\\skeleton\\addtocart.feature",
        glue= {"skeleton"},
        plugin= {"pretty","html:target/add--to-cart-html-report"}
                 )
public class LoginRunner {

}
