package ejercicio3;

import java.util.Arrays;

public class MiembroEquipo {

	// Atributos
	private String nombre;
	private String apellidos;
	private int codigoLicencia; // identificador único 
	private String[] test = new String[3]; // "eficiente" o "deficiente"
	private int aniosExperiencia;
	private double presupuesto;

	// Constructor
	public MiembroEquipo() {
		super();
	}
	public MiembroEquipo(String nombre, String apellidos, int codigoLicencia, int aniosExperiencia,
			double presupuesto) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.codigoLicencia = codigoLicencia;
		this.aniosExperiencia = aniosExperiencia;
		this.presupuesto = presupuesto;
	}
	public MiembroEquipo(String nombre, String apellidos, int codigoLicencia, String[] test, int aniosExperiencia,
			double presupuesto) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.codigoLicencia = codigoLicencia;
		this.test = test;
		this.aniosExperiencia = aniosExperiencia;
		this.presupuesto = presupuesto;
	}

	// Getters & Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getCodigoLicencia() {
		return codigoLicencia;
	}
	public void setCodigoLicencia(int codigoLicencia) {
		this.codigoLicencia = codigoLicencia;
	}
	public String[] getTest() {
		return test;
	}
	public void setTest(String[] test) {
		this.test = test;
	}
	public int getAniosExperiencia() {
		return aniosExperiencia;
	}
	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}
	public double getPresupuesto() {
		return presupuesto;
	}
	public void setPresupuesto(double presupuesto) {
		this.presupuesto = presupuesto;
	}
	
	@Override
	public String toString() {
		return "MiembroEquipo [nombre=" + nombre + ", apellidos=" + apellidos + ", codigoLicencia=" + codigoLicencia
				+ ", test=" + Arrays.toString(test) + ", aniosExperiencia=" + aniosExperiencia + ", presupuesto="
				+ presupuesto + "]";
	}
	
	// Metodos de la clase
	public void aumentarExperiencia() {
		aniosExperiencia+=1;
		System.out.println("Experiencia aumentada correctamente.");
	}
	
	public void incrementarPresupuesto(double cantidad) {
		if (cantidad < 0) {
			System.out.println("No puedes aumentar una cantidad negativa.");
		} else {
			presupuesto += cantidad;
			System.out.println("Cantidad aumentada correctamente.");
		}
	}
	
	// Devolverá "true" si los últimos 3 test han sido "deficiente"
	public boolean rendimientoBajo() {
		boolean resultado = false;
		if (test[0] != null && test[0].equalsIgnoreCase("deficiente") && 
			test[1] != null && test[1].equalsIgnoreCase("deficiente") && 
			test[2] != null && test[2].equalsIgnoreCase("deficiente")) {
			resultado = true;
		} 
		return resultado;
	}
	
	// Como se desplazan los antiguos, el nuevo resultado se guarda en la ultima posición del array 
	public void registrarTest(String resultado) {
		for (int i = 0; i < test.length -1; i++) {
			test[i] = test[i+1];
		}
		test[2] = resultado;
		System.out.println("Test registrado correctamente.");
	}
	
	// Metodo auxiliar (lo utilizaré en una de sus clases hijas)
	// Devolverá "true" si los últimos 3 test han sido "eficiente"
	public boolean rendimientoAlto() {
		boolean resultado = false;
		if (test[0] != null && test[0].equalsIgnoreCase("eficiente") && 
			test[1] != null && test[1].equalsIgnoreCase("eficiente") && 
			test[2] != null && test[2].equalsIgnoreCase("eficiente")) {
			resultado = true;
		} 
		return resultado;
	}
	
}