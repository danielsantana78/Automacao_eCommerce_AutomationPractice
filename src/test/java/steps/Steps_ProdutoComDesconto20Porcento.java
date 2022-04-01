package steps;


import cucumber.api.java.en.When;
import paginas.Pagina_ProdutoComDesconto20Porcento;

public class Steps_ProdutoComDesconto20Porcento {

	private Pagina_ProdutoComDesconto20Porcento produto20 = new Pagina_ProdutoComDesconto20Porcento();

	@When("^opto por clicar no modo de exibição em lista$")
	public void optoPorClicarNoModoDeExibiçãoEmLista() throws Throwable {
		produto20.clicarNoModoDeExibiçãoEmLista();
	}

	@When("^verificar se o produto da terceira linha tem um desconto de vinte por cento$")
	public void verificarSeOProdutoDaTerceiraLinhaTemUmDescontoDeVintePorCento() throws Throwable {
		produto20.verificarSeOProdutoTemDescontoDeVintePorCento();
	}

}
