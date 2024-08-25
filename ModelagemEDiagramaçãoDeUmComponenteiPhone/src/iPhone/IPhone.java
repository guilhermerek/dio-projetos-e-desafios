package iPhone;

import internetBrowser.SafariBrowserInterface;
import phone.AparelhoTelefonicoInterface;
import player.ReprodutorMusicaInterface;



public class IPhone implements SafariBrowserInterface, AparelhoTelefonicoInterface, ReprodutorMusicaInterface {

	@Override
	public void tocar() {
		System.out.println("Tocando a música!");
	}

	public void pausar() {
		System.out.println("Pausando a música!");
	}

	public void selecionarMusica(String novaMusica) {
		trocandoMusica(novaMusica);
		System.out.println("Tocando: " + novaMusica);
	}

	private void trocandoMusica(String novaMusica) {
		System.out.println("Trocando Musica para: " + novaMusica);
	}

	@Override
	public void ligar(String numero) {
		System.out.println("Ligando para: " + numero);
	}

	public void atender() {
		System.out.println("Atendendo ligação");
	}

	public void recusar() {
		System.out.println("Recusando ligação");
	}

	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz");
	}

	@Override
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
