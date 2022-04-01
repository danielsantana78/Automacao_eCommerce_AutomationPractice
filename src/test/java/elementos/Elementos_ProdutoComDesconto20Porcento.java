package elementos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Elementos_ProdutoComDesconto20Porcento {

	private By listView = By.xpath("//div[@class='content_sortPagiBar clearfix']//li[@id='list']");
	private By spnpPerCentRedu = By.xpath(
			"//li[@class='ajax_block_product last-in-line last-line first-item-of-tablet-line last-item-of-mobile-line last-mobile-line col-xs-12']//div[@class='right-block-content row']//span[contains(@span='price-percent-reduction', '')][3]");

	
	public By getListView() {
		return listView;
	}

	public By getSpnpPerCentRedu() {
		return spnpPerCentRedu;
	}

}
