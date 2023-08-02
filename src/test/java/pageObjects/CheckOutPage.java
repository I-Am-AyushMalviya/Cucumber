package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage {
	
	WebDriver driver;
	public CheckOutPage(WebDriver driver) {
		this.driver = driver;
	}
	By cart = By.xpath("//img[@alt='Cart']");
	By proceed = By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
    By promoBtn = By.cssSelector(".promoBtn");
    By placeOrder = By.xpath("//button[contains(text(),'Place Order')]");
    
	
	public void checkoutItems() {
		driver.findElement(cart).click();
		driver.findElement(proceed).click();
	}
	public boolean verifyPromoBtn() {
		return driver.findElement(promoBtn).isDisplayed();
	}
	public boolean verifyPlaceOrder() {
		return driver.findElement(placeOrder).isDisplayed();
	}
}
