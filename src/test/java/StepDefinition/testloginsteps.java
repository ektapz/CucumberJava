//package StepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.*;
//
//public class testloginsteps {
//	WebDriver Driver=null;
//	
//	
//		
//	   
//			@Given("Browser is open")
//			public void browser_is_open() {
//
//				System.out.println("Browser is open");
//				System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/test/resources/Drivers/chromedriver.exe");
//				Driver=new ChromeDriver();
//				//Driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
//				//Driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
//				//Driver.manage().window().maximize();
//			}
//			
//			
//
//			@Given("User in on login page")
//			public void user_in_on_login_page() {
//			    System.out.println("User is on testproject");
//			    Driver.navigate().to("https://example.testproject.io");
//			}
//
//			@When("User enter fullname and password")
//			public void user_enter_fullname_and_password() throws InterruptedException {
//			   System.out.println("enter username and password");
//			   Driver.findElement(By.id("name")).sendKeys("EKTA");
//			   Driver.findElement(By.id("password")).sendKeys("12345");
//			   Thread.sleep(2000);
//			}
//
//			@When("User click login Button")
//			public void user_click_login_button() {
//			  System.out.println("click on login button");
//			  Driver.findElement(By.id("login")).click();
//			}
//
//			@Then("User navigate on login page")
//			public void user_navigate_on_login_page() {
//				System.out.println("Navigate to login page'");
//			    Driver.findElement(By.id("logout")).isDisplayed();
//			    Driver.close();
//			}
//}