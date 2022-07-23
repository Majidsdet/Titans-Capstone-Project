package Page.object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HomePageObj extends Base {
	
	public HomePageObj(){
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath= "//span[text()='Currency']")
	private WebElement currency;
	public void ClickOnCurrency(){
		currency.click();
	}
	
	
	
	@FindBy(xpath= "//button[text()='€ Euro']")
	private WebElement Euro;
	public void ClickOnEuro(){
		Euro.click();
	}
	@FindBy(xpath= "//strong[text()='€']")
	private WebElement euroSign;
	public boolean showEurosign(){
		if(euroSign.isDisplayed()){
			return true;
		}else 
			return false;	
	}
	
	@FindBy(xpath= "//span[text()='Shopping Cart']")
	private WebElement ShoppingCart;
	public void ClickonShoppingCart(){
		ShoppingCart.click();
	}
	
	
	
	
	
	@FindBy(xpath= "(//p[text()='Your shopping cart is empty!'])[2]")
	private WebElement emptyShoppingCart;
	public boolean showEmptyShoppingCart(){
		if(emptyShoppingCart.isDisplayed()){
			return true;
		}else
			return false;
	}
	
	

	
	
	}
