package homepage;


import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Testbase.Testbase;
import uiactions.Homepage;

public class Testlogin extends Testbase {
	
	
	

	Homepage homepage;
	@BeforeTest
	public  void setup() throws IOException{
            init();
            
		}
	
	@Test
	public void checklogin(){
		homepage= new Homepage(driver);
homepage.logintoapplication("test@gmail.com","password123");
Assert.assertEquals(homepage.getinvalidtext(), "Authentication failed.");

	logger.info("valid credentials or not");
	}
	
	
@AfterClass
public void endtest(){
	driver.close();
	logger.info("close the browser");
}
}

