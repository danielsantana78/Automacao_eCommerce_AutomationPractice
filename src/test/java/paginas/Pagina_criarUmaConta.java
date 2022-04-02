package paginas;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import core.BaseSelenium;
import elementos.Elementos_criarUmaConta;

public class Pagina_criarUmaConta extends BaseSelenium {

	private Elementos_criarUmaConta eleCriaConta = new Elementos_criarUmaConta();

	public void clicarEmSignIn() {
		clicar(eleCriaConta.getBtnSignin());
	}

	public void preenchoEmailAddressClicoBotaoCreateAccount() {
		esperarPaginaSerCarregada();
		esperarPadrao(3);
		esperarElementoExistir(eleCriaConta.getCmpEmailCreate());
		escrever(eleCriaConta.getCmpEmailCreate(), "hwynxequerrdrkyww" + new Random().nextInt(10000) + "@gmail.com");
		esperarPadrao(3);
		esperarSerClicavel(eleCriaConta.getBtnCreateAnAccount());
		esperarPadrao(3);
		clicar(eleCriaConta.getBtnCreateAnAccount());
		esperarPaginaSerCarregada();

	}

	public void preenchoFormularioDeRegistroEClicoNoBotaoRegister() throws Exception {

		// esperarElementoExistir(eleCriaConta.getRbMr());
		esperarSerClicavel(eleCriaConta.getRbMr());

		clicar(eleCriaConta.getRbMr());
		escreveNoCampo(eleCriaConta.getCmpFirstName(), "Daniel");
		escreveNoCampo(eleCriaConta.getCmpLastName(), "SantAna Oliveira");
		escreveNoCampo(eleCriaConta.getCmpPassword(), "123@abc");
		comboBoxPorValor(eleCriaConta.getSlctDayDtBirth(), "20");
		comboBoxPorValor(eleCriaConta.getSlctmonthsDtBirth(), "9");
		comboBoxPorValor(eleCriaConta.getSlctyearsDtBirth(), "1978");
		clicar(eleCriaConta.getChckbxnewsletter());
		rolarScrollTelaInteira();
		clicar(eleCriaConta.getChckbxSpecialOffers());
		escreveNoCampo(eleCriaConta.getCmpCompany(), "Autonomo");
		escreveNoCampo(eleCriaConta.getAddress1(), "FL Covers 59");
		escreveNoCampo(eleCriaConta.getCmpCity(), "Orlando");
		comboBoxPorValor(eleCriaConta.getSlctState(), "6");
		escreveNoCampo(eleCriaConta.getCmppostcode(), "80201");
		escreveNoCampo(eleCriaConta.getCmpPhoneMobile(), "551199995555");
		escreveNoCampo(eleCriaConta.getCmpAlias(), "Daniel");
		clicar(eleCriaConta.getBtnRegister());
		rolarScrollMeiaTela();
	}

	public void validarNomeDoUsuarioLogado() {
		existe(eleCriaConta.getNameAccont());
	}

	public void acessaMenu(String menu, String subMenu) {

		WebElement wMenu = procurar(eleCriaConta.getMenu());
		List<WebElement> lMenu = wMenu.findElements(By.xpath("./li"));
		for (WebElement itensMenu : lMenu) {
			String item = itensMenu.findElement(By.tagName("a")).getText();
			if (menu.equalsIgnoreCase(item)) {
				dragAndDrop(itensMenu);
				System.out.println("selecionou o item " + item + " do menu.");
				WebElement wMenuNivel = itensMenu.findElement(By.xpath(".//ul[contains(@class,'submenu-container')]"));
				List<WebElement> itemSubMenu = wMenuNivel.findElements(By.xpath("./li"));
				for (WebElement subMenus : itemSubMenu) {
					String wSubMenu = subMenus.findElement(By.tagName("a")).getText();
					if (subMenu.equalsIgnoreCase(wSubMenu)) {
						clicar(subMenus);
						System.out.println("selecionou o item " + wSubMenu + " do submenu.");
						esperarPaginaSerCarregada();
						rolarScrollTelaInteira();
						break;
					}
				}
				break;
			}
		}
	}

	public void clicoEmSignout() {
		existe(eleCriaConta.getBtnSignOut());
		clicar(eleCriaConta.getBtnSignOut());
	}

}
