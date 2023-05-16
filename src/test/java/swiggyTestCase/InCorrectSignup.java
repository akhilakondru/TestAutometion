package swiggyTestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.InCorrectMn;
import swiggyBaseClass.BaseClass;

public class InCorrectSignup extends BaseClass {
	@Test
	public void tc003_Vlidation_Flow() {

		InCorrectMn im = new InCorrectMn();
		im.signup("234", "akhila", "akhila1999@gmail.com");
		Assert.assertEquals("Order food online from India's best food delivery service. Order from restaurants near youA",driver.getTitle());
				

	}

}
