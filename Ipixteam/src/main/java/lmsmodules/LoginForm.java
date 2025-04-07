package lmsmodules;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginForm {
	WebDriver driver;
	public LoginForm(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);//defining page factory
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	@FindBy(xpath="//a[@href='https://tracez-lms.ipixsolutions.net/login']")WebElement loginButton;
	@FindBy(xpath="//a[@class='rounded create-account text-center cursor-pointer w-100']")WebElement registerButton;
	@FindBy(xpath="(//input[@class='form-control w-100 rounded-0'])[1]")WebElement firstName;
	@FindBy(xpath="(//input[@class='form-control w-100 rounded-0'])[2]")WebElement lastName;
	@FindBy(xpath="(//input[@class='form-control w-100 rounded-0'])[3]")WebElement mailAddress;
	@FindBy(xpath="(//input[@class='form-control w-100 rounded-0'])[4]")WebElement passWord;
	@FindBy(xpath="(//input[@class='form-control w-100 rounded-0'])[5]")WebElement confirmPassword;
	@FindBy(xpath="//button[@class='btn btn-primary fv-button-submit submit-btn']")WebElement registerSubmit;



	
	public LoginForm loginClick() {
		loginButton.click();
		return this;
	}
	public LoginForm registerClick() {
		registerButton.click();
		return this;
	
		
	}
	
	public LoginForm firstNameField(String firstname) {
		firstName.sendKeys(firstname);
		return this;
	
	
}
	public LoginForm lastNameField(String lastname) {
		lastName.sendKeys(lastname);
		return this;
	
	
}
	public LoginForm enterEmailAddress(String email) {
		mailAddress.sendKeys(email);
		return this;
}
	public LoginForm enterPassword(String password) {
		passWord.sendKeys(password);
		return this;
}
	public LoginForm enterConfirmPassword(String confirmpassword) {
		confirmPassword.sendKeys(confirmpassword);
		return this;
}
	public LoginForm registerSubmitClick() {
		registerSubmit.click();
		return this;
}
}