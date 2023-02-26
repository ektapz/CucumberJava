//package StepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.*;
//import pages.loginpage;
//
//public class datatableexample {
//	public static WebDriver Driver;
//	loginpage login;
//	@Given("Browser is open")
//	public void browser_is_open() {
//		System.out.println("Browser is open");
//		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/test/resources/Drivers/chromedriver.exe");
//		Driver=new ChromeDriver();
//		//Driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
//		//Driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
//		//Driver.manage().window().maximize();
//	}
//	
//
//	@Given("User in on login page")
//	public void user_in_on_login_page() {
//		
//		 System.out.println("User is on testproject");
//		    Driver.navigate().to("https://example.testproject.io");
//	}
//
//	@When("^User enter (.*) and (.*)$")
//	public void user_enter_username_and_password(String username,String password) throws InterruptedException {
//		  System.out.println("enter username and password");
//		   login=new loginpage(Driver);
//		  login.UserName(username);
//		  login.Enterpassword(password);
//		  
////		   Driver.findElement(By.id("name")).sendKeys(username);
////		   Driver.findElement(By.id("password")).sendKeys(password);
//		   Thread.sleep(2000);
//	
//	}
//
//	@And("user click on login")
//	public void user_click_on_login() {
//		 System.out.println("click on login button");
//		 login.clickloginbtn();
////		  Driver.findElement(By.id("login")).click();
//	}
//
//	@Then("user is navigate to the home page")
//	public void user_is_navigate_to_the_home_page() {
//		System.out.println("Navigate to login page'");
//	    Driver.findElement(By.id("logout")).isDisplayed();
//	    Driver.close();
//	}
//
//
//}
