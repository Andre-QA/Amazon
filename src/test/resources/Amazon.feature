#Author: Andre QA


Feature: Abertura de conta banco original
  Eu como usuario quero abrir uma nova conta no banco original


  Scenario: Abertura de conta pessoa fisica
    Given que eu esteja no site "https:www.amazon.com.br"
    And clicar em abrir nova conta 
    And clicar em abrir conta
    When preencher os campos obrigatorios
    And clicar em quero ser cliente
    Then validara a tela de qrcode
    

  
  
    