package internetBrowser;

public class SafariBrowser  implements SafariBrowserInterface{

	public void exibirPagina(String url) {
		System.out.println("Carregando " + url);
	}
	public void adicionarNovaAba() {
		System.out.println("Nova aba aberta!");
	}
	public void atualizarPagina() {
		System.out.println("Atualizando página!");
	}
}
