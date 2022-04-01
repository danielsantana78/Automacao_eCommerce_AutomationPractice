package elementos;

import org.openqa.selenium.By;

public class Elementos_criarUmaConta {

	private By btnSignin = By.xpath("//a[@class='login']");
	private By cmpEmailCreate = By.xpath("//input[@id='email_create']");
	private By btnCreateAnAccount = By.xpath("//button[@id='SubmitCreate']");
	private By rbMr = By.id("id_gender1");
	private By cmpFirstName = By.id("customer_firstname");
	private By cmpLastName = By.id("customer_lastname");
	private By cmpPassword = By.id("passwd");
	private By slctDayDtBirth = By.id("days");
	private By slctmonthsDtBirth = By.id("months");
	private By slctyearsDtBirth = By.id("years");
	private By chckbxnewsletter = By.id("newsletter");
	private By chckbxSpecialOffers = By.id("uniform-optin");
	private By cmpCompany = By.id("company");
	private By cmpaddress1 = By.id("address1");
	private By cmpCity = By.id("city");
	private By slctState = By.id("id_state");
	private By cmppostcode = By.id("postcode");
	private By slctCountry = By.id("uniform-id_country");
	private By cmpPhoneMobile = By.id("phone_mobile");
	private By cmpAlias = By.id("alias");
	private By btnRegister = By.id("submitAccount");
	private By nameAccont = By.xpath("//a[@class='account']");
	private By menu = By.xpath("//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']");
	private By subMenu = By.xpath("//ul[contains(@class,'submenu-container')]");
	private By quickView = By.xpath("//div[@class='product-image-container']");
	private By btnAddToCart = By.xpath("//a[@title='Add to cart']");	
	private By btnSignOut = By.xpath("//a[@class='logout']");
	

	public By getBtnSignin() {
		return btnSignin;
	}

	public By getCmpEmailCreate() {
		return cmpEmailCreate;
	}

	public By getBtnCreateAnAccount() {
		return btnCreateAnAccount;
	}

	public By getRbMr() {
		return rbMr;
	}

	public By getCmpFirstName() {
		return cmpFirstName;
	}

	public By getCmpLastName() {
		return cmpLastName;
	}

	public By getCmpPassword() {
		return cmpPassword;
	}

	public By getSlctDayDtBirth() {
		return slctDayDtBirth;
	}

	public By getSlctmonthsDtBirth() {
		return slctmonthsDtBirth;
	}

	public By getSlctyearsDtBirth() {
		return slctyearsDtBirth;
	}

	public By getChckbxnewsletter() {
		return chckbxnewsletter;
	}

	public By getChckbxSpecialOffers() {
		return chckbxSpecialOffers;
	}

	public By getCmpCompany() {
		return cmpCompany;
	}

	public By getAddress1() {
		return cmpaddress1;
	}

	public By getCmpCity() {
		return cmpCity;
	}

	public By getSlctState() {
		return slctState;
	}

	public By getCmppostcode() {
		return cmppostcode;
	}

	public By getSlctCountry() {
		return slctCountry;
	}

	public By getCmpPhoneMobile() {
		return cmpPhoneMobile;
	}

	public By getCmpAlias() {
		return cmpAlias;
	}

	public By getBtnRegister() {
		return btnRegister;
	}

	public By getNameAccont() {
		return nameAccont;
	}

	public By getMenu() {
		return menu;
	}

	public By getSubMenu() {
		return subMenu;
	}

	public By getQuickView() {
		return quickView;
	}

	public By getBtnAddToCart() {
		return btnAddToCart;
	}

	public By getBtnSignOut() {
		return btnSignOut;
	}

}
