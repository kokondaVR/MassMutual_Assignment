package step_files;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.cucumber.listener.Reporter;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import page_objects.Excercise1;
import utilities.DriverFactory;

public class MassMutual_Assignment_StepFile {

	private static WebDriver driver = DriverFactory.driver;
	//assign US currency for format verification and formatting
	NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);
	
	@Given("^We open the url \"([^\"]*)\"$")
	public void we_open_the_url(String WebSiteUrl) throws Throwable {
		driver.get(WebSiteUrl);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		if (wait.until(ExpectedConditions.visibilityOf(Excercise1.Field_TotalBalance)).isDisplayed()) {
			Reporter.addStepLog("Verifying if the total field is displayed on initial page load");
		}else {
			Assert.fail("The total field is not displayed on initial page load");
		}
	}
	
	@And("^We verify the right count of \"([^\"]*)\" values appear on the screen$")
	public void we_verify_the_right_count_of_values_appear_on_the_screen(String CountofValues) throws Throwable {
		if (Excercise1.Label_Values_List.size() == Integer.parseInt(CountofValues)) {
			Reporter.addStepLog("Verify if the right count of values i.e. "+CountofValues+" are displayed on screen");
		}else {
			Assert.fail("the given count of values i.e. "+CountofValues+" are not displayed on screen");
		}
	}
	
	@And("^We verify the values are formatted as currencies$")
	public void we_verify_the_values_are_formatted_as_currencies() throws Throwable {
		for (WebElement element: Excercise1.TextField_Values_List) {
			try {
				//format.parse throws ParseException if string is not USD currency
				format.parse(element.getText());
			} catch (NumberFormatException | ParseException e) {
				Assert.fail("element with the ID "+ element.getAttribute("id")+" has the issue -"+ e.getMessage());
			}
		}
		Reporter.addStepLog("The values displayed on the page are correctly formatted as currencies");
	}

	@And("^We verify the values on the screen are greater than \"([^\"]*)\"$")
	public void we_verify_the_values_on_the_screen_are_greater_than(String Value) throws Throwable {
		for (WebElement element: Excercise1.TextField_Values_List) {
			try {
				Assert.assertTrue(format.parse(element.getText()).doubleValue() > Double.parseDouble(Value));
			} catch (NumberFormatException | ParseException e) {
				Assert.fail("element with the ID "+ element.getAttribute("id")+" has the issue -"+ e.getMessage());
			}
		}
		Reporter.addStepLog("The values displayed on the page are greater than given value of "+Value);
	}

	@And("^We verify the total balance is correct based on the values listed on the screen$")
	public void we_verify_the_total_balance_is_correct_based_on_the_values_listed_on_the_screen() throws Throwable {
		Double total = 0d;
		for (WebElement element: Excercise1.TextField_Values_List) {
			try {
				total += format.parse(element.getText()).doubleValue();
			} catch (NumberFormatException | ParseException e) {
				Assert.fail("element with the ID "+ element.getAttribute("id")+" has the issue -"+ e.getMessage());
			}
		}
		try {
			if (total == format.parse(Excercise1.Field_TotalBalance.getText()).doubleValue()) {
				Reporter.addStepLog("Total calculated balance "+total+" is correct based on the values listed on screen - the total matches the sum of all values: "+format.parse(Excercise1.Field_TotalBalance.getText()).toString());
			}else {
				Assert.fail("Total calculated balance "+total+" does not match the sum of all values: "+format.parse(Excercise1.Field_TotalBalance.getText()).toString());
			}
		} catch (NumberFormatException | ParseException e) {
			Assert.fail("element with the ID "+ Excercise1.Field_TotalBalance.getAttribute("id")+" has the issue -"+ e.getMessage());
		}
	}

	@And("^We verify the total balance matches the sum of the values$")
	public void we_verify_the_total_balance_matches_the_sum_of_the_values() throws Throwable {
		//calling the above method as both need to do the same thing - verify total is equal to sum
		this.we_verify_the_total_balance_is_correct_based_on_the_values_listed_on_the_screen();
	}
	
	@Then("^Logout$")
	public void logout() throws Throwable {
		Reporter.addStepLog("Stopping websriver instance");
		DriverFactory.stopDriver();
	}
	
}
