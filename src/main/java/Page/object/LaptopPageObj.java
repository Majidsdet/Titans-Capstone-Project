package Page.object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LaptopPageObj extends Base {

	public LaptopPageObj(){
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "//a[text()='Laptops & Notebooks']")
    private WebElement laptopNotebookTab;
    public void clickOnlaptopNotebookTab() {
        laptopNotebookTab.click();
    }
    
    @FindBy(xpath = "//a[text()='Show All Laptops & Notebooks']")
    private WebElement showAllLaptopsNotebooks;
    public void clickOnshowAllLaptopsNotebooks() {
        showAllLaptopsNotebooks.click();
    }
    @FindBy(xpath = "//img[@title='MacBook']")
    private WebElement macBookItem;
    public void clickOnmacBookItem() {
        macBookItem.click();
    }
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    private WebElement successMessage;
    public boolean showsuccessMessage() {
        if (successMessage.isDisplayed()) {
            return true;
        } else
            ;
        return false;
    }
    @FindBy(id = "cart-total")
    private WebElement addedItem;
    public boolean showAddedItem() {
        if (addedItem.isDisplayed()) {
            return true;
        } else
            ;
        return false;
    }
    @FindBy(id = "cart-total")
    private WebElement cartOption;
    public void clickOncartOption() {
        cartOption.click();
    }
    @FindBy(xpath = "//button[@title='Remove']")
    private WebElement redxButton;
    public void clickOnredxButton() {
        redxButton.click();
    }
    @FindBy(id = "cart-total")
    private WebElement zeroItemToCart;
    public boolean showzeroItemToCart() {
        if (zeroItemToCart.isDisplayed()) {
            return true;
        } else
            ;
        return false;
    }
//  product comparison
    @FindBy(xpath = "(//i[@class='fa fa-exchange'])[2]")
    private WebElement macBookComprison;
    public void clickOnmacBookComprison() {
        macBookComprison.click();
    }
    @FindBy(xpath = "(//i[@class='fa fa-exchange'])[3]")
    private WebElement macBookAirComprison;
    public void clickOnmacBookAirComprison() {
        macBookAirComprison.click();
    }
    @FindBy(xpath = "//a[text()='product comparison']")
    private WebElement productComprisonLink;
    public void clickOnproductComprisonLink() {
        productComprisonLink.click();
    }
    @FindBy(xpath = "//h1[text()='Product Comparison']")
    private WebElement productComprisonChart;
    public boolean showproductComprisonChart() {
        if (productComprisonChart.isDisplayed()) {
            return true;
        } else
            ;
        return false;
    }
    @FindBy(xpath = "(//button[@data-original-title='Add to Wish List'])[2]")
    private WebElement wishlist;
    public void clickOnwishlist() {
        wishlist.click();
    }
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    private WebElement alarmMessage;
    public boolean showAlarmMessage() {
        if (alarmMessage.equals(" You must login or create an account to save MacBook to your wish list!")) {
            return true;
        } else
            return false;
    }
    @FindBy(xpath = "//img[@alt='MacBook Pro']")
    private WebElement macBookPro;
    public void clickOnmacBookPro() {
        macBookPro.click();
    }
    @FindBy(xpath = "//h2[contains(text(),'$2,000.00')]")
    private WebElement priceTag;
    public boolean showPriceTag() {
        if (priceTag.getText().equals("$2,000.00")) {
            return true;
        } else
            ;
        return false;
    }

}
