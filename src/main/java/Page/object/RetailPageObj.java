package Page.object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class RetailPageObj extends Base{
	
	public RetailPageObj(){
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath ="//a[text()= 'TEST ENVIRONMENT']")
	private WebElement testEnvironment;
	public boolean testEnvironmentText(){
		if(testEnvironment.isDisplayed()){
			return true;
		}else
		return false;
	}


	@FindBy(xpath="//span[text()= 'My Account']")
	private WebElement myAccount;
	
	public void clickOnMyAccount(){
		myAccount.click();
	}
	
	
	@FindBy(xpath= "(//a[text()= 'Login'])[1]")
	private WebElement logIn ;
	
	public void clickOnLogIn(){
		logIn.click();
	}
	
	
	@FindBy(id = "input-email")
	private WebElement userName;
	
	@FindBy(id= "input-password")
	private WebElement password;
	
	public void logInInfo(String email, String pass){
		userName.sendKeys(email);
		password.sendKeys(pass);
	}
	
	
	@FindBy(xpath = "//input [@value= 'Login']")
	private WebElement loginbutton;
	public void clickOnLogInButton(){
		loginbutton.click();
	}
	
	
	@FindBy(xpath= "//H2 [text()= 'My Account']")
	private WebElement myAccountLogo;
	public boolean myAccountLogo(){
		if(myAccountLogo.isDisplayed()){
			return true;
		}else
			return false;
	}

	
	
	
	
	
	
	
	
	
	
	@FindBy(xpath= "//a [text()= 'Register for an affiliate account']")
	private WebElement registerAffiliate;
	
	public void clickOnRegisterAffiliate(){
		registerAffiliate.click();
	}
	
	@FindBy(id="input-company")
	private WebElement company;
	
	public void enterCompany(String companyNameValue){
		company.sendKeys(companyNameValue);
	}
	
	@FindBy(id="input-website")
	private WebElement webSite;
	
	public void enterWebSite(String websiteValue){
		webSite.sendKeys(websiteValue);
	}
	
	@FindBy(id="input-tax")
	private WebElement taxId;
	
	public void enterTaxId(String taxIdValue){
	taxId.sendKeys(taxIdValue);
	}
	
	@FindBy(xpath = "(//input[@name='payment'])[1]")
    private WebElement chequeButton;
	
	@FindBy(xpath = "(//input[@name='payment'])[2]")
    private WebElement payPalButton;
    
    @FindBy(xpath = "(//input[@name='payment'])[3]")
    private WebElement bankTransferButton;
    
    public void selectPaymentType(String paymentType) {
        if (paymentType.trim().equalsIgnoreCase("cheque")) {
            if (!chequeButton.isSelected()) {
                chequeButton.click();
            }
        } else if (paymentType.trim().equalsIgnoreCase("paypal")) {
            payPalButton.click();
        } else
            bankTransferButton.click();
    }
    
    
    @FindBy(id = "input-cheque")
    private WebElement payeeName;
    public void enterChequePayeeName(String payee) {
        payeeName.sendKeys(payee);
    }
  
    
    @FindBy(xpath = "//input[@name='agree']")
    private WebElement agreeButton;
    public void clickAgreeButton() {
        agreeButton.click();
    }
    @FindBy(xpath = "//input[@value='Continue']")
    private WebElement continueButton;
    public void clickContinueButton() {
        continueButton.click();
    }
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    private WebElement successMassage;
    public boolean showSuccessMassage() {
        if (successMassage.isDisplayed())
            return true;
        else
            return false;
    }
	
	
	
	
	
	
	
	
	


	
	
	@FindBy(xpath= "//a[text()='Edit your affiliate information']")
	private WebElement editAffiliateInformation;
	public void editAffiliateInformation(){
		editAffiliateInformation.click();
	}
	
	
	@FindBy(xpath= "//input [@value='bank' ]")
	private WebElement bankTransferField;
	public void selectbankTransferField(){
		bankTransferField.click();
	}
	
	
	@FindBy(xpath= "//input [@id= 'input-bank-name']")
	private WebElement bankName;
	public void enterBankName(String bank ){
		bankName.sendKeys(bank);
	}
	
	@FindBy(xpath= "//input [@id= 'input-bank-branch-number']")
	private WebElement branchNumber;
	public void enterbranchNumber(String branch){
		branchNumber.sendKeys(branch);
		
	}
	
	@FindBy(xpath= "//input [@id= 'input-bank-swift-code']")
	private WebElement swiftCode;
	public void enterSwiftCode(String code){
		swiftCode.sendKeys(code);
	}

	@FindBy(xpath="//input [@id= 'input-bank-account-name']")
	private WebElement accountName;
	public void enterAccounName(String account){
		accountName.sendKeys(account);
		
	}
	
	@FindBy (xpath= "//input [@id= 'input-bank-account-number']")
	private WebElement accountNumber;
	public void enterAccountNumber(String accountN){
		accountNumber.sendKeys(accountN);
	} 
	
	
	
	@FindBy(xpath= "//div[@class= 'alert alert-success alert-dismissible']")
	private WebElement successText;
	public boolean successText(){
		if(successText.isDisplayed()){
			return true;
		}else
			return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	@FindBy(xpath= "//a[text()='Edit your account information']")
	private WebElement editAccountInfo;
	public void ClickOnEditAccount(){
		editAccountInfo.click();
	}
	
	@FindBy(id ="input-firstname")
	private WebElement firstName;
	public void EnterFirstName(String name){
		firstName.clear();
		firstName.sendKeys(name);
	}
	
	@FindBy(id = "input-lastname")
	private WebElement lastName;
	public void EnterLastName(String lastN){
		lastName.clear();
		lastName.sendKeys(lastN);
	}
	
	
	@FindBy(id = "input-email")
	private WebElement emailAddress;
	public void EnterEmailAddress(String email){
		emailAddress.clear();
		emailAddress.sendKeys(email);
		
	}
	
	@FindBy(id= "input-telephone")
	private WebElement telephoneNumber;
	public void EnterTelephoneNumber(String phone){
		telephoneNumber.clear();
		telephoneNumber.sendKeys(phone);
	}
	
	

	
	@FindBy(xpath="//div[text()=' Success: Your account has been successfully updated.']")
	private WebElement successConfirmation;
	public void successConfirmation(){
		successConfirmation.isDisplayed();
	}
	
	
	
	
}