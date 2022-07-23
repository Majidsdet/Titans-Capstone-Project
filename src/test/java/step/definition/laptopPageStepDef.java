package step.definition;

import Page.object.LaptopPageObj;
import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.WebDriverUtilities;

	public class laptopPageStepDef extends Base{
	LaptopPageObj laptop= new LaptopPageObj();
	
	@When("User click on Laptop &NoteBook tab")
	public void user_click_on_laptop_note_book_tab() {
	  laptop.clickOnlaptopNotebookTab();
	  logger.info("User clicked on Laptop and Notebook tab");
	  WebDriverUtilities.takeScreenShot();
	  laptop.delay();
	}

	@When("User click on Show all Laptop &NoteBook option")
	public void user_click_on_show_all_laptop_note_book_option() {
		laptop.clickOnshowAllLaptopsNotebooks();
	    logger.info("User clicked on Show all Laptop &NoteBook option");
	    WebDriverUtilities.takeScreenShot();
	    laptop.delay();
	}

	@When("User click on MacBook item")
	public void user_click_on_mac_book_item() {
	    laptop.clickOnmacBookItem();
	    logger.info("User clicked on MacBook item");
	    WebDriverUtilities.takeScreenShot();
	    laptop.delay();
	}

	@Then("User should see a message ‘Success: You have added MacBook to your shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_mac_book_to_your_shopping_cart() {
		laptop.showsuccessMessage();
		logger.info("User saw a message ‘Success: You have added MacBook to your shopping cart!’");
		WebDriverUtilities.takeScreenShot();
		laptop.delay();
	}

	@Then("User should see {int} tem\\(s){double} showed to the cart")
	public void user_should_see_tem_s_showed_to_the_cart(Integer int1, Double double1) {
	    laptop.showAddedItem();
	    logger.info("User saw number of items in to the cart");
	    WebDriverUtilities.takeScreenShot();
	}

	@Then("User click on cart option")
	public void user_click_on_cart_option() {
	  laptop.clickOncartOption();
	  logger.info("User clicked on cart option");
	  WebDriverUtilities.takeScreenShot();
	}

	@Then("user click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
	    laptop.clickOnredxButton();
	    logger.info("user clicked on red X button to remove the item from cart");
	    WebDriverUtilities.takeScreenShot();
	    laptop.delay();
	}

	@Then("item should be removed and cart should show {int} item\\(s)")
	public void item_should_be_removed_and_cart_should_show_item_s(Integer int1) {
	   laptop.showzeroItemToCart();
	   logger.info("item removed from cart )");
	   WebDriverUtilities.takeScreenShot();
	   laptop.delay();
	}

	
	
	
	
	
	@When("User click on product comparison icon on ‘MacBook’")
	public void user_click_on_product_comparison_icon_on_mac_book() {
	   laptop.clickOnmacBookComprison();
	   logger.info("User clicked on product comparison icon on ‘MacBook’");
	   WebDriverUtilities.takeScreenShot();
	   laptop.delay();
	}

	@When("User click on product comparison icon on ‘MacBook Air")
	public void user_click_on_product_comparison_icon_on_mac_book_air() {
	    laptop.clickOnmacBookAirComprison();
	    logger.info("User clicked on product comparison icon on ‘MacBook Air");
	    WebDriverUtilities.takeScreenShot();
	    laptop.delay();
	}

	@Then("User should see a message ‘Success: You have added MacBook Air to your product comparison!’")
	public void user_should_see_a_message_success_you_have_added_mac_book_air_to_your_product_comparison() {
	   laptop.showsuccessMessage();
	}

	@Then("User click on Product comparison link")
	public void user_click_on_product_comparison_link() {
	   laptop.clickOnproductComprisonLink();
	   logger.info("User clicked on Product comparison link");
	   WebDriverUtilities.takeScreenShot();
	}

	@Then("User should see Product Comparison Chart")
	public void user_should_see_product_comparison_chart() {
	    laptop.showproductComprisonChart();
	    logger.info("User saw the Product Comparison Chart");
	    laptop.delay();
	}
	
	
	
	
	
	
	
	@When("User click on heart icon to add {string} laptop to wish list")
	public void user_click_on_heart_icon_to_add_laptop_to_wish_list(String string) {
	    laptop.clickOnwishlist();
	    logger.info("User clicked on heart icon to add {string} laptop to wish list");
	    WebDriverUtilities.takeScreenShot();
	    laptop.delay();
	}

	@Then("User should get a message {string}")
	public void user_should_get_a_message(String string) {
		laptop.showAlarmMessage();
		logger.info("User got the message");
		WebDriverUtilities.takeScreenShot();
	    laptop.delay();
	}
	   
	

	@When("User click on ‘MacBook Pro’ item")
	public void user_click_on_mac_book_pro_item() {
		laptop.clickOnmacBookPro();
		logger.info("User clicked on ‘MacBook Pro’ item");
		WebDriverUtilities.takeScreenShot();
	    laptop.delay();
	}

	@Then("User should see ‘${double}’ price tag is present on UI")
	public void user_should_see_$_price_tag_is_present_on_ui(Double double1) {
		laptop.showPriceTag();
		logger.info("User saw the price tag is present on UI");
		WebDriverUtilities.takeScreenShot();
	    laptop.delay();
	}

	
	
	
	
	
	
	
	
	
	
	
	}
