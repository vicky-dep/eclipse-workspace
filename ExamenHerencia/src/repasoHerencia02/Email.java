package repasoHerencia02;

public class Email extends Notificacion {
	/*
	 * Clase Email:
	 * Atributo: String direccionCorreo.
	 * Método enviar(): Imprime "Enviando Email a [direccion]: [mensaje]".
	 */
	
	private String direccionCorreo;

	public Email() {
		super();
	}
	public Email(String direccionCorreo) {
		super();
		this.direccionCorreo = direccionCorreo;
	}
	public Email(String remitente, String mensaje, String direccionCorreo) {
		super(remitente, mensaje);
		this.direccionCorreo = direccionCorreo;
	}
	
	public String getDireccionCorreo() {
		return direccionCorreo;
	}
	public void setDireccionCorreo(String direccionCorreo) {
		this.direccionCorreo = direccionCorreo;
	}
	
	@Override
	public String toString() {
		return  "Email [direccionCorreo=" + direccionCorreo + "]" + super.toString();
	}
	
	@Override
	public void enviar() {
		System.out.println("Enviando Email a " + direccionCorreo + ": " + getMensaje());
	}

}