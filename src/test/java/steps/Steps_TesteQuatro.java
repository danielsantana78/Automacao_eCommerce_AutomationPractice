package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import paginas.Pagina_TesteQuatro;

public class Steps_TesteQuatro {

	private Pagina_TesteQuatro tstQuatro = new Pagina_TesteQuatro();

	@When("^opto por aumentar a quantidade do produto cinco vezes resultando em três$")
	public void optoPorAumentarAQuantidadeDoProdutoCincoVezesResultandoEmTrês() throws Throwable {
		tstQuatro.AumentarAQuantidadeDoProdutoCincoVezes();
	}

	@Then("^clicar em Proceed to checkout$")
	public void clicarEmProceedToCheckout() throws Throwable {
		tstQuatro.clicarEmProceedToCheckout();
	}

	@When("^clicar (\\d+) vez Proceed to botão checkout$")
	public void clicarVezProceedToBotãoCheckout(int arg1) throws Throwable {
		tstQuatro.clicarEmProceedToCheckout();
	}

	@Then("^o sistema realiza o cadastro com sucesso e sugere a confirmação do endereço de entrega$")
	public void oSistemaRealizaOCadastroComSucessoESugereAConfirmaçãoDoEndereçoDeEntrega() throws Throwable {
		tstQuatro.sugereAConfirmaçãoDoEndereçoDeEntrega();
	}

	@Then("^preencho o campo Home Phone limpo o campo Mobile Phone e preencho com novo número e salvo$")
	public void preenchoOCampoHomePhoneLimpoOCampoMobilePhoneEPreenchoComNovoNúmeroESalvo() throws Throwable {
		tstQuatro.preenchoOCampoHomePhoneLimpoOCampoMobilePhoneEPreenchoComNovoNumeroESalvo();
	}

}
