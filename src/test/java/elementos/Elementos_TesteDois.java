package elementos;

import org.openqa.selenium.By;

public class Elementos_TesteDois {

	private By lstProd = By.xpath("//div//ul[@class='product_list grid row homefeatured tab-pane active']//li//h5//a");
	private By listProd = By.xpath(
			"//li[@class='ajax_block_product col-xs-12 col-sm-4 col-md-3 last-line first-item-of-tablet-line first-item-of-mobile-line last-mobile-line']");
	private By homeProd = By.xpath("//ul[@class='product_list grid row homefeatured tab-pane active']");
	private By btnMore = By.xpath(
			"//li[@class='ajax_block_product col-xs-12 col-sm-4 col-md-3 last-line first-item-of-tablet-line first-item-of-mobile-line last-mobile-line hovered']//a[@class='button lnk_view btn btn-default']");
	private By btnAddToCart = By.xpath(
			"//li[@class='ajax_block_product col-xs-12 col-sm-4 col-md-3 last-line first-item-of-tablet-line first-item-of-mobile-line last-mobile-line hovered']//a[@class='button ajax_add_to_cart_button btn btn-default']");
	private By btnMais = By.xpath("//a[@class='btn btn-default button-plus product_quantity_up']");
	private By slcSize = By.xpath("//div[@class='attribute_list']//select");
	private By lstColors = By.xpath("//ul[@class='clearfix']");
	private By corVerde = By.xpath("//ul[@class='clearfix']//li//a[@title='Green']");
	private By botaoAddToCart = By.xpath("//button[@name='Submit']");
	private By botaoProceedToCheckOut = By.xpath(
			"//div[@class='layer_cart_cart col-xs-12 col-md-6']//a[@class='btn btn-default button button-medium']//i");
	private By valorTotal = By.xpath("//td[@class='price']//span");

	
	public By getLstProd() {
		return lstProd;
	}

	public By getBtnMore() {
		return btnMore;
	}

	public By getListProd() {
		return listProd;
	}

	public By getHomeProd() {
		return homeProd;
	}

	public By getBtnAddToCart() {
		return btnAddToCart;
	}

	public By getBtnMais() {
		return btnMais;
	}

	public By getSlcSize() {
		return slcSize;
	}

	public By getLstColors() {
		return lstColors;
	}

	public By getCorVerde() {
		return corVerde;
	}

	public By getBotaoAddToCart() {
		return botaoAddToCart;
	}

	public By getBotaoProceedToCheckOut() {
		return botaoProceedToCheckOut;
	}

	public By getValorTotal() {
		return valorTotal;
	}

}
