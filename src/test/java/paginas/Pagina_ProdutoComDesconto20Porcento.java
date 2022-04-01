package paginas;

import core.BaseSelenium;
import elementos.Elementos_ProdutoComDesconto20Porcento;

public class Pagina_ProdutoComDesconto20Porcento extends BaseSelenium {

	private Elementos_ProdutoComDesconto20Porcento elem20 = new Elementos_ProdutoComDesconto20Porcento();

	public void clicarNoModoDeExibiçãoEmLista() {
		esperarPaginaSerCarregada();
		esperarPadrao(3);
		existe(elem20.getListView());
		clicar(elem20.getListView());
		rolarScrollTelaInteira();
	}

	public void verificarSeOProdutoTemDescontoDeVintePorCento() {
		pegaTextoSpan(elem20.getSpnpPerCentRedu(), "-20%");
	}
}
