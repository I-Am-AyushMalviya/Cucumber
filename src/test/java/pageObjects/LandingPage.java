package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {

	public WebDriver driver;

	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}

	By search = By.xpath("//input[@type='search']");
	By productName =  By.cssSelector("h4.product-name");
	By addToCart = By.cssSelector(".product-action button");
	By increment = By.cssSelector("a.increment");

	public void searchItem(String name) {

		driver.findElement(search).sendKeys(name);
	}
	public void getSearchedText() {
		driver.findElement(search).getText();
	}
	public String getProductName() {
	return	driver.findElement(productName).getText();
	}
	
	public String getTitleLandingPage() {
		return driver.getTitle();
	}
	public void addToCart() {
		driver.findElement(addToCart).click();
	}
	public void incrementQuantity(int quantity) {
		int quant = quantity -1;
		while(quant > 0) {
			driver.findElement(increment).click();
			quant --;
		}
	}
}
