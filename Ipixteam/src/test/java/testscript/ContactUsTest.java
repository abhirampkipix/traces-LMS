package testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import lmsmodules.ContactUs;
import lmsmodules.LoginForm;
import utilities.ExcelUpload;
//import lmsmodules.ExcelUpload;

public class ContactUsTest extends Base {
  @Test
	public void contactForm() throws IOException {
	  
	  
	  String conatctNameField="Abhiram";
	  String enetrContactEmailAddress="abhiram.pk98836@gmail.com";
	  String enterMobileContact="9072408985";
	  String enterContactEnquiryinput="good";
	  
	/* String registerFirstNameField=ExcelUpload.getStringData(1, 0, "Sheet1");     
	 String registerLastNameField=ExcelUpload.getStringData(1, 1, "Sheet1");                  
	 String registerenterEmailAddress=ExcelUpload.getStringData(1, 2, "Sheet1"); 
	 String registerenterPassword=ExcelUpload.getStringData(1, 3, "Sheet1");
	 String registerenterConfirmPassword=ExcelUpload.getStringData(1, 4, "Sheet1");*/
	 
	  ContactUs contact=new ContactUs(driver);
		
	       contact.contactClick();
	       contact.enterName(conatctNameField);
	       contact.enterContactEmail(enetrContactEmailAddress); 
	       contact.enterContactNumber(enterMobileContact);
	       contact.enterContactEnquiry(enterContactEnquiryinput);
	       contact.submitEnquiry();
		  
		  
  }
          		  
	}
	


