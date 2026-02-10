package ejercicio2;

public class Oficina {
	
	// Atributos
	private String codigoOficina;
	private int numeroEmpleados;

	// Constructor
	public Oficina() {
		super();
	}
	public Oficina(String codigoOficina, int numeroEmpleados) {
		super();
		this.codigoOficina = codigoOficina;
		this.numeroEmpleados = numeroEmpleados;
	}
	
	// Getters & Setters
	public String getCodigoOficina() {
		return codigoOficina;
	}
	public void setCodigoOficina(String codigoOficina) {
		this.codigoOficina = codigoOficina;
	}
	public int getNumeroEmpleados() {
		return numeroEmpleados;
	}
	public void setNumeroEmpleados(int numeroEmpleados) {
		this.numeroEmpleados = numeroEmpleados;
	}
	
	// toString
	@Override
	public String toString() {
		return "Oficina [codigoOficina=" + codigoOficina + ", numeroEmpleados=" + numeroEmpleados + "]";
	}
	
}