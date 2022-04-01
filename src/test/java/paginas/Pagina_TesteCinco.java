package paginas;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import core.BaseSelenium;
import elementos.Elementos_TesteCinco;

public class Pagina_TesteCinco extends BaseSelenium  {

	
	private Elementos_TesteCinco eleTstCinco = new Elementos_TesteCinco();
	
	
	public void AumentarAQuantidadeDoProdutoCincoVezes() {
		System.out.println("clicou para aumentar a quantidade de peças para 5");
		for (int i = 0; i < 4; i++) {
			esperarPadrao(2);
			esperarElementoExistir(eleTstCinco.getBtnMais());
			moverParaElemento(eleTstCinco.getBtnMais());
			clicar(eleTstCinco.getBtnMais());
		}
	}

	public void marcarOCheckboxParaAceitarOsTermosDeServiço() {
		clicar(eleTstCinco.getChckTrmSrv());
		System.out.println("concordou com os termos de serviço");
		clicar(eleTstCinco.getBotaoProceedToCheckOut());
		System.out.println("clicou no botão Proceed to checkout");
		rolarScrollMeiaTela();
	}

	public void clicarNoBotaoParaEscolherOPagamentoComCartaoComoFormaDeCompra() {
		clicar(eleTstCinco.getBtnPayByBankWire());
		System.out.println("escolheu a opção Pay by bank wire");
		rolarScrollTelaInteira();
	}

	public void clicarNoBotaoParaConfirmarOPagamento(String confirma) {
		clicar(eleTstCinco.getBtnIConfirmMyOrder());
		System.out.println("clicou no botão I Confirm My Order");
	}

	public void validoQueOPagamentoFoiCompletado(String pedidoConcluido) {
		//pegaTexto(eleTstCinco.getBoxTextStoreComplete(), pedidoConcluido);
	}
	
	public void pegaTexto(By elemento, String pedidoConcluído) {
		String pedidoConcluido = getDriver().findElement(elemento).getText();
		assertEquals(pedidoConcluido, "Your order on My Store is complete.");
	}

	
	public void validoMsgSeuCarrinhoComprasEstaVazio(String carrinhoVazio) {
		clicar(eleTstCinco.getCartStatus());
		pegaCarrinhoVazio(eleTstCinco.getMsgDoCarrinho() , carrinhoVazio);
		rolarScrollMeiaTela();
		
	}
	
	public void pegaCarrinhoVazio(By elemento, String carrinhoVazio) {
		String validaCarrinhoVazio = getDriver().findElement(elemento).getText();
		assertEquals(validaCarrinhoVazio, carrinhoVazio);
	}


	
}
