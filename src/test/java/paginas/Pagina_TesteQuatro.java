package paginas;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import core.BaseSelenium;
import elementos.Elementos_TesteQuatro;

public class Pagina_TesteQuatro extends BaseSelenium {

	private Elementos_TesteQuatro eleTstQuatro = new Elementos_TesteQuatro();


	
	public void AumentarAQuantidadeDoProdutoCincoVezes() {
		System.out.println("clicou para aumentar a quantidade de peças para 5");
		for (int i = 0; i < 4; i++) {
			esperarPadrao(2);
			esperarElementoExistir(eleTstQuatro.getBtnMais());
			moverParaElemento(eleTstQuatro.getBtnMais());
			clicar(eleTstQuatro.getBtnMais());
		}
	}
	
	
	public void clicarEmProceedToCheckout() {
			System.out.println("clicou no botão Proceed To CheckOut");
			rolarScrollMeiaTela();
			esperarPadrao(2);
			esperarElementoExistir(eleTstQuatro.getBotaoProceedToCheckOut());
			clicar(eleTstQuatro.getBotaoProceedToCheckOut());
	}


	public void clicarEmProceedToCheckout(int valor) {
		System.out.println("clicou no outro botão Proceed To CheckOut");
		rolarScrollTelaInteira();
		esperarElementoExistir(eleTstQuatro.getBotaoProceedToCheckOut());
		clicar(eleTstQuatro.getBotaoProceedToCheckOut());
		pegaValorDoProduto(eleTstQuatro.getValorTotal(), valor);
	}

	public void sugereAConfirmaçãoDoEndereçoDeEntrega() {
		existe(eleTstQuatro.getNameAccont());
	}

	public void preenchoOCampoHomePhoneLimpoOCampoMobilePhoneEPreenchoComNovoNumeroESalvo() {
		rolarScrollMeiaTela();
		clicar(eleTstQuatro.getBtnUpDate());
		rolarScrollTelaInteira();
		limparCampo(eleTstQuatro.getCmpPhoneMobile());
		escrever(eleTstQuatro.getCmpHomePhone(), "11 4444-5555");
		escrever(eleTstQuatro.getCmpPhoneMobile(), "11 97777-9999");
		clicar(eleTstQuatro.getBtnSave());
	}
	
	public void pegaValorDoProduto(By elemento, int valor) {
		String desc = getDriver().findElement(eleTstQuatro.getValorTotal()).getText();
		assertEquals(desc, "$84.00");
	}

}
