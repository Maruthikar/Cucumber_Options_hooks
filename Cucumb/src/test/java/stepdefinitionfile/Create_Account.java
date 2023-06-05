package stepdefinitionfile;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Create_Account {

	WebDriver driver;
	
	
	@Given("User navigates to login page")
	public void user_navigates_to_login_page() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String login = driver.getTitle();
		System.out.println("----Getting Login Page title -----" + login);
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}

	@Then("^User clicks on Create new accouunt option$")
	public void user_clicks_on_create_new_accouunt_option() throws InterruptedException {
		WebElement create = driver.findElement(By.xpath("//*[.='Create new account']"));
		drawbBrowder(create, driver);
		create.click();
		String creat = driver.getTitle();
		System.out.println("----Getting Login Page title -----" + creat);
		Thread.sleep(2000);

	}
	   

	@Then("^User enters \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" in registration details$")
	public void user_enters_in_registration_details(String first, String surname, String email, String reenter, String password, String date, String month, String year, String gender) throws InterruptedException {
		
	WebElement fir = driver.findElement(By.xpath("//input[@name='firstname']"));
	drawbBrowder(fir, driver);
	fir.sendKeys(first);
		
	WebElement sur = driver.findElement(By.name("lastname"));
	drawbBrowder(sur, driver);
	sur.sendKeys(surname);
	
	WebElement mail = driver.findElement(By.name("reg_email__"));
	drawbBrowder(mail, driver);
	mail.sendKeys(email);
	Thread.sleep(1000);
	
	WebElement reent = driver.findElement(By.xpath("//input[@aria-label='Re-enter email address']"));
	drawbBrowder(reent, driver);
	reent.sendKeys(reenter);
	
	WebElement pass = driver.findElement(By.name("reg_passwd__"));
	drawbBrowder(pass, driver);
	pass.sendKeys(password);
	
	WebElement da = driver.findElement(By.id("day"));
	drawbBrowder(da, driver);
	da.sendKeys(date);
	
	WebElement mon = driver.findElement(By.id("month"));
	drawbBrowder(mon, driver);
	mon.sendKeys(month);
	
	
	WebElement yer = driver.findElement(By.id("year"));
	drawbBrowder(yer, driver);
	yer.click();
	Thread.sleep(1000);
	yer.sendKeys(year);
	
	
	WebElement mal = driver.findElement(By.xpath("//*[.='Male']"));
	drawbBrowder(mal, driver);
	mal.click();
	
	}

	@And("^User clicks on Sign up$")
	public void user_clicks_on_sign_up() {
		
		WebElement sub = driver.findElement(By.name("websubmit"));
		drawbBrowder(sub, driver);
		sub.click();
		String subb = driver.getTitle();
		System.out.println("-----Get title After Submit-----" + subb);
		
		
		
	}

	@Then("^User account should get created successfully$")
	public void user_account_should_get_created_successfully() throws InterruptedException {
		
		
		String Otp = driver.getTitle();
		System.out.println("-----Get title before sucessful----- is " + Otp);
		Thread.sleep(2000);
		driver.quit();
		
	}



	public static void drawbBrowder(WebElement element,WebDriver Driver) {
		
		JavascriptExecutor js=((JavascriptExecutor)Driver);
		js.executeScript("arguments[0].style.border='3px solid red'", element);
	}
	
	
	
	
}
