package main;

import iPhone.IPhone;

public class Main {
	public static void main(String[] args) {
		
		IPhone iphone = new IPhone();
		
		iphone.adicionarNovaAba();
		iphone.exibirPagina("https://duckduckgo.com/");
		iphone.selecionarMusica("Gallowdance");
		iphone.ligar("1001-1001");
	}
}
