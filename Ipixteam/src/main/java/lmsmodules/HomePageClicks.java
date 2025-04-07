package lmsmodules;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.WaitUtilities;

public class HomePageClicks {
	WebDriver driver;
	public HomePageClicks(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);//defining page factory
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
	}
	@FindBy(xpath="(//a[@class='nav-link '])[1]")WebElement aboutUs;
	@FindBy(xpath="(//a[@class='nav-link '])[2]")WebElement coursesMenu;
	@FindBy(xpath="//a[@href='https://tracez-lms.ipixsolutions.net/testimonial']")WebElement testmonialMenu;
	@FindBy(xpath="//a[@class='get-start-button d-inline-block']")WebElement getStarted;
	@FindBy(xpath="(//button[@role='presentation'])[2]")WebElement courseCarosalNext;
 //	@FindBy(xpath="(//span[@aria-label='Next'])[1]")WebElement courseCarosalNext;

  //@FindBy(xpath="(//button[@class='owl-prev'])[1]")WebElement courseCarosalPrev;
	
	
	@FindBy(xpath="(//span[@aria-label='Previous'])[1]")WebElement courseCarosalPrev;	
	@FindBy(xpath="(//button[@class='owl-next'])[2]")WebElement feedbackCarosalNext;
	@FindBy(xpath="(//button[@class='owl-prev'])[2]")WebElement feedbackCarosalPrev;
	
	@FindBy(xpath="//a[@href='https://tracez-lms.ipixsolutions.net/contact']")WebElement contactEnquiryHome;
	@FindBy(xpath="(//a[@href='https://tracez-lms.ipixsolutions.net/e-learning'])[4]")WebElement exploreAllCoursesHome;
	
	@FindBy(xpath="//a[@href='https://tracez-lms.ipixsolutions.net/about-us']")WebElement quiclLinksAboutus;
	@FindBy(xpath="(//a[@href='https://tracez-lms.ipixsolutions.net/bundles'])[2]")WebElement quiclLinksBundles;
	@FindBy(xpath="(//a[@href='https://tracez-lms.ipixsolutions.net/e-learning'])[4]")WebElement quiclLinksCourse;
	@FindBy(xpath="(//a[@href='https://tracez-lms.ipixsolutions.net/testimonial'])[3]")WebElement quiclLinksTestimonial;
	@FindBy(xpath="//a[@href='https://tracez-lms.ipixsolutions.net']")WebElement quiclLinksHome;


		

	
	public HomePageClicks aboutUsClick() {
		aboutUs.click();
		return this;
	}
	public HomePageClicks coursePage() {
		coursesMenu.click();
		return this;
	}
	public HomePageClicks testimonialPage() {
		testmonialMenu.click();
		return this;
	}
	public HomePageClicks homePage() {
		testmonialMenu.click();
		return this;
	}
	public HomePageClicks getStartedClick() {
		getStarted.click();
		return this;
	}

	/*public HomePageClicks courseCarosalNextClick() {
	    WaitUtilities.waitForElementToBeClickable(driver, courseCarosalNext, 10);
	    courseCarosalNext.click();
	    return this;
	}
	
	public HomePageClicks courseCarosalNextClick() {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].click();", courseCarosalNext);
	    return this;
	}
	
	public HomePageClicks courseCarosalNextClick() {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView(true);", courseCarosalNext);
	    courseCarosalNext.click();
	    return this;
	}
	*/
	public HomePageClicks courseCarosalNextClick() {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	   

	    js.executeScript("document.querySelector('.phpdebugbar-text').style.display='none';");	    // Hide phpdebugbar if it's blocking the button
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));	    // Wait for the element to be clickable
	    wait.until(ExpectedConditions.elementToBeClickable(courseCarosalNext));
	    js.executeScript("arguments[0].click();", courseCarosalNext);	    // Click the button using JavaScript to avoid interception
	    return this;
	}

	/*public HomePageClicks courseCarosalPrevClick() {
		courseCarosalPrev.click();
		return this;
	}
	*/
	public HomePageClicks courseCarosalPrevClick() {
	    JavascriptExecutor js = (JavascriptExecutor) driver;

	    js.executeScript("document.querySelector('.phpdebugbar-text').style.display='none';");	    // Hide phpdebugbar if it's blocking the button
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));	    // Wait for the element to be clickable
	    wait.until(ExpectedConditions.elementToBeClickable(courseCarosalPrev));
	    js.executeScript("arguments[0].click();", courseCarosalPrev);	    // Click the button using JavaScript to avoid interception
	    return this;
	}

	/*
	public HomePageClicks feedbackCarosalNextClick() {
		feedbackCarosalNext.click();
		return this;
	}
	public HomePageClicks feedbackCarosalPrevClick() {
		feedbackCarosalPrev.click();
		return this;
	}

*/
	

public HomePageClicks feedbackCarosalNextClick() {
    JavascriptExecutor js = (JavascriptExecutor) driver;

    js.executeScript("document.querySelector('.phpdebugbar-text').style.display='none';");	    // Hide phpdebugbar if it's blocking the button
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));	    // Wait for the element to be clickable
    wait.until(ExpectedConditions.elementToBeClickable(feedbackCarosalNext));
    js.executeScript("arguments[0].click();", feedbackCarosalNext);	    // Click the button using JavaScript to avoid interception
    return this;
}
public HomePageClicks feedbackCarosalPrevClick() {
    JavascriptExecutor js = (JavascriptExecutor) driver;

    js.executeScript("document.querySelector('.phpdebugbar-text').style.display='none';");	    // Hide phpdebugbar if it's blocking the button
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));	    // Wait for the element to be clickable
    wait.until(ExpectedConditions.elementToBeClickable(feedbackCarosalPrev));
    js.executeScript("arguments[0].click();", feedbackCarosalPrev);	    // Click the button using JavaScript to avoid interception
    return this;
}
public HomePageClicks contactUsTodayEnquiry() {
	contactEnquiryHome.click();
	return this;
}
public void navigateBack() {
    driver.navigate().back();
}
/*public HomePageClicks exploreAllCoursesClick() {
	exploreAllCoursesHome.click();
	return this;
}
*/
public HomePageClicks exploreAllCoursesClick() {
    JavascriptExecutor js = (JavascriptExecutor) driver;

    js.executeScript("document.querySelector('.phpdebugbar-text').style.display='none';");	    // Hide phpdebugbar if it's blocking the button
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));	    // Wait for the element to be clickable
    wait.until(ExpectedConditions.elementToBeClickable(exploreAllCoursesHome));
    js.executeScript("arguments[0].click();", exploreAllCoursesHome);	    // Click the button using JavaScript to avoid interception
    return this;
}
public HomePageClicks quickLinksAboutPage () {
    JavascriptExecutor js = (JavascriptExecutor) driver;

    js.executeScript("document.querySelector('.phpdebugbar-text').style.display='none';");	    // Hide phpdebugbar if it's blocking the button
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));	    // Wait for the element to be clickable
    wait.until(ExpectedConditions.elementToBeClickable(quiclLinksAboutus));
    js.executeScript("arguments[0].click();", quiclLinksAboutus);	    // Click the button using JavaScript to avoid interception
    return this;
}
public HomePageClicks quickLinksBundlesPage () {
    JavascriptExecutor js = (JavascriptExecutor) driver;

    js.executeScript("document.querySelector('.phpdebugbar-text').style.display='none';");	    // Hide phpdebugbar if it's blocking the button
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));	    // Wait for the element to be clickable
    wait.until(ExpectedConditions.elementToBeClickable(quiclLinksBundles));
    js.executeScript("arguments[0].click();", quiclLinksBundles);	    // Click the button using JavaScript to avoid interception
    return this;
}
public HomePageClicks quickLinksCoursesPage () {
    JavascriptExecutor js = (JavascriptExecutor) driver;

    js.executeScript("document.querySelector('.phpdebugbar-text').style.display='none';");	    // Hide phpdebugbar if it's blocking the button
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));	    // Wait for the element to be clickable
    wait.until(ExpectedConditions.elementToBeClickable(quiclLinksCourse));
    js.executeScript("arguments[0].click();", quiclLinksCourse);	    // Click the button using JavaScript to avoid interception
    return this;
}
public HomePageClicks quickLinkstestimonialPage () {
    JavascriptExecutor js = (JavascriptExecutor) driver;

    js.executeScript("document.querySelector('.phpdebugbar-text').style.display='none';");	    // Hide phpdebugbar if it's blocking the button
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));	    // Wait for the element to be clickable
    wait.until(ExpectedConditions.elementToBeClickable(quiclLinksAboutus));
    js.executeScript("arguments[0].click();", quiclLinksTestimonial);	    // Click the button using JavaScript to avoid interception
    return this;
}
public HomePageClicks quickLinksHomePage () {
    JavascriptExecutor js = (JavascriptExecutor) driver;

    js.executeScript("document.querySelector('.phpdebugbar-text').style.display='none';");	    // Hide phpdebugbar if it's blocking the button
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));	    // Wait for the element to be clickable
    wait.until(ExpectedConditions.elementToBeClickable(quiclLinksHome));
    js.executeScript("arguments[0].click();", quiclLinksHome);	    // Click the button using JavaScript to avoid interception
    return this;
}
}
