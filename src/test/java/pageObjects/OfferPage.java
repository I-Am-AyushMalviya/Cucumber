package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OfferPage {
	public OfferPage(WebDriver driver) {
		this.driver = driver;
	}

	WebDriver driver;
	By search = By.xpath("//input[@id='search-field']");
	By productName = By.cssSelector("tr td:nth-child(1)");
	By topDeals = By.xpath("//*[contains(text(),'Top Deals')]");

	public void searchItem(String name) {
		driver.findElement(search).sendKeys(name);
	}

	public void getSearchedText() {
		driver.findElement(search).getText();
	}

	public String getProductName() {
		return driver.findElement(productName).getText();
	}
	public void getTopDeals() {
		driver.findElement(By.xpath("//*[contains(text(),'Top Deals')]")).click();
	}

}
