package pages;

import Elementos.Elementos;

public class Pages {
	
	Metodos metodo = new Metodos();
	Elementos el = new Elementos();
	
	
	public void abrirConta() {
		metodo.escrever("furadeira", el.getPesquisa());
		metodo.clicar(el.getLupa());
		metodo.clicar(el.getFuradeira());
		metodo.clicar(el.getComprar());
		metodo.clicar(el.getCriarconta());
		metodo.escrever("Jose Ferreira de Almeida", el.getNome());
		metodo.escrever("autonomo.1425@gmail.com.br", el.getEmail());
		metodo.escrever("Sara@0911", el.getSenha());
		metodo.escrever("Sara@0911", el.getConfsenha());
		metodo.clicar(el.getContinuar());
		
	}


}
