package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import swiggyBaseClass.BaseClass;

public class LocationPage extends BaseClass {
	
	@FindBy(xpath="//input[@id='location']")
	WebElement locationTextBox;
	
	@FindBy(xpath="//span[text()='FIND FOOD']")
	WebElement findfood;
	
	public LocationPage() {
		PageFactory.initElements(driver, this);
	}
	public WebElement getButtonLocation() {
		return locationTextBox;
		
	}
	public void enterDelaivaryLocation(String delaiveryLocation) {
		this.locationTextBox.sendKeys("locationText");
		//WebElement selectLocation=driver.findElement(By.xpath("//button[@tabIndex='2']//span[contains(text()='hyderabad])"));
		//clickElement(selectLocation);
		
		
	}

		
	}


