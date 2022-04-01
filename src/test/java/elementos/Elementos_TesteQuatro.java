package elementos;

import org.openqa.selenium.By;

public class Elementos_TesteQuatro {

	private By botaoProceedToCheckOut = By.xpath("//p[@class='cart_navigation clearfix']//i[@class='icon-chevron-right right']");
	private By nameAccont = By.xpath("//a[@class='account']");
	private By btnUpDate = By.xpath("//ul[@class='address item box']//span");
	private By cmpHomePhone = By.id("phone");
	private By cmpPhoneMobile = By.id("phone_mobile");	
	private By btnSave = By.xpath("//p//button[@name='submitAddress']");
	private By btnMais = By.xpath("//a[@class='btn btn-default button-plus product_quantity_up']");
	
	
	private By valorTotal = By.xpath("//td[@class='price']//span");
	
	
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

	public By getValorTotal() {
		return valorTotal;
	}
	
}
