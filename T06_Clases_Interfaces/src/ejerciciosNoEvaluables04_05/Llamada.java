package ejerciciosNoEvaluables04_05;

import java.util.Arrays;

// Orden natural por telefono y sino por fecha(comparable)
public class Llamada implements LlamadaInterfaz, Comparable<Llamada> {

	/*
	 * En una compañía de telecomunicaciones se desean registrar los datos de todas las llamadas de sus clientes. 
	 * Implementar la clase Llamada, que guardará los siguientes datos: número de teléfono del cliente, número 
	 * del interlocutor, atributo booleano que indique si la llamada es saliente, fecha y hora del inicio de la 
	 * llamada y del fin, atributo enumerado o String que indique la zona del interlocutor (suponer cinco zonas 
	 * con tarifas distintas) y tabla de constantes con las tarifas de las zonas en céntimos de euro/minuto. 
	 * En la clase se establecerá un orden natural compuesto basado en el número del teléfono del cliente como 
	 * primer criterio y en la fecha y hora de inicio como segundo criterio. Asimismo, se implementará un método 
	 * que devuelva la duración en minutos de la llamada y otro que calcule su coste, si es saliente. 
	 * Por último, implementar el método toString(), que muestre los dos números de teléfono, la fecha y hora del 
	 * inicio, la duración y el coste.
	 */

	private int telefonoCliente;
	private int telefonoInterlocutor;
	private boolean esSaliente;
	private int fechaHoraInicio; // yyyymmddHH
	private int fechaHoraFin;
	private String[] zonas = {"Zona 1", "Zona 2", "Zona 3", "Zona 4", "Zona 5"}; // 5 zonas con distintas tarifas
	private float[] tarifas = {10, 2.5f, 3, 1.2f, 5};
	
	public Llamada() {
		super();
	}
	
	public Llamada(int telefonoCliente, int telefonoInterlocutor, boolean esSaliente, int fechaHoraInicio,
			int fechaHoraFin, String[] zonas, float[] tarifas) {
		super();
		this.telefonoCliente = telefonoCliente;
		this.telefonoInterlocutor = telefonoInterlocutor;
		this.esSaliente = esSaliente;
		this.fechaHoraInicio = fechaHoraInicio;
		this.fechaHoraFin = fechaHoraFin;
		this.zonas = zonas;
		this.tarifas = tarifas;
	}

	public Llamada(int telefonoCliente, int telefonoInterlocutor, boolean esSaliente, int fechaHoraInicio,
			int fechaHoraFin) {
		super();
		this.telefonoCliente = telefonoCliente;
		this.telefonoInterlocutor = telefonoInterlocutor;
		this.esSaliente = esSaliente;
		this.fechaHoraInicio = fechaHoraInicio;
		this.fechaHoraFin = fechaHoraFin;
	}
	
	public int getTelefonoCliente() {
		return telefonoCliente;
	}
	public void setTelefonoCliente(int telefonoCliente) {
		this.telefonoCliente = telefonoCliente;
	}
	public int getTelefonoInterlocutor() {
		return telefonoInterlocutor;
	}
	public void setTelefonoInterlocutor(int telefonoInterlocutor) {
		this.telefonoInterlocutor = telefonoInterlocutor;
	}
	public boolean isEsSaliente() {
		return esSaliente;
	}
	public void setEsSaliente(boolean esSaliente) {
		this.esSaliente = esSaliente;
	}
	public int getFechaHoraInicio() {
		return fechaHoraInicio;
	}
	public void setFechaHoraInicio(int fechaHoraInicio) {
		this.fechaHoraInicio = fechaHoraInicio;
	}
	public int getFechaHoraFin() {
		return fechaHoraFin;
	}
	public void setFechaHoraFin(int fechaHoraFin) {
		this.fechaHoraFin = fechaHoraFin;
	}
	public String[] getZonas() {
		return zonas;
	}

	public void setZonas(String[] zonas) {
		this.zonas = zonas;
	}
	public float[] getTarifas() {
		return tarifas;
	}
	public void setTarifas(float[] tarifas) {
		this.tarifas = tarifas;
	}
	@Override
	public String toString() {
		return "Llamada [telefonoCliente=" + telefonoCliente + ", telefonoInterlocutor=" + telefonoInterlocutor
				+ ", esSaliente=" + esSaliente + ", fechaHoraInicio=" + fechaHoraInicio + ", fechaHoraFin="
				+ fechaHoraFin + ", zonas=" + Arrays.toString(zonas) + ", tarifas=" + Arrays.toString(tarifas) + "]";
	}

	@Override
	public int duracionLLamada() {
		// suponiendo que la llamada se hace en el mismo dia
		return (fechaHoraFin - fechaHoraInicio) * 60;
	}

	@Override
	public float calcularCoste(String zona) {
		float coste = 0;
		if(zona.equals("Zona 1")) {
			coste = tarifas[0] * duracionLLamada();
		} else if (zona.equals("Zona 2")) {
			coste = tarifas[1] * duracionLLamada();
		} else if (zona.equals("Zona 3")) {
			coste = tarifas[2] * duracionLLamada();
		} else if (zona.equals("Zona 4")) {
			coste = tarifas[3] * duracionLLamada();
		} else if (zona.equals("Zona 5")) {
			coste = tarifas[4] * duracionLLamada();
		}
		return coste;
	}

	@Override
	public int compareTo(Llamada arg0) {
		// negativo si el primer argumento < ... 0 si son iguales o positivo si argumento > ...
		
		// si es con numeros la comparacion, se utiliza la resta:
		if(telefonoCliente - arg0.telefonoCliente == 0) {
			// Comparamos por fecha de inicio
			return fechaHoraInicio - arg0.fechaHoraInicio;
		}
		return telefonoCliente - arg0.telefonoCliente;
	}
	
}