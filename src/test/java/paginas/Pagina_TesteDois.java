package paginas;

import static org.junit.Assert.assertEquals;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import core.BaseSelenium;
import elementos.Elementos_TesteDois;

public class Pagina_TesteDois extends BaseSelenium {

	private Elementos_TesteDois eleTstDois = new Elementos_TesteDois();

	public void optoPorClicarNoBotaoMoreDoProduto(String produto, String more) {

		WebElement wProd = procurar(eleTstDois.getHomeProd());
		List<WebElement> lProdutos = wProd.findElements(By.xpath("./li"));
		for (WebElement itensProdutos : lProdutos) {
			String item = itensProdutos.findElement(By.tagName("h5")).getText();
			if (produto.equalsIgnoreCase(item)) {
				System.out.println("Escolheu o Produto " + item);
				dragAndDrop(itensProdutos);
				WebElement caixbtn = itensProdutos.findElement(By.xpath("//div[@class='right-block']"));
				List<WebElement> subItensProdutos = caixbtn.findElements(eleTstDois.getBtnMore());
				for (WebElement subBtnProdutos : subItensProdutos) {
					String wSubBtnProdutos = subBtnProdutos.findElement(eleTstDois.getBtnMore()).getText();
					System.out.println("clicou no botão " + wSubBtnProdutos);
					if (more.equalsIgnoreCase(wSubBtnProdutos)) {
						clicar(subBtnProdutos);
					}
				}
			}
		}
	}

	public void AumentarAQuantidadeDoProdutoTresVezes() {
		System.out.println("clicou para aumentar a quantidade de peças para 3");
		for (int i = 0; i < 2; i++) {
			esperarElementoExistir(eleTstDois.getBtnMais());
			moverParaElemento(eleTstDois.getBtnMais());
			clicar(eleTstDois.getBtnMais());
		}
	}

	public void selecionoOTamanhoMNoComboboxSize() {
		comboBoxPorIndex(eleTstDois.getSlcSize(), 1);
		System.out.println("escolheu tamanho M");
	}

	public void clicarNaCorVerde(String Green) {

		System.out.println("escolheu cor Verde");
		clicar(eleTstDois.getCorVerde());
	}

	public void adicionarAoCarrinho() {
		System.out.println("clicou no botão Add to Cart");
		clicar(eleTstDois.getBotaoAddToCart());
	}

	public void clicarEmProceedToCheckout() {
		System.out.println("clicou no botão Proceed To CheckOut");
		rolarScrollMeiaTela();
		esperarPadrao(2);
		esperarElementoExistir(eleTstDois.getBotaoProceedToCheckOut());
		clicar(eleTstDois.getBotaoProceedToCheckOut());
	}

	public void verificarOTotalDaCompra(String valor) {
		pegaValor(eleTstDois.getValorTotal(), valor);
		System.out.println("confirmou valor " + valor);
	}

	public void pegaValorDoProduto(By elemento, String string) {
		String desc = getDriver().findElement(elemento).getText();
		assertEquals(desc, "$84.00");
		rolarScrollTelaInteira();
	}
	
	public void pegaValor(By elemento, String string) {
		String desc = getDriver().findElement(elemento).getText();
		assertEquals(desc, "$51.2");
		rolarScrollTelaInteira();
	}
	
}
