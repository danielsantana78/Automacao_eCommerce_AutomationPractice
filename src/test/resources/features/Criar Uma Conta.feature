
Feature: Criar uma nova conta para usuário não cadastrado

Background:
  Given que eu acesso o site automation pratice

 @CriarUmaConta @teste @TodosOs7Cenarios @CriarUmaConta
 Scenario: criar uma nova conta, logar, passar o mouse sobre o menu Dresses e escolher a opção Summer Dresses
  When clicar em signin
  And preencher Email address e clico no botão Create an account
  And preencho o formulário de registro e clico no botão Register
  Then o sistema realiza o cadastro com sucesso
  And opto por selecionar o menu "Dresses" -> "Summer Dresses"
  And clico em signout

@CriarUmaContaESelecionarCasualDresses @teste @TodosOs7Cenarios @CriarUmaConta
Scenario:  Acriar uma nova conta, logar, passar o mouse sobre o menu Dresses e escolher a opção Casual Dresses
  When clicar em signin
  And preencher Email address e clico no botão Create an account
  And preencho o formulário de registro e clico no botão Register
  Then o sistema realiza o cadastro com sucesso
  And opto por selecionar o menu "Dresses" -> "Casual Dresses"
  And clico em signout
  
@CriarUmaContaESelecionarEveningDresses @teste @TodosOs7Cenarios @CriarUmaConta
Scenario: criar uma nova conta, logar, passar o mouse sobre o menu Dresses e escolher a opção Evening Dresses
  When clicar em signin
  And preencher Email address e clico no botão Create an account
  And preencho o formulário de registro e clico no botão Register
  Then o sistema realiza o cadastro com sucesso
  And opto por selecionar o menu "Dresses" -> "Evening Dresses"
  And clico em signout
  
