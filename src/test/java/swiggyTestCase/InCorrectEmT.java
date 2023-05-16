package swiggyTestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.InCorrectEm;
import swiggyBaseClass.BaseClass;

public class InCorrectEmT extends BaseClass {
	@Test
	public void t004_Validation_Flow() {

		InCorrectEm im = new InCorrectEm();
		im.signup("8008464570", "akhila", "akhila@.com");
		WebElement invalidemailID=driver.findElement(By.xpath("//p[contains(text()'],'Please must contains at least charcters and @gmail.com to make your email is stronger')"));
		String excepted ="Please must contains at least charcters and @gmail.com to make your email is stronger ";
		Assert.assertEquals("excepted",invalidemailID.getText());
				
				
	}
}
