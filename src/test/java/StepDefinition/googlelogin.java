package StepDefinition;

//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.*;
//
//public class googlelogin {
//	WebDriver Driver =null;
//	
//	@SuppressWarnings("deprecation")
//	@Given("Browser is open")
//	public void browser_is_open() {
//		System.out.println("Browser is open");
//		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/test/resources/Drivers/chromedriver.exe");
//		Driver=new ChromeDriver();
//		Driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
//		Driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
//		//Driver.manage().window().maximize();
//	}
//
//	@And("Users is on goofle search page")
//	public void users_is_on_goofle_search_page() {
//		System.out.println("User is on google search page");
//		Driver.navigate().to("https://www.google.com");
//	}
//
//	@When("User enter text in search box")
//	public void user_enter_text_in_search_box() {
//		System.out.println("enter the search text");
//		Driver.findElement(By.name("q")).sendKeys("Automation step by step");
//	}
//
//	@And("hit enter")
//	public void hit_enter() throws InterruptedException {
//		System.out.println("User hit enter button");
//		Driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//		Thread.sleep(2000);
//	}
//
//	@Then("User is enter to the search result")
//	public void user_is_enter_to_the_search_result() {
//		System.out.println("enter on search result");
//		Driver.getPageSource().contains("Online courses");
//		Driver.close();
//	}
//
//
//}
