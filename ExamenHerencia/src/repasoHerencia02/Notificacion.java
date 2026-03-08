package repasoHerencia02;

public abstract class Notificacion {
	/*
	 * Se necesita implementar una aplicación que envíe mensajes. 
	 * Disponemos de una clase padre llamada Notificacion con los siguientes datos:
	 * Atributos: String remitente y String mensaje.
	 * Métodos: 
	 * void enviar(); Será responsabilidad de las hijas implementarlo
	 * public void mostrarLog() que imprima: "Registro: Enviado por [remitente]".
	 * Además disponemos de dos clases hijas: email y sms.
	 */
	
	private String remitente;
	private String mensaje;

	public Notificacion() {
		super();
	}
	public Notificacion(String remitente, String mensaje) {
		super();
		this.remitente = remitente;
		this.mensaje = mensaje;
	}
	
	public String getRemitente() {
		return remitente;
	}
	public void setRemitente(String remitente) {
		this.remitente = remitente;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	@Override
	public String toString() {
		return "Notificacion [remitente=" + remitente + ", mensaje=" + mensaje + "]";
	}
	
	public abstract void enviar();
	
	public void mostrarLog() {
		System.out.println("Registro: Enviado por " + remitente);
	}
	
}