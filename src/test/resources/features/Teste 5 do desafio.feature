
Feature: Clicar no botão More aumentar o produto tamanho M verde 5 vezes adicionar ao carrinho proceder e atualizar as informações do usuário, preencher o campo “Home
Phone”


Background:
  Given que eu acesso o site automation pratice

@TermosFormaPgtoCpmpleto @teste @TodosOs7Cenarios
Scenario: Colocar o produto no carrinho e verificar o valor
  When opto por escolher o produto "Printed Chiffon Dress" -> "More"
  And opto por aumentar a quantidade do produto em cinco vezes resultando em três
  And seleciono o tamanho M no combobox Size
  And opto por clicar na cor "verde"
  And opto por clicar no botão Add to cart para adicionar ao carrinho
  And opto por clicar em Proceed to checkout
  And Verifico se o total da compra é de "$84.00"
  And clicar 1 vez Proceed to botão checkout
  And preencher Email address e clico no botão Create an account
  And preencho o formulário de registro e clico no botão Register
  And o sistema realiza o cadastro com sucesso e sugere a confirmação do endereço de entrega
  And preencho o campo Home Phone limpo o campo Mobile Phone e preencho com novo número e salvo
  And clicar em Proceed to checkout
  And opto por marcar o checkbox para aceitar os termos de serviço
  And opto por clicar no botão para escolher o pagamento com cartão como forma de compra
  And opto por Clicar no botão "I confirm my order" para confirmar o pagamento
  Then valido o texto "Your order on My Store is complete"
  And  valido se o carrinho apresenta a mensagem "Your shopping cart is empty."
  And clico em signout
 
 