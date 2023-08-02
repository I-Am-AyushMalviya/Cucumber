package stepDefination;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination {
	WebDriver driver;
	String actualName;
	String offerPageName;
	@Given("user is on Greenkart Landing Page")
	public void user_is_on_greenkart_landing_page() {
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String url = driver.getTitle();
		System.out.println(url);
	}

	@When("User Searches with shortname {string}")
	public void user_searches_with_shortname(String string) throws InterruptedException {
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys(string);
		Thread.sleep(10);
		actualName = driver.findElement(By.cssSelector("div h4")).getText().split("-")[0].trim();

	}

	@Then("User searched for {string} shortname in offerpage")
	public void user_searched_for_shortname_in_offerpage(String string) {
		driver.findElement(By.xpath("//*[contains(text(),'Top Deals')]")).click();
		Set<String> windowsHandles = driver.getWindowHandles();
		Iterator<String> it = windowsHandles.iterator();
		it.next();
		String child = it.next();
		driver.switchTo().window(child);
		driver.findElement(By.xpath("//input[@id='search-field']")).sendKeys(string);
		offerPageName = driver.findElement(By.cssSelector("tr td:nth-child(1)")).getText();
	}

	@Then("validate product name in offeres page and landing page")
	public void validate_product_name_in_offeres_page_and_landing_page() {
		Assert.assertEquals(actualName, offerPageName);
	}
	
	@Then("do zumba with the following data")
	public void do_zumba_with_the_following_data(DataTable dataTable) {
	   List<List<String>> obj =dataTable.asLists();
	  System.out.println(obj.get(0).get(0));
	  System.out.println(obj.get(0).get(1));
	  System.out.println( obj.get(0).get(2));
	}
	
	@Given("User is mad")
	public void user_is_mad() {
		System.out.println("User is mad");
	}
	@When("User us normal")
	public void user_us_normal() {
		System.out.println("User is normal");
	}

	@Then("^do data parameterization with user name as (.+) and password as (.+)$")
	public void do_data_parameterization_with_user_name_as_nelay_dubey_and_password_as_qwerty(String name , String password) throws Throwable {
		String nameOne = name;
		String passwordOne = password;
	    System.out.println(nameOne);
	    System.out.println(passwordOne);
	}

	@Given("validate the browser")
	public void validate_the_browser() {
		System.out.println("Browser is validated");
	}
	@When("Browser is Triggered")
	public void Browser_is_Triggered() {
		System.out.println("Browser is opended");
	}
	@Then("check if browser is started")
	public void check_if_browser_is_started() {
		System.out.println("Checking browser is started");
	}
}
