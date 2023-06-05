package stepdefinitionfile;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class My_Account {
	
	 WebDriver driver;
	
	@Given("Enter the given URL")
	public void enter_the_given_url() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String demo = driver.getTitle();
		System.out.println("---Print Title--- :" +demo);
		System.out.println("----Tutorialsninja----");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

	}

	@Then("Click on My Account")
	public void click_on_my_account() throws InterruptedException {
		
		WebElement account = driver.findElement(By.xpath("//*[.='My Account']"));
		drawbBrowder(account, driver);
		Thread.sleep(2000);
		account.click();
		String My = driver.getTitle();
		System.out.println("--My Account title-- : "+ My);
		Thread.sleep(2000);
		System.out.println("----Tutorialsninja My Account----");
		driver.quit();
		
	}

public static void drawbBrowder(WebElement element,WebDriver Driver) {
		
		JavascriptExecutor js=((JavascriptExecutor)Driver);
		js.executeScript("arguments[0].style.border='3px solid red'", element);
	}
}
