
Feature: Verificar o produto com Desconto de 20 %

Background:
  Given que eu acesso o site automation pratice

@VerificarDescontoDoProduto @TodosOs7Cenarios
Scenario: Acessar a home do ecommerce clicar em signin e criar um conta
  And opto por selecionar o menu "Dresses" -> "summer dresses"
  When opto por clicar no modo de exibição em lista
  And verificar se o produto da terceira linha tem um desconto de vinte por cento