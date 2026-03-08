package repasoHerencia02;

public class Sms extends Notificacion {
	/*
	 * Clase SMS:
	 * Atributo: int numeroTelefono.
	 * Método enviar(): Imprime "Enviando SMS al [numero]: [mensaje]"
	 */
	
	private int numeroTelefono;

	public Sms() {
		super();
	}
	public Sms(int numeroTelefono) {
		super();
		this.numeroTelefono = numeroTelefono;
	}
	public Sms(String remitente, String mensaje, int numeroTelefono) {
		super(remitente, mensaje);
		this.numeroTelefono = numeroTelefono;
	}
	
	public int getNumeroTelefono() {
		return numeroTelefono;
	}
	public void setNumeroTelefono(int numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}
	
	@Override
	public String toString() {
		return "Sms [numeroTelefono=" + numeroTelefono + ", getRemitente()=" + getRemitente() + ", getMensaje()="
				+ getMensaje() + "]";
	}
	
	@Override
	public void enviar() {
		System.out.println("Enviando SMS al " + numeroTelefono + ": " + getMensaje());
	}
	
}