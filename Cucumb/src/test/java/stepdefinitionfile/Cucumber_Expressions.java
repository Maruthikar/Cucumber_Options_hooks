package stepdefinitionfile;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Cucumber_Expressions {
	
	WebDriver driver;
	@Given("Open browser and Enter Valid URL")
	public void open_browser_and_enter_valid_url() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	String sautitle = driver.getTitle();
	System.out.println("----------Saucedemo is here----------- :"+sautitle);
		
		
	}
	

	@When("Enter Valid username email field")
	public void enter_valid_username_email_field() throws InterruptedException {
		WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
		username.sendKeys("standard_user");
		drawbBrowder(username, driver);
		Thread.sleep(2000);
		
		
	}

	@Then("Enter valid password")
	public void enter_valid_password() throws InterruptedException {
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("secret_sauce");
		drawbBrowder(password, driver);
		
		Thread.sleep(1000);
		
	}

	@And("Click on login button")
	public void click_on_login_button() throws InterruptedException {
		
		WebElement login =driver.findElement(By.id("login-button"));
		drawbBrowder(login, driver);
		login.click();
		Thread.sleep(2000);
		
	}

	@Then("User should login successfully")
	public void user_should_login_successfully() {
		
		String inventory = driver.getTitle();
		System.out.println("-------After Login The Title is ----------- :"+ inventory);
		
	}

	@And("User should logout successfully")
	public void user_should_logout_successfully() throws InterruptedException {
		WebElement menu = driver.findElement(By.id("react-burger-menu-btn"));
		drawbBrowder(menu, driver);
		menu.click();
		Thread.sleep(2000);
		
		WebElement logout =driver.findElement(By.id("logout_sidebar_link"));
		drawbBrowder(logout, driver);
		Thread.sleep(2000);
		logout.click();
	
		
		String logut = driver.getTitle();
		System.out.println("----------After Logout The Title is ----------- :"+logut);
		
		driver.quit();

	}
	
	public static void drawbBrowder(WebElement element,WebDriver Driver) {
		
		JavascriptExecutor js=((JavascriptExecutor)Driver);
		js.executeScript("arguments[0].style.border='3px solid red'", element);
	}
	
}
