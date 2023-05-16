package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import swiggyBaseClass.BaseClass;

public class LoginPage extends BaseClass {
	@FindBy(xpath = "//a[@class='x4bK8']")
	WebElement Login;

	@FindBy(xpath = "//input[@name='mobile']")
	WebElement mobile;

	@FindBy(xpath="//a[@class='a-ayg']")
	WebElement submit;

	public LoginPage() {
		PageFactory.initElements(driver, this);
		Login.click();
	}

	public void Login(String mobile) {
		
		this.mobile.sendKeys(mobile);
		submit.click();
	}
}