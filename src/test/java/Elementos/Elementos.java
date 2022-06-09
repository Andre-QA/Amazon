package Elementos;

import org.openqa.selenium.By;

public class Elementos {
	
	
	private By pesquisa = By.id("twotabsearchtextbox");
	private By lupa = By.id("nav-search-submit-button");
	private By furadeira = By.xpath("//span[text()='Parafusadeira e furadeira Bosch GSR 7-14 E 400W 127V com cabo de 4m']");
	private By comprar = By.id("buy-now-button");
	private By criarconta = By.id("createAccountSubmit");
	private By nome = By.id("ap_customer_name");
	private By email = By.id("ap_email");
	private By senha = By.id("ap_password");
	private By confsenha = By.id("ap_password_check");
	private By continuar = By.id("continue");
	
	
	
	
	

	





	public By getLupa() {
		return lupa;
	}












	public By getFuradeira() {
		return furadeira;
	}












	public By getComprar() {
		return comprar;
	}












	public By getCriarconta() {
		return criarconta;
	}












	public By getNome() {
		return nome;
	}












	public By getEmail() {
		return email;
	}












	public By getSenha() {
		return senha;
	}












	public By getConfsenha() {
		return confsenha;
	}












	public By getContinuar() {
		return continuar;
	}












	public By getPesquisa() {
		return pesquisa;
	}
	

}
