package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import paginas.Pagina_TesteDois;

public class Steps_TesteDois {

	private Pagina_TesteDois tstDois = new Pagina_TesteDois();


	@When("^opto por escolher o produto \"([^\"]*)\" -> \"([^\"]*)\"$")
	public void optoPorEscolherOProduto(String produto, String more) throws Throwable {	   
		tstDois.optoPorClicarNoBotaoMoreDoProduto(produto, more);
	}
	
	@When("^opto por aumentar a quantidade do produto duas vezes resultando em três$")
	public void optoPorAumentarAQuantidadeDoProdutoDuasVezesResultandoEmTrês() throws Throwable {
		tstDois.AumentarAQuantidadeDoProdutoTresVezes();
	}

	@When("^seleciono o tamanho M no combobox Size$")
	public void selecionoOTamanhoMNoComboboxSize() throws Throwable {
		tstDois.selecionoOTamanhoMNoComboboxSize();
	}

	@When("^opto por clicar na cor \"([^\"]*)\"$")
	public void optoPorClicarNaCor(String verde) throws Throwable {
		tstDois.clicarNaCorVerde(verde);
	}

	@When("^opto por clicar no botão Add to cart para adicionar ao carrinho$")
	public void optoPorClicarNoBotãoAddToCartParaAdicionarAoCarrinho() throws Throwable {
		tstDois.adicionarAoCarrinho();
	}

	@When("^opto por clicar em Proceed to checkout$")
	public void optoPorClicarEmProceedToCheckout() throws Throwable {
		tstDois.clicarEmProceedToCheckout();
	}

	@Then("^Verifico se o total da compra é de \"([^\"]*)\"$")
	public void verificoSeOTotalDaCompraÉDe(String valor) throws Throwable {
		tstDois.verificarOTotalDaCompra(valor);
	}
}
