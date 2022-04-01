
Feature: Clicar no botão More aumentar o produto tamanho M verde 2 vezes adicionar ao carrinho proceder e ver se é 51.20

Background:
  Given que eu acesso o site automation pratice

@escolherProdutoValidarValor @teste @TodosOs7Cenarios
Scenario: Colocar o produto no carrinho e verificar o valor
  When opto por escolher o produto "Printed Chiffon Dress" -> "More"
  And opto por aumentar a quantidade do produto duas vezes resultando em três
  And seleciono o tamanho M no combobox Size
  And opto por clicar na cor "verde"
  And opto por clicar no botão Add to cart para adicionar ao carrinho
  And opto por clicar em Proceed to checkout
  Then Verifico se o total da compra é de "$51.20"

