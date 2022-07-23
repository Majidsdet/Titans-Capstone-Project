
package step.definition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;

import Page.object.DesktopPageObj;
import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import utilities.WebDriverUtilities;

public class DesktopPageStepDef extends Base {
	
	DesktopPageObj desktop= new DesktopPageObj();
	
	@Given("User is on Retail website")
	public void user_is_on_retail_website() {
		desktop.ShowTestEnvironmentLogo();
		
		logger.info("User is on retail Website");
		WebDriverUtilities.takeScreenShot();
		
	}   
	
	
	@When("User click on Desktops tab")
	public void user_click_on_desktops_tab() {
		
	   desktop.ClickOnDesktops();
	   logger.info("User clicked on desktop");
	   WebDriverUtilities.takeScreenShot();
	}

	@And("User click on Show all desktops")
	public void user_click_on_show_all_desktops() {
	   desktop.clikcOnShowAllDesktops();
	   logger.info("user clicked on show all desktops button");
	   WebDriverUtilities.takeScreenShot();
	   desktop.delay();
	}

	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() {
	    List<WebElement>desktopItemlist=desktop.deskTopItems();
	    for(WebElement items: desktopItemlist){
	    	Assert.assertTrue(items.isDisplayed());
	    	logger.info("all items are present in desktop");
	    
	    }
	}
	


   


	@When("User click ADD TO CART option on HP LP3065 item")
	public void user_click_add_to_cart_option_on_hp_lp3065_item() {
			desktop.clickOnAddToCartButton();
			logger.info("user clicked on HP add to cart option");
			WebDriverUtilities.takeScreenShot();
			desktop.delay();
	}

	@When("User select quantity {string}")
	public void user_select_quantity(String qty) {
		
		desktop.enterQuantity(qty);
		logger.info("user selected quantity");
		WebDriverUtilities.takeScreenShot();
		desktop.delay();
	}

	@When("User click add to Cart button")
	public void user_click_add_to_cart_button() {
		desktop.clickOnAddToCartIcon();
	}

	@Then("User should see a message 'Success: you have added HP LP {int} to your Shopping cart!'")
	public void user_should_see_a_message_success_you_have_added_hp_lp_to_your_shopping_cart(Integer int1) {
			desktop.ShowSuccessText();
			WebDriverUtilities.takeScreenShot();
			desktop.delay();
	}

	@When("User click ADD TO CART option on Canon EOS5D item")
	public void user_click_add_to_cart_option_on_canon_eos5d_item() {
		desktop.ClickOncanonAddToCart();
		WebDriverUtilities.takeScreenShot();
	}

	@When("User select color from dropdown Red")
	public void user_select_color_from_dropdown_red() {
		desktop.clickOnSelectColor();
		desktop.delay();
	}

	@Then("User should see a message 'Success: You have added Canon EOS5D to your shopping cart!'")
	public void user_should_see_a_message_success_you_have_added_canon_eos_5d_to_your_shopping_cart() {
		desktop.successtext();
		desktop.delay();
	}	
	@When("User click on Canon EOS5D item")
	public void user_click_on_canon_eos5d_item() {
			desktop.clickOncanonCamera();
			desktop.delay();
	}

	@When("User click on write a review link")
	public void user_click_on_write_a_review_link() {
	   desktop.clickOnWriteReview();
	}

	@When("user fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(DataTable dataTable) {
	    List<Map<String ,String>>recordingReview= dataTable.asMaps(String.class, String.class);
	    desktop.writeYourName(recordingReview.get(0).get("yourname"));
	    desktop.writeYourReview(recordingReview.get(0).get("yourReview"));
	    desktop.selectRating(recordingReview.get(0).get("Rating"));
	    desktop.delay();
	}

	@When("User click on Continue Button")
	public void user_click_on_continue_button() {
		desktop.continueOption();
		desktop.delay();
	}

//	@Then("User should see a message with Thank you for your review.")
//	public void user_should_see_a_message_with_thank_you_for_your_review() {
//	   desktop.payam();
//	}

	@Then("User should see a message with {string}")
	public void user_should_see_a_message_with(String string) {
	desktop.payam();
	desktop.delay();
	}
	
	
	
	
	public void sleept(){
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}






