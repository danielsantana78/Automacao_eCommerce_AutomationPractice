package elementos;

import org.openqa.selenium.By;

public class Elementos_TesteCinco {

	private By nameAccont = By.xpath("//a[@class='account']");
	private By btnUpDate = By.xpath("//ul[@class='address item box']//span");
	private By cmpHomePhone = By.id("phone");
	private By cmpPhoneMobile = By.id("phone_mobile");
	private By btnSave = By.xpath("//p//button[@name='submitAddress']");
	private By btnMais = By.xpath("//a[@class='btn btn-default button-plus product_quantity_up']");
	private By botaoProceedToCheckOut = By
			.xpath("//p[@class='cart_navigation clearfix']//i[@class='icon-chevron-right right']");
	private By chckTrmSrv = By
			.xpath("//form//div[@class='order_carrier_content box']//p//div[@class='checker']//input");
	private By btnPayByBankWire = By.xpath("//div[@id='HOOK_PAYMENT']//a[@title='Pay by bank wire']");
	private By btnIConfirmMyOrder = By.xpath("//p[@class='cart_navigation clearfix']//span//i");
	private By boxTextStoreComplete = By.xpath("//div[@class='box']//p[@class='cheque-indent']");
	private By cartStatus = By.xpath("//span[@class='ajax_cart_no_product']");
	
	private By msgDoCarrinho = By.xpath("//p[@class='alert alert-warning']");
	
	
	public By getBotaoProceedToCheckOut() {
		return botaoProceedToCheckOut;
	}

	public By getNameAccont() {
		return nameAccont;
	}

	public By getBtnUpDate() {
		return btnUpDate;
	}

	public By getCmpHomePhone() {
		return cmpHomePhone;
	}

	public By getCmpPhoneMobile() {
		return cmpPhoneMobile;
	}

	public By getBtnSave() {
		return btnSave;
	}

	public By getBtnMais() {
		return btnMais;
	}

	public By getChckTrmSrv() {
		return chckTrmSrv;
	}

	public By getBtnPayByBankWire() {
		return btnPayByBankWire;
	}

	public By getBtnIConfirmMyOrder() {
		return btnIConfirmMyOrder;
	}

	public By getBoxTextStoreComplete() {
		return boxTextStoreComplete;
	}

	public By getCartStatus() {
		return cartStatus;
	}

	public By getMsgDoCarrinho() {
		return msgDoCarrinho;
	}

}
