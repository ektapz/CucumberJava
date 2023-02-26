package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	WebDriver Driver;
	 public loginpage(WebDriver Driver) {
		    this.Driver=Driver;
		    PageFactory.initElements(Driver, this);
		    if(!Driver.getTitle().contains("TestProject Demo")) {
		    	throw new IllegalStateException ("This is not login page. The current page is"+ Driver.getCurrentUrl());
		    }
		    }
	
    @FindBy (id="name")WebElement txtusername;
    @FindBy (id="password")WebElement txtpassword;
    @FindBy (id="login")WebElement loginpage;
    @FindBy (id="logout")WebElement logoutpage;
    
   
    
    public void UserName(String uname) {
    txtusername.sendKeys(uname);
    }
    public void Enterpassword(String password) {
        txtpassword.sendKeys(password);
        }
    public void clickloginbtn() {
        loginpage.click();;
        }
    public void Navigateonlogout() {
    	logoutpage.isDisplayed();
        }







}

