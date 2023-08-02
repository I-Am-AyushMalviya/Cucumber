package stepDefinationFramework;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import pageObjects.OfferPage;
import utils.TestContextSetup;

public class OfferPageStepDefination {
	String topDealsPageProductName;
	TestContextSetup testContextSetup;
	public OfferPageStepDefination(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
	}
	@Then("^user searches with same shortname (.+) in offer page$")
	public void user_searches_with_same_shortname_in_offer_page(String name) throws InterruptedException {
	//	OfferPage offerPageObject = new OfferPage(testContextSetup.driver);
		OfferPage offerPageObject = testContextSetup.pom.getOfferPage();
		offerPageObject.getTopDeals();
		switchToOfferPage();
		offerPageObject.searchItem(name);
		Thread.sleep(2000L);
		topDealsPageProductName = offerPageObject.getProductName().trim();
	}
	
	@Then("checks if product exists")
	public void checks_if_product_exists() throws IOException {
		Assert.assertEquals(topDealsPageProductName, testContextSetup.landingPageProductName);
	} 
	
	public void switchToOfferPage() {
		testContextSetup.genericUtils.switchToChildWindow();
	}
}
