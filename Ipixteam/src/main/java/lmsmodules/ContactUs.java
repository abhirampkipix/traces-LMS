package lmsmodules;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContactUs {
	WebDriver driver;
	public ContactUs(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);//defining page factory
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	@FindBy(xpath="(//a[@href='https://tracez-lms.ipixsolutions.net/contact'])[1]")WebElement contactButton;
	@FindBy(xpath="(//input[@class='form-control'])[1]")WebElement nameField;
	@FindBy(xpath="(//input[@class='form-control'])[2]")WebElement contactEmail;
	@FindBy(xpath="(//input[@class='form-control'])[3]")WebElement contactPhone;
	@FindBy(xpath="//textarea[@class='form-control custom-scroll']")WebElement sentEnquiry;
	@FindBy(xpath="//button[@class='btn btn-primary fv-button-submit submit-btn']")WebElement enquiryClick;
	
	




	
	public ContactUs contactClick() {
		contactButton.click();
		return this;
	}
	public ContactUs enterName(String entername) {
		nameField.sendKeys(entername);
		return this;
	
	}
	
	public ContactUs enterContactEmail(String contactemailaddress) {
		contactEmail.sendKeys(contactemailaddress);
		return this;
	
	
}
	public ContactUs enterContactNumber(String contactphone) {
		contactPhone.sendKeys(contactphone);
		return this;
	
	
}
	public ContactUs enterContactEnquiry(String enquirytestarea) {
		enquiryClick.sendKeys(enquirytestarea);
		return this;
}
	
	public ContactUs submitEnquiry() {
		enquiryClick.click();
		return this;

}
}