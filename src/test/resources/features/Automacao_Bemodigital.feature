#encoding: iso-8859-1
################################################
########## scenarios Teste renner ################
################################################
@Automacao_TodosCen�rios
Feature: automationpractice

  @Automacao_TesteI
  Scenario Outline: Etapa II - Automa��o de Teste Web I
    Given Acessar Site Busca CEP Correrio <site>
    When Realizar a busca com o valor Lojas Bemol <CEP> <Loja>
    Then Finalizo a busca

    Examples: 
      |site			|     CEP	  |    Loja		  |
    	|"Correio"|"69005-040"|"Lojas Bemol"|
    	
 @Automacao_TesteII
  Scenario Outline: Etapa III - Automa��o de Teste Web II
    Given Acessar o site Trivago <site>
    When Digitar o valor Manaus no campo de busca <Cidade>
    Then Clicar no bot�o Pesquisar Selecionar a op��o Ordenar por Avalia��o e Sugest�es
    And Verifique o nome do primeiro da lista
    And Verifique a avalia��o do primeiro da lista
    And Verifique o valor do primeiro da lista

    Examples: 
    |site |Cidade|
    |"Trivago"|"Manaus"|
