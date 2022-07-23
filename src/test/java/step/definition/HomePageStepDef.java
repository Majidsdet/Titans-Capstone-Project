package step.definition;

import Page.object.HomePageObj;
import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.WebDriverUtilities;

public class HomePageStepDef extends Base{
	
		HomePageObj homepage= new HomePageObj();
		
		@When("User click on Currency")
		public void user_click_on_currency() {
			homepage.ClickOnCurrency();
			logger.info("user clicked on Currency");
			WebDriverUtilities.takeScreenShot();
			homepage.delay();
		    
		}

		@When("User Chose Euro from dropdown")
		public void user_chose_euro_from_dropdown() {
		   
			homepage.ClickOnEuro();
			logger.info("user clicked on Euro");
			WebDriverUtilities.takeScreenShot();
			homepage.delay();
		}

		@Then("currency value should change to Euro")
		public void currency_value_should_change_to_euro() {
		    homepage.showEurosign();
			logger.info("user saw the Euro sign ");
			WebDriverUtilities.takeScreenShot();
			homepage.delay();
		}

		@When("User click on shopping cart")
		public void user_click_on_shopping_cart() {
			
			homepage.ClickonShoppingCart();
			logger.info("user clicked on Shopping cart");
			WebDriverUtilities.takeScreenShot();
			homepage.delay();
		}

		@Then("“Your shopping cart is empty!” message should display")
		public void your_shopping_cart_is_empty_message_should_display() {
		    homepage.showEmptyShoppingCart();
			logger.info("user saw empty shopping carts");
			WebDriverUtilities.takeScreenShot();
			homepage.delay();
		}
		
		
		
	}
