package swiggyTestCase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import swiggyBaseClass.BaseClass;

public class LoginTestCase extends BaseClass {
	
	@Test
	public void tc001_Validation_Flow() {
		LoginPage lp=new LoginPage();
		
		lp.Login("8008464570");
		
		Assert.assertEquals("Order food online from India's best food delivery service. Order from restaurants near you", driver.getTitle());
		
	
	
	}

}
