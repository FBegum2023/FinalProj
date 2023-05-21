package luma.usa.elementPage;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import luma.usa.basepage.SuperClass;
import luma.usa.genericFunctions.CommonMethods;
import luma.usa.genericFunctions.WaitHelper;

public class PageFactoryElements extends SuperClass {
	
	public PageFactoryElements() {
		PageFactory.initElements(driver, this);
	}

	//How can we store the Web Elements
	@FindBy(linkText = "Sign In")
	@CacheLookup
	private WebElement SignInBtn;// encapsulated method
	public WebElement getSignInBtn() {
	return SignInBtn;
	}

	//Email
	@FindBy(id = "email")
	@CacheLookup
	private WebElement UserName;
	public WebElement getUserID() {
	return UserName;
	}

	// password
	@FindBy(id = "pass")
	@CacheLookup
	private WebElement PassWord;
	public WebElement getPassWord() {
	return PassWord;
	}

	//LoginBtn
	@FindBy(xpath = "//button[@class='action login primary']")
	@CacheLookup
	private WebElement ClickSignInButton;
	public WebElement getClickSignInButton() {
	return ClickSignInButton;
	}
	// $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$

	//menLink
	@FindBy(linkText = "Men")
	@CacheLookup
	private WebElement MenModule;
	public WebElement getMenModule() {
	return MenModule;
	}

	//Tops
	@FindBy(linkText = "Tops")
	@CacheLookup
	private WebElement SelectTops;
	public WebElement getSelectTops() {
	return SelectTops;
	}

	//SelectJackets
	@FindBy(linkText = "Jackets")
	@CacheLookup
	private WebElement SelectJackets;
	public WebElement getSelectJackets() {
	return SelectJackets;
	}

	// =========================================
	@FindBy(xpath = "(//*[@class= 'product-item-link'])[3]")
	@CacheLookup
	private WebElement SelectJupitarJacket;
	public WebElement getSelectJupitarJacket() {
	return SelectJupitarJacket;
	}

	//size
	@FindBy(xpath = "//div[@id='option-label-size-143-item-169']")
	@CacheLookup
	private WebElement SelectSize;
	public WebElement getSelectSize() {
	return SelectSize;
	}

	//color
	@FindBy(xpath = "//div[@id='option-label-color-93-item-50']")
	@CacheLookup
	private WebElement SelectColor;
	public WebElement getSelectColor() {
	return SelectColor;
	}

	// Qty
	@FindBy(id = "qty")
	@CacheLookup
	private WebElement SelectQty;
	public WebElement getSelectQty() {
	return SelectQty;
	}

	//Add cart
	@FindBy(xpath = "//*[text()='Add to Cart']")
	@CacheLookup
	private WebElement ClickAddToCart;
	public WebElement getClickAddToCart() {
	return ClickAddToCart;
	}

	// CartLink
	@FindBy(xpath = "//a[text()='shopping cart']")
	@CacheLookup
	private WebElement SelectShoppingCartLink;
	public WebElement getSelectShoppingCartLink() {
	return SelectShoppingCartLink;
	}

	//ChekoutBtn
	@FindBy(xpath = "(//button[@class='action primary checkout'])[2]")
	@CacheLookup
	private WebElement SelectProceedToCheckout;
	public WebElement getSelectProceedToCheckout() {
	return SelectProceedToCheckout;
	}

	//New Address###########################
	@FindBy(xpath = "//*[text()='New Address']")
	//@FindBy(xpath = "div[@class='new-address-popup']")
	@CacheLookup
	private WebElement ClickNewAddressLink;
	public WebElement getClickNewAddressLink() {
	return ClickNewAddressLink;
	}

	//FName
	//@FindBy(xpath = "//input[@id='AN29H91']")
	@FindBy(xpath = "//input[@name='firstname']")
	@CacheLookup
	private WebElement EnterFirstName;
	public WebElement getEnterFirstName() {
	return EnterFirstName;
	}

	//Lname
	@FindBy(xpath = "//input[@name='lastname']")
	@CacheLookup
	private WebElement EnterLastName;
	public WebElement getEnterLastName() {
	return EnterLastName;
	}

	//Company
	@FindBy(xpath = "//input[@name='company']")
	@CacheLookup
	private WebElement EnterCompanyName;
	public WebElement getEnterCompanyName() {
	return EnterCompanyName;
	}

	//streetAddress
	@FindBy(xpath = "//input[@name='street[0]']")
	@CacheLookup
	private WebElement EnterStreetAddress;
	public WebElement getEnterStreetAddress() {
	return EnterStreetAddress;
	}

	//city
	@FindBy(xpath = "//input[@name='city']")
	@CacheLookup
	private WebElement SelectCity;
	public WebElement getSelectCity() {
	return SelectCity;
	}
	//State/Province

	
	  
	  @FindBy(xpath="(//select[@class='select'])[1]")
	  @CacheLookup
	  private WebElement SelectState;
	  public WebElement getSelectState() {
	  return SelectState;
	  }
	  

	//Zip/Postal Code
	@FindBy(xpath = "//input[@name='postcode']")
	@CacheLookup
	private WebElement EnterZipCode;
	public WebElement getEnterZipCode() {
		return EnterZipCode;
	}

	/*
	 * //country
	 * 
	 * @FindBy(xpath="//select[@name='country_id']")
	 * 
	 * @CacheLookup private WebElement SelectCountry; public WebElement
	 * getSelectCountry() { return SelectCountry; }
	 */

	//List of country
	@FindBy(xpath = "(//select[@class='select'])[2]/option")
	@CacheLookup
	private List<WebElement> SelectListCountry;
	public List<WebElement> getSelectListCountry() {
	return SelectListCountry;
	}

	//Phone Number
	@FindBy(xpath = "//input[@name='telephone']")
	@CacheLookup
	private WebElement EnterPhoneNumber;
	public WebElement getEnterPhoneNumber() {
	return EnterPhoneNumber;
	}

	//ShipHereBtn
	@FindBy(xpath = "(//input[@class='radio'])[1]")
	@CacheLookup
	private WebElement ClickShipHereBtn;
	public WebElement getClickShipHereBtn() {
	return ClickShipHereBtn;
	}
	// ********************************************

	//RadioBtn
	@FindBy(xpath = "(//input[@class='radio'])[1]")
	@CacheLookup
	private WebElement SelectShippingMethodBtn;
	public WebElement getSelectShippingMethodBtn() {
	return SelectShippingMethodBtn;
	}

	//nextBtn
	@FindBy(xpath = "//*[text()='Next']")
	@CacheLookup
	private WebElement SelectNextBtn;
	public WebElement getSelectSelectNextBtn() {
	return SelectNextBtn;
	}

	//Billing and shipping same ChkBox
//	@FindBy(xpath = "//input[@name='billing-address-same-as-shipping']")
//	@CacheLookup
//	private WebElement SelectBillingAndShippingChkBox;
//	public WebElement getSelectBillingAndShippingChkBox() {
//	return SelectBillingAndShippingChkBox;
//	}

	//nextBtn
	@FindBy(xpath = "//*[text()='Place Order']")
	//@FindBy(xpath = "(//button[@type='submit'])[3]")
	@CacheLookup
	private WebElement SelectPlaceOrderBtn;
	public WebElement getSelectPlaceOrderBtn() {
	return SelectPlaceOrderBtn;
	}
	
	//VerifyOrderConfirmation
	@FindBy(xpath = "//*[text()='Thank you for your purchase!']")
	@CacheLookup
	private WebElement VerifyOrderConfirmation;
	public WebElement getVerifyOrderConfirmation() {
	return VerifyOrderConfirmation;
	}
		/////////////////////////////////////////////
	// xpath for list of WebElements
	@FindBy(xpath = "(//*[@class='select'])[1]/option")
	@CacheLookup 
	private List<WebElement> SelectListState;
	public List<WebElement> getSelectListState(){
	return SelectListState;
	}
		 

	// **********************************************
	public void AddNewShippingDetails() {
	log.info(">>>>user able to select Tops from Men module<<<< ");
	WaitHelper.seleniumWait(getClickNewAddressLink());
	CommonMethods.jsClick(getClickNewAddressLink());
		
	//First Name
	log.info(">>>>user able to Enter First Name<<<< ");
	WaitHelper.seleniumWait(getEnterFirstName());
	getEnterFirstName().clear();
	getEnterFirstName().sendKeys(prop.getProperty("FirstName"));

	//Last Name
	log.info(">>>>user able to Enter Last Name<<<< ");
	WaitHelper.seleniumWait(getEnterLastName());
	getEnterLastName().clear();
	getEnterLastName().sendKeys(prop.getProperty("LastName"));

	//Company name
	log.info(">>>>user able to enter Company name<<<< ");
	WaitHelper.seleniumWait(getEnterCompanyName());
	getEnterCompanyName().clear();
	getEnterCompanyName().sendKeys(prop.getProperty("CompanyName"));
		
	//Address
	log.info(">>>>user able to enter Address<<<< ");
	WaitHelper.seleniumWait(getEnterStreetAddress());
	getEnterStreetAddress().clear();
	getEnterStreetAddress().sendKeys(prop.getProperty("StreetAddress"));
		
	//City
	log.info(">>>>user able to select city<<<< ");
	WaitHelper.seleniumWait(getSelectCity());
	getSelectCity().clear();
	getSelectCity().sendKeys(prop.getProperty("City"));

	//state
	log.info(">>>>user able to select state from dropdown<<<< ");
	CommonMethods.dropDown(getSelectState(), "New York");
	//CommonMethods.handleDropdown(getSelectListState(), "New York");

    //Zip code
	log.info(">>>>user able to enter Zip Code <<<< ");
	WaitHelper.seleniumWait(getEnterZipCode());
	getEnterZipCode().clear();
	getEnterZipCode().sendKeys(prop.getProperty("ZipCode"));

	//country
	log.info(">>>>user able to select country from dropdown<<<< ");
	//CommonMethods.dropDown(getSelectCountry(), "United States");
	CommonMethods.handleDropdown(getSelectListCountry(), "United States");
		
	// phone #
	log.info(">>>>user able to Enter Phone Number<<<< ");
	WaitHelper.seleniumWait(getEnterPhoneNumber());
	getEnterPhoneNumber().clear();
	getEnterPhoneNumber().sendKeys(prop.getProperty("PhoneNumber"));
		
	// Ship Here BTn
	log.info(">>>>user able to click Ship Here Button<<<< ");
	WaitHelper.seleniumWait(getClickShipHereBtn());
	CommonMethods.actionClick(getClickShipHereBtn());
   
	}

	/// +++++++++++++++++Login++++++++++++++++++++++++++
	
	public void applicationLogIn() {

		getSignInBtn().click();
		getUserID().sendKeys(prop.getProperty("UserName"));
		getPassWord().sendKeys(prop.getProperty("passWord"));
		getClickSignInButton().click();
	}

};
