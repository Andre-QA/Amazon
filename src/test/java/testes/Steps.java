package testes;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Browser;
import pages.Pages;

public class Steps {
	
	Browser browser = new Browser();
	Pages pages = new Pages();
	
	@Given("que eu esteja no site {string}")
	public void que_eu_esteja_no_site(String string) {
		browser.abrirNavegador(string);
	  
	}

	@Given("clicar em abrir nova conta")
	public void clicar_em_abrir_nova_conta() {
		pages.abrirConta();

	  
	}

	@Given("clicar em abrir conta")
	public void clicar_em_abrir_conta() {
	 
	}

	@When("preencher os campos obrigatorios")
	public void preencher_os_campos_obrigatorios() {
	  
	}

	@When("clicar em quero ser cliente")
	public void clicar_em_quero_ser_cliente() {
	   
	}

	@Then("validara a tela de qrcode")
	public void validara_a_tela_de_qrcode() {
	    
	}

}
