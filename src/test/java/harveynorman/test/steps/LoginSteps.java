package harveynorman.test.steps;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	
	WebDriver driver;

	@Before()
	public void setup() {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\rubat\\Desktop\\Orbit\\cucumber\\workspace\\harveynorman.cucumber\\src\\test\\resources\\geckodriver.exe");
		this.driver = new FirefoxDriver();
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
	}
	
	@Given("^User navigates to Fetchcourses website$")
	public void user_navigates_to_Fetchcourses_website() throws Throwable {
		driver.get("https://www.fetchcourses.ie/");
	}

	@Given("^User clicks on the login button on homepage$")
	public void user_clicks_on_the_login_button_on_homepage() throws Throwable {
		driver.findElement(By.xpath("//a[contains(text(), 'Sign In')]")).click();
	}

	@Given("^User enters a valid username$")
	public void user_enters_a_valid_username() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"EmailAddress\"]")).sendKeys("rubatanisa@gmail.com");
	}

	@Given("^User enters a valid password$")
	public void user_enters_a_valid_password() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("Dhaka521453");
	}

	@When("^User clicks on the signin button$")
	public void user_clicks_on_the_signin_button() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div/div[1]/form/button")).click();
	}

	@Then("^User should be taken to the successful login page$")
	public void user_should_be_taken_to_the_successful_login_page() throws Throwable {	
		Thread.sleep(3000);
		WebElement welcome = driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[3]/h4"));
		Assert.assertEquals(true, welcome.isDisplayed());
	}
}
