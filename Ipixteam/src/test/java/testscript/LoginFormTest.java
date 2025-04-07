package testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import lmsmodules.LoginForm;
import utilities.ExcelUpload;
//import lmsmodules.ExcelUpload;

public class LoginFormTest extends Base {
  @Test
	public void adminLogin() throws IOException {
	  
	  
	  String registerFirstNameField="Abhiram";
	  String registerLastNameField="pk";
	  String registerenterEmailAddress="abhiram.pk98ss836d@gmail.com";
	  String registerenterPassword="Abhiram@1";
	  String registerenterConfirmPassword="Abhiram@1";
	 
	  /* String registerFirstNameField=ExcelUpload.getStringData(1, 0, "Sheet1");     
	 String registerLastNameField=ExcelUpload.getStringData(1, 1, "Sheet1");                  
	 String registerenterEmailAddress=ExcelUpload.getStringData(1, 2, "Sheet1"); 
	 String registerenterPassword=ExcelUpload.getStringData(1, 3, "Sheet1");
	 String registerenterConfirmPassword=ExcelUpload.getStringData(1, 4, "Sheet1");
	  */
		  LoginForm login=new LoginForm(driver);
		
		  login.loginClick();
		  login.registerClick();
		  login.firstNameField(registerFirstNameField);
		  login.lastNameField(registerLastNameField); 
		  login.enterEmailAddress(registerenterEmailAddress);
		  login.enterPassword(registerenterPassword);
		  login.enterConfirmPassword(registerenterConfirmPassword);
		  login.registerSubmitClick();
		  
		  

          		  
	}
	

/*@Test(priority=1)
public void registerFormWithinavlidNameandEmail() throws IOException {
  
  
  String registerFirstNameField="Abhiram34";
  String registerLastNameField="pk";
  String registerenterEmailAddress="abhiram";

  
	 
	  LoginForm login=new LoginForm(driver);
	
	  login.loginClick();
	  login.registerClick();
	  login.firstNameField(registerFirstNameField);
	  login.lastNameField(registerLastNameField);
	  login.enterEmailAddress(registerenterEmailAddress);
	 
      		  
}*/
}