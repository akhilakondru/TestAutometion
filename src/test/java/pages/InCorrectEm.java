package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import swiggyBaseClass.BaseClass;

public class InCorrectEm extends BaseClass {

	@FindBy(xpath = "//a[@class='r2iyh']")
	WebElement sign_up;

	@FindBy(xpath = "//input[@id='mobile']")
	WebElement mobile;

	@FindBy(xpath = "//input[@id='name']")
	WebElement name;

	@FindBy(xpath = "//input[@id='email']")
	WebElement email;

	@FindBy(xpath = "//a[@class='a-ayg']")
	WebElement submit;

	public InCorrectEm() {

		PageFactory.initElements(driver, this);
		sign_up.click();

	}

	public void signup(String mobile, String name, String email) {
		this.mobile.sendKeys(mobile);
		this.name.sendKeys(name);
		this.email.sendKeys(email);
		submit.click();

	}

}
