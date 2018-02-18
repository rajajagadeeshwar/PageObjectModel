package uiactions;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import Testbase.Testbase;

public class Registrationpage extends Testbase {

	WebDriver driver;

	@FindBy(xpath = ".//*[@id='header']/div[2]/div/div/nav/div[1]/a")
	WebElement signinbutton;

	@FindBy(xpath = ".//*[@id='email_create']")
	WebElement emailid;

	@FindBy(xpath = ".//*[@id='SubmitCreate']")
	WebElement submitbutton;

	@FindBy(xpath = ".//*[@id='id_gender1']")
	WebElement gender;

	@FindBy(xpath = ".//*[@id='customer_firstname']")
	WebElement firstname;

	@FindBy(xpath = ".//*[@id='customer_lastname']")
	WebElement lastname;

	@FindBy(xpath = ".//*[@id='email']")
	WebElement email;

	@FindBy(xpath = ".//*[@id='passwd']")
	WebElement password;

	@FindBy(xpath = ".//*[@id='days']")
	WebElement days;

	@FindBy(xpath = ".//*[@id='months']")
	WebElement month;

	@FindBy(xpath = ".//*[@id='years']")
	WebElement year;

	@FindBy(xpath = ".//*[@id='newsletter']")
	WebElement subbutton;

	@FindBy(xpath = ".//*[@id='optin']")
	WebElement recbutton;

	@FindBy(xpath = ".//*[@id='firstname']")
	WebElement firstname1;

	@FindBy(xpath = ".//*[@id='lastname']")
	WebElement lastname1;

	@FindBy(xpath = ".//*[@id='company']")
	WebElement company;

	@FindBy(xpath = ".//*[@id='address1']")
	WebElement address1;

	@FindBy(xpath = ".//*[@id='address2']")
	WebElement address2;

	@FindBy(xpath = ".//*[@id='city']")
	WebElement city;

	@FindBy(xpath = "	.//*[@id='id_state']")
	WebElement state;

	@FindBy(xpath = ".//*[@id='postcode']")
	WebElement postcode;

	@FindBy(xpath = ".//*[@id='id_country']")
	WebElement countryname;

	@FindBy(xpath = ".//*[@id='other']")
	WebElement other;

	@FindBy(xpath = ".//*[@id='phone_mobile']")
	WebElement mobile;

	@FindBy(xpath = "	.//*[@id='alias']")
	WebElement alias;

	@FindBy(xpath = "	.//*[@id='submitAccount']")
	WebElement submit;

	public Registrationpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void login1(String city, String countryn, String other, String mobilen, String aliasn, String state,
			String addr1, String addr2, String comp, String firstname, String fname, String lname, String lastname,
			String email, String password) {

		signinbutton.click();
logger.info("click on signin button");
		// this.emailid.sendKeys(emailid);

		
		@SuppressWarnings("resource")
		Scanner raja = new Scanner(System.in);   // using scanner, typing the email id dynamically

		System.out.println("enter the id");
		String nwe = raja.nextLine();
		emailid.sendKeys(nwe);
		logger.info("using scanner class dynamically giving the input");
		
		submitbutton.click();
		gender.click();
		this.firstname.sendKeys(firstname);
		this.lastname.sendKeys(lastname);
		this.email.sendKeys(email);
		this.password.sendKeys(password);
		logger.info("using this keyword to access the class variable");

		Select daysbutton = new Select(days);

		daysbutton.selectByIndex(2);
		logger.info("selecting the dropdown, using select class ");

		Select monthbutton = new Select(month);

		monthbutton.selectByIndex(2);

		Select yearbutton = new Select(year);

		yearbutton.selectByIndex(2);

		subbutton.click();
		recbutton.click();
		firstname1.sendKeys(fname);
		lastname1.sendKeys(lname);

		company.sendKeys(comp);
		address1.sendKeys(addr1);
		address2.sendKeys(addr2);

		this.city.sendKeys(city);
		this.state.sendKeys(state);
		this.countryname.sendKeys(countryn);

		this.other.sendKeys(other);
		mobile.sendKeys(mobilen);
		alias.sendKeys(aliasn);
		 submit.click();

	}

}
