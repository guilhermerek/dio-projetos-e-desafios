package phone;

public class AparelhoTelefonico implements AparelhoTelefonicoInterface{

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
}
