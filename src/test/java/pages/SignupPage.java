package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import swiggyBaseClass.BaseClass;

public class SignupPage extends BaseClass {
	
	@FindBy(xpath="//a[@class='r2iyh']")
	WebElement sign_up;
	
	@FindBy(xpath="//input[@id='mobile']")
	WebElement mobile;
	
	@FindBy(xpath="//input[@id='name']")
	WebElement name;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement email;
	
//	@FindBy(xpath="//input[@type='submit']")
	
	
	@FindBy(xpath="//a[@class='a-ayg']")
	WebElement submit;
	
	public SignupPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	public void Signup(String mobile,String name,String email) {
		sign_up.click();

		this.mobile.sendKeys(mobile);
		this.name.sendKeys(name);
		this.email.sendKeys(email);
		submit.click();
	}

	
}
