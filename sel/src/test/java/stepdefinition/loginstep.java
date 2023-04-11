package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class loginstep {
	WebDriver driver;

	
	@Given("browser is open")
	public void browser_is_open() {
	    // Write code here that turns the phrase above into concrete actions
	    //options = new ChromeOptions().setBinary("D:\\code\\sel\\src\\test\\resources\\file\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-orgins=*");
		options.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
		
		
		 WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver(options);
//		driver.get("https://practicetestautomation.com/practice-test-login/");
//		System.setProperty("webdriver.edge.driver", "D:\\code\\sel\\src\\test\\resources\\file\\msedgedriver.exe");
//        driver = new EdgeDriver();
        	}

	@And("user is on login page")
	public void user_is_on_login_page() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		driver.navigate().to("https://ui.cogmento.com/");
		
		
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("email")).sendKeys("hovihih121@duiter.com");
		driver.findElement(By.name("password")).sendKeys("Hello123@");
	    
	}

	@And("User clicks on login")
	public void user_clicks_on_login() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		
	    driver.findElement(By.className("submit")).click();
	    Thread.sleep(3000);
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
//		driver.findElement(By.className("settings")).isDisplayed();
	    Thread.sleep(2000);
	    driver.close();
	    driver.quit();
	}
}
