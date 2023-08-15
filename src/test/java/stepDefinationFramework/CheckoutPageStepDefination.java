package stepDefinationFramework;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import pageObjects.CheckOutPage;
import utils.TestContextSetup;

public class CheckoutPageStepDefination {

	//This is Step Defination 
	TestContextSetup testContextSetup;
	CheckOutPage checkoutPage;
	public CheckoutPageStepDefination(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		checkoutPage = testContextSetup.pom.getCheckOutPage();
	}
	@Then("verify user has the ability to enter promo code and place the order")
	public void verify_user_has_the_ability_to_enter_promo_code_and_place_the_order() {
		
		Assert.assertTrue(checkoutPage.verifyPromoBtn());
		Assert.assertTrue(checkoutPage.verifyPlaceOrder());
	}
	@Then("^User proceed to checkout and validate the (.+) item in checkout Page$")
	public void User_proceed_to_checkout_and_validate_the_item_in_checkout_Page(String name) throws InterruptedException {
		checkoutPage.checkoutItems();
		Thread.sleep(2000L);
	}
}
