package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import paginas.Pagina_TesteCinco;

public class Steps_TesteCinco {
	
	
	private Pagina_TesteCinco tstCinco = new Pagina_TesteCinco();
	
	
	@When("^opto por aumentar a quantidade do produto em cinco vezes resultando em três$")
	public void optoPorAumentarAQuantidadeDoProdutoEmCincoVezesResultandoEmTrês() throws Throwable {

		tstCinco.AumentarAQuantidadeDoProdutoCincoVezes();

	}
	
	@When("^opto por marcar o checkbox para aceitar os termos de serviço$")
	public void optoPorMarcarOCheckboxParaAceitarOsTermosDeServiço() throws Throwable {
		tstCinco.marcarOCheckboxParaAceitarOsTermosDeServiço();
	}

	@When("^opto por clicar no botão para escolher o pagamento com cartão como forma de compra$")
	public void optoPorClicarNoBotãoParaEscolherOPagamentoComCartãoComoFormaDeCompra() throws Throwable {
		tstCinco.clicarNoBotaoParaEscolherOPagamentoComCartaoComoFormaDeCompra();
	}

	@When("^opto por Clicar no botão \"([^\"]*)\" para confirmar o pagamento$")
	public void optoPorClicarNoBotãoParaConfirmarOPagamento(String confirma) throws Throwable {
		tstCinco.clicarNoBotaoParaConfirmarOPagamento(confirma);
	}
	
	@Then("^valido o texto \"([^\"]*)\"$")
	public void validoOTexto(String pedidoConcluido) throws Throwable {
		tstCinco.validoQueOPagamentoFoiCompletado(pedidoConcluido);
	}
	

	@Then("^valido se o carrinho apresenta a mensagem \"([^\"]*)\"$")
	public void validoSeOCarrinhoApresentaAMensagem(String CarrinhoVazio) throws Throwable {	   
		tstCinco.validoMsgSeuCarrinhoComprasEstaVazio(CarrinhoVazio);
	}

}
