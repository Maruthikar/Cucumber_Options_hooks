package stepdefinitionfile;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Regular_Expressions {
	WebDriver driver;
	
	@Given("^Open browser and Enter URL$")
	public void open_browser_and_enter_url() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://myschoolbot.com/site/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		String School = driver.getTitle();
		System.out.println("-------My School Bot Site Name is------------ "+ School );
	}

	@When("^Enter Valid username \"([^\"]*)\" email field$")
	public void enter_valid_username_email_field(String username) {
		WebElement user = driver.findElement(By.id("form-username"));
//		 driver.findElement(By.id("form-username")).sendKeys(username);
		drawbBrowder(user, driver);
		user.sendKeys(username);
		
	}

	@Then("^Enter valid password \"([^\"]*)\" Password field$")
	public void enter_valid_password_password_field(String password) throws InterruptedException {
		
		WebElement pass= driver.findElement(By.id("form-password"));
		drawbBrowder(pass, driver);
		pass.sendKeys(password);
		
	
		
//		driver.findElement(By.id("form-password")).sendKeys(password);
		
		
	}

	@And("^Click on login$")
	public void click_on_login() {

		WebElement login =driver.findElement(By.className("btn"));
		drawbBrowder(login, driver);
		login.click();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2000));
		String account =driver.getTitle();
		System.out.println("-----Print My Account Title----- :" +account);
	}

	@Then("^User should logout$")
	public void user_should_logout() throws InterruptedException {

		WebElement menu = driver.findElement(By.className("topuser-image"));
		drawbBrowder(menu, driver);
		menu.click();
		Thread.sleep(2000);
		String image = driver.getTitle();
		System.out.println("----- Image Icon Title is----------- " + image);
		
		WebElement logout = driver.findElement(By.xpath("//*[.='Logout']"));
		drawbBrowder(logout, driver);
		Thread.sleep(2000);
		logout.click();
		
		driver.quit();
		
	}
	
	
	public static void drawbBrowder(WebElement element,WebDriver Driver) {
		
		JavascriptExecutor js=((JavascriptExecutor)Driver);
		js.executeScript("arguments[0].style.border='3px solid red'", element);
	}
	

}
