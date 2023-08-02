package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	public WebDriver driver;
	public LandingPage landingPageObject;
	public OfferPage offerPageObject;
	public CheckOutPage checkOutPage;
	
 
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public LandingPage getLandingPage() {
		

		landingPageObject = new LandingPage(driver);
		return landingPageObject;
	}
	public OfferPage getOfferPage() {

		offerPageObject = new OfferPage(driver);
		return offerPageObject;
	}
	public CheckOutPage getCheckOutPage() {
		checkOutPage = new CheckOutPage(driver);
		return checkOutPage;
	}

}
