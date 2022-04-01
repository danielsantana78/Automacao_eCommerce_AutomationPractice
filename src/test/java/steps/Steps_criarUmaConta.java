package steps;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import paginas.Pagina_criarUmaConta;

public class Steps_criarUmaConta {

	private Pagina_criarUmaConta criaConta = new Pagina_criarUmaConta();

	@Given("^que eu acesso o site automation pratice$")
	public void queEuAcessoOSiteAutomationPratice() throws Throwable {
		criaConta.navegarParaUrl();
	}

	@When("^clicar em signin$")
	public void clicarEmSignin() throws Throwable {
		criaConta.clicarEmSignIn();
	}

	@When("^preencher Email address e clico no botão Create an account$")
	public void preencherEmailAddressEClicoNoBotãoCreateAnAccount() throws Throwable {
		criaConta.preenchoEmailAddressClicoBotaoCreateAccount();
	}

	@When("^preencho o formulário de registro e clico no botão Register$")
	public void preenchoOFormulárioDeRegistroEClicoNoBotãoRegister() throws Throwable {
		criaConta.preenchoFormularioDeRegistroEClicoNoBotaoRegister();
	}

	@Then("^o sistema realiza o cadastro com sucesso$")
	public void oSistemaRealizaOCadastroComSucesso() throws Throwable {
		criaConta.validarNomeDoUsuarioLogado();
	}

	@Given("^opto por selecionar o menu \"([^\"]*)\" -> \"([^\"]*)\"$")
	public void optoPorSelecionarOMenu(String menu, String subMenu) throws Throwable {
		criaConta.acessaMenu(menu, subMenu);
	}

	@Then("^clico em signout$")
	public void clicoEmSignout() throws Throwable {
		criaConta.clicoEmSignout();
	}

}
