
Feature: Criar uma nova conta para usuário não cadastrado

Background:
  Given que eu acesso o site automation pratice

 @CriarUmaConta @teste @TodosOs7Cenarios @CriarUmaConta
 Scenario: Acessar a home do ecommerce e criar um conta
  When clicar em signin
  And preencher Email address e clico no botão Create an account
  And preencho o formulário de registro e clico no botão Register
  Then o sistema realiza o cadastro com sucesso
  And opto por selecionar o menu "Dresses" -> "summer dresses"
  And clico em signout

@CriarUmaContaESelecionarCasualDresses @teste @TodosOs7Cenarios @CriarUmaConta
Scenario: Acessar a home do ecommerce clicar em signin e criar um conta
  When clicar em signin
  And preencher Email address e clico no botão Create an account
  And preencho o formulário de registro e clico no botão Register
  Then o sistema realiza o cadastro com sucesso
  And opto por selecionar o menu "Dresses" -> "Casual Dresses"
  And clico em signout
  
@CriarUmaContaESelecionarEveningDresses @teste @TodosOs7Cenarios @CriarUmaConta
Scenario: Acessar a home do ecommerce clicar em signin e criar um conta
  When clicar em signin
  And preencher Email address e clico no botão Create an account
  And preencho o formulário de registro e clico no botão Register
  Then o sistema realiza o cadastro com sucesso
  And opto por selecionar o menu "Dresses" -> "evening dresses"
  And clico em signout
  
