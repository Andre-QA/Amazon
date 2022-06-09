package pages;

import org.openqa.selenium.By;

public class Metodos extends Browser {
	
	public void clicar(By elemento) {
		driver.findElement(elemento).click();
		
		
		
	}
	
	public void escrever (String texto, By elemento) {
		driver.findElement(elemento).sendKeys(texto);
		
		
	}
	
	public void limpar(String texto, By elemento) {
		driver.findElement(elemento).clear();
		
		
	}

}
