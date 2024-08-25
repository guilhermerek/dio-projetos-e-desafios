package player;

public class ReprodutorMusica implements ReprodutorMusicaInterface{
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
}
