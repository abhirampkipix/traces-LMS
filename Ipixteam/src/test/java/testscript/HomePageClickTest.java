package testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import lmsmodules.ContactUs;
import lmsmodules.HomePageClicks;
import lmsmodules.LoginForm;
import utilities.ExcelUpload;
//import lmsmodules.ExcelUpload;

public class HomePageClickTest extends Base {
  @Test
	public void aboutUsPage() throws IOException {
	  
	  HomePageClicks about=new HomePageClicks(driver);
	
		// Header links -->
	  
	  about.aboutUsClick();
	  about.coursePage();
	  about.testimonialPage();
	  about.aboutUsClick();
	  about.getStartedClick();
	  
	  // course Carosal next -->
	  about.courseCarosalNextClick();
	  about.courseCarosalNextClick();
      about.courseCarosalNextClick();

     
	  // course Carosal prev -->
	  about.courseCarosalPrevClick();
	  about.courseCarosalPrevClick();
	  about.courseCarosalPrevClick();

	  // Feedback Carosal next -->
      about.feedbackCarosalNextClick();  
      about.feedbackCarosalNextClick();
      about.feedbackCarosalNextClick();
      about.feedbackCarosalNextClick();
	  
	  // Feedback Carosal prev -->
      about.feedbackCarosalPrevClick();
      about.feedbackCarosalPrevClick();
      about.feedbackCarosalPrevClick();
      about.feedbackCarosalPrevClick();
      
      // Other links
      about.contactUsTodayEnquiry();
      about.navigateBack();
      about.exploreAllCoursesClick();
      about.navigateBack();
      
      //Quick links
   
     about.quickLinksAboutPage();
     about.quickLinksBundlesPage();
     about.quickLinksCoursesPage();
     about.quickLinkstestimonialPage();
     about.quickLinksHomePage();
   

      

      


	  
  }
}
	  