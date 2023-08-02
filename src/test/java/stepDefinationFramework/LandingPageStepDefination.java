package stepDefinationFramework;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import utils.TestContextSetup;

public class LandingPageStepDefination {
	public WebDriver driver;
	String topDealsPageProductName;
	TestContextSetup testContextSetup;
	String landingPageProductName;
	LandingPage landingPageObj;
	
	public LandingPageStepDefination(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		this.landingPageObj = testContextSetup.pom.getLandingPage();
	}
	
	
	@Given("User is on GreenCart landing page")
	public void User_is_on_GreenCart_landing_page() {
		Assert.assertTrue(landingPageObj.getTitleLandingPage().contains("GreenKart"));
	}
	@When("^user searched with shortname (.+) and extracts the actual name of the product$")
	public void user_searched_with_shortname_and_extracts_the_actual_name_of_the_product(String name) throws InterruptedException {
		//LandingPage landingPageObj = new LandingPage(testContextSetup.driver);
		landingPageObj.searchItem(name);
		Thread.sleep(3000L);
		testContextSetup.landingPageProductName = landingPageObj.getProductName().split("-")[0].trim();
		System.out.println(testContextSetup.landingPageProductName + " Name is extracted from the Landing Page ");
	}
	
	@When("Added {string} items of the selected product to cart")
	public void Added_items_of_the_selected_product_to_cart(String number) {
		int num = Integer.parseInt(number);
		landingPageObj.incrementQuantity(num);
		landingPageObj.addToCart();
	}

}
