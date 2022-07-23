package step.definition;



import java.util.List;
import java.util.Map;

import Page.object.RetailPageObj;
import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.WebDriverUtilities;

public class RetailpageStepDef extends Base {
	RetailPageObj retail = new RetailPageObj();
	


	

	
	@And("User click on MyAccount")
	public void User_click_on_my_Account() {
		retail.clickOnMyAccount();
	  retail.delay();
	}
	
	@When("User click on Login")
	public void User_click_on_Log_in() {
		retail.clickOnLogIn();
		logger.info("User clicked on Login");
		WebDriverUtilities.takeScreenShot();
		retail.delay();
	}
	
	
	@And("User enter username ‘userName’ and password 'password’")
	public void User_enter_username_and_password( ) {
		retail.logInInfo("Tristan22@gmail.com","Tristan22");
		logger.info("User entered username and password");
		WebDriverUtilities.takeScreenShot();
		retail.delay();
	}


	@And("User click on Login button")		
	public void user_click_on_login_button() {
		retail.clickOnLogInButton();
		logger.info("User clicked on Login button");
		WebDriverUtilities.takeScreenShot();
		retail.delay();
	}

	@Then ("User should be logged in to MyAccount dashboard")
	public void User_should_be_logged_in_to_my_account_dashboard(){
		retail.myAccountLogo();
		logger.info("User logged in to MyAccount");
		WebDriverUtilities.takeScreenShot();
		retail.delay();
	}

	
	
	
	
	@When("User click on ‘Register for an Affiliate Account’ link")
	public void user_click_on_register_for_an_affiliate_account_link() {
	   retail.clickOnRegisterAffiliate();
	   logger.info("user clicked on register affilliate link");
	   WebDriverUtilities.takeScreenShot();
	   retail.delay();
	}

	@When("User fill affiliate form with below information")
	public void user_fill_affiliate_form_with_below_information(DataTable dataTable) {
		List<Map<String,String>>affiliateInformation = dataTable.asMaps(String.class,String.class);
		retail.enterCompany(affiliateInformation.get(0).get("company"));
		retail.enterWebSite(affiliateInformation.get(0).get("website"));
		retail.enterTaxId(affiliateInformation.get(0).get("taxid"));
		retail.selectPaymentType(affiliateInformation.get(0).get("paymentmethod"));
		retail.enterChequePayeeName(affiliateInformation.get(0).get("payeename"));
		logger.info("User filled the affiliate information");
		WebDriverUtilities.takeScreenShot();
		retail.delay();
	}

	@When("User check on About us check box")
	public void user_check_on_about_us_check_box() {
	    retail.clickAgreeButton();
	    logger.info("user clicked on agree button");
	    WebDriverUtilities.takeScreenShot();
	    retail.delay();
	}

	@When("User click on continue button")
	public void user_click_on_continue_button() {
		retail.clickContinueButton();
	}




	@Then("User should see a success message")
	public void user_should_see_a_success_message() {
		retail.showSuccessMassage();
		logger.info("User checked the success message");
		 WebDriverUtilities.takeScreenShot();
		    retail.delay();
	    
	}

	
	
	
	
	
	@When("User click on ‘Edit your affiliate informationlink")
	public void user_click_on_edit_your_affiliate_informationlink() {
	   retail.editAffiliateInformation();
	   logger.info("user clicked on editing affiliate information");
	   WebDriverUtilities.takeScreenShot();
	   retail.delay();
	}

	@When("user click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button() {
		retail.selectbankTransferField();
		logger.info("user selected bank transfer field");
	    
	}

	@When("User fill Bank information with below information")
	public void user_fill_bank_information_with_below_information(DataTable dataTable) {
	    List<Map<String,String>> bankInformation= dataTable.asMaps(String.class,String.class);
	    retail.enterBankName(bankInformation.get(0).get("bankName"));
	    retail.enterbranchNumber(bankInformation.get(0).get("abaNumber"));
	    retail.enterSwiftCode(bankInformation.get(0).get("swiftCode"));
	    retail.enterAccounName(bankInformation.get(0).get("accountName"));
	    retail.enterAccountNumber(bankInformation.get(0).get("accountNumber"));
	    logger.info("User filled bank Information");
	    WebDriverUtilities.takeScreenShot();
	    retail.delay();
	   
	}

	@When("User click on ‘Edit your account information’ link")
	public void user_click_on_edit_your_account_information_link() {
	    retail.ClickOnEditAccount();
	    logger.info("User edited the account information");
	    WebDriverUtilities.takeScreenShot();
	}

	@When("User modify below information")
	public void user_modify_below_information(DataTable dataTable) {
		List<Map<String,String>> modifyAccountInfo =dataTable.asMaps(String.class,String.class);
	    retail.EnterFirstName(modifyAccountInfo.get(0).get("firstname"));
	    retail.EnterLastName(modifyAccountInfo.get(0).get("lastName"));
	    retail.EnterEmailAddress(modifyAccountInfo.get(0).get("email"));
	    retail.EnterTelephoneNumber(modifyAccountInfo.get(0).get("telephone"));
	    retail.delay();
	}
	
	@When("User click on Continue button")
	public void User_click_on_Continue_button() {
	    retail.clickContinueButton();
	    logger.info("user clicked on continue button");
	    WebDriverUtilities.takeScreenShot();
	    retail.delay();
	    
	}


	@Then("User should see a message ‘Success: Your account has been successfully updated.’")
	public void User_should_see_a_message_success_your_account_has_been_successfully_updated() {
	    retail.successConfirmation();
	    retail.delay();
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
