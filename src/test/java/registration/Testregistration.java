package registration;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Testbase.Testbase;
import uiactions.Registrationpage;

public class Testregistration extends Testbase {
	Registrationpage registrationpage;
	@BeforeTest
	public  void setup() throws IOException{
            init();
            
		}
	
	@Test
	public void checklogin(){
		registrationpage= new Registrationpage(driver);

		registrationpage.login1("HYD", "IND", "SOMETHINGS"," 514707", "NOTHING", "AP", "5110"," ruesherbrooke", "nocompany"," jacky"," nacky"," lacky", "makki", "eshu@gmail.com", "nenchepanu");
		

}
}