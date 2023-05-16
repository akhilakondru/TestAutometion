

package swiggyTestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.SignupPage;
import swiggyBaseClass.BaseClass;

@Test
public class SignupTestCase extends BaseClass {
	
	@Test
	public void tc002_Validation_Flow() {
		
		SignupPage sp=new SignupPage();
		sp.Signup("8008464570", "akhila", "akhila1999@gmail.com");	
		Assert.assertEquals("Order food online from India's best food delivery service. Order from restaurants near you", driver.getTitle());
		}
	}


