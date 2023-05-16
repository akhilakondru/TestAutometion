package swiggyTestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LocationPage;
import swiggyBaseClass.BaseClass;

public class LocationTextCase  extends BaseClass {
	
	public void tc001_Validation_flow() {
		
		LocationPage lp=new LocationPage();

	lp.enterDelaivaryLocation("hyderabad");
	Assert.assertEquals("", driver.getTitle());
	
	
	
	
	

}
}