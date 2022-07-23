package Page.object;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class DesktopPageObj extends Base {

	public DesktopPageObj() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()= 'TEST ENVIRONMENT']")
	private WebElement testEnvironment;

	public void ShowTestEnvironmentLogo() {
		testEnvironment.isDisplayed();
	}

	@FindBy(xpath = "//a[text()='Desktops']")
	private WebElement desktops;

	public void ClickOnDesktops() {
		desktops.click();
	}

	@FindBy(xpath = "//a[text()='Show All Desktops']")
	private WebElement showAllDesktops;

	public void clikcOnShowAllDesktops() {
		showAllDesktops.click();
	}

	@FindBy(tagName = "img")
	private List<WebElement> items;

	public List<WebElement> deskTopItems() {
		List<WebElement> itemsDesk = items;
		return itemsDesk;
	}

	@FindBy(xpath = "(//span[text()='Add to Cart']) [3]")
	private WebElement addToCartButton;

	public void clickOnAddToCartButton() {
		addToCartButton.click();
	}

	@FindBy(xpath = "//input[@id= 'input-quantity']")
	private WebElement quantity;

	public void enterQuantity(String qty) {
		quantity.clear();
		quantity.sendKeys(qty);
	}

	@FindBy(xpath = "//button[@id= 'button-cart']")
	private WebElement addToCarticon;

	public void clickOnAddToCartIcon() {
		addToCarticon.click();
	}

	@FindBy(xpath = "//div[@class = 'alert alert-success alert-dismissible']")
	private WebElement successShoppingCart;

	public boolean ShowSuccessText() {
		if (successShoppingCart.isDisplayed()) {
			return true;
		} else
			return false;
	}

	@FindBy(xpath = "(//span[text()= 'Add to Cart'])[2]")
	private WebElement canonAddToCart;

	public void ClickOncanonAddToCart() {
		canonAddToCart.click();
	}

	@FindBy(xpath = "//Option[@value= '15']")
	private WebElement selectColor;

	public void clickOnSelectColor() {
		selectColor.click();
	}

	@FindBy(xpath = "//div[@class = 'alert alert-success alert-dismissible']")
	private WebElement successPayam;

	public void successtext() {
		successPayam.isDisplayed();

	}
	

	@FindBy(xpath = "//a[text() ='Canon EOS 5D Camera']")
	private WebElement canonCamera;

	public void clickOncanonCamera() {
		canonCamera.click();
	}

	@FindBy(xpath = "//a[text()='Write a review']")
	private WebElement writeReview;

	public void clickOnWriteReview() {
		writeReview.click();
	}
	
	@FindBy(id ="input-name")
	private WebElement yourName;
	public void writeYourName(String name){
		yourName.sendKeys(name);
	}

	@FindBy(id = "input-review")
	private WebElement yourReview;
	public void writeYourReview(String review){
		yourReview.sendKeys(review);
	}
	
	
	@FindBy(xpath="//input[@type='radio']")
	private List<WebElement>rating;
	
	public void selectRating(String ratingValue){
		List<WebElement> ratingchoice = rating;
		for(WebElement element: ratingchoice){
			if(element.getAttribute("value").equalsIgnoreCase(ratingValue.trim()));
			element.click();
			break;
			
		}	
	}

	
	@FindBy(xpath = "//button[text()='Continue']")
	private WebElement contin;

	public void continueOption() {
		contin.click();
	}

	//
	@FindBy(xpath = "//div [@class='alert alert-success alert-dismissible']")
	private WebElement payam;

	public void payam() {
		payam.isDisplayed();
	}

}