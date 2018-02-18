package uiactions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

	WebDriver driver;
	//Homepage homepage;
	
	@FindBy(xpath=".//*[@id='header']/div[2]/div/div/nav/div[1]/a")
	WebElement signinbutton;
	
	
	@FindBy(xpath=".//*[@id='email']")
	WebElement emailid;
	
	@FindBy(xpath=".//*[@id='passwd']")
	WebElement password;
	
	@FindBy(xpath=".//*[@id='SubmitLogin']")
	WebElement loginbutton;
	
	@FindBy(xpath=".//*[@id='center_column']/div[1]/ol/li")
    WebElement authenticationfailed;
	

public Homepage(WebDriver driver){
	PageFactory.initElements(driver, this);
}

public void logintoapplication(String uname, String pwd){
	signinbutton.click();
	
	emailid.sendKeys(uname);
	password.sendKeys(pwd);
	loginbutton.click();
	
}
public String getinvalidtext(){
	
	return authenticationfailed.getText();
}

}
