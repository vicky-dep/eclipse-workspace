package DAOs;

public class Empleado {

	private int numEmpleado;
	private String nombre;
	private int edad;
	private int oficina;
	private String puesto;
	private String contrato;

	public Empleado() {
		super();
	}
	public Empleado(int numEmpleado, String nombre, int edad, int oficina, String puesto, String contrato) {
		super();
		this.numEmpleado = numEmpleado;
		this.nombre = nombre;
		this.edad = edad;
		this.oficina = oficina;
		this.puesto = puesto;
		this.contrato = contrato;
	}
	
	public int getNumEmpleado() {
		return numEmpleado;
	}
	public void setNumEmpleado(int numEmpleado) {
		this.numEmpleado = numEmpleado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getOficina() {
		return oficina;
	}
	public void setOficina(int oficina) {
		this.oficina = oficina;
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	public String getContrato() {
		return contrato;
	}
	public void setContrato(String contrato) {
		this.contrato = contrato;
	}
	
	@Override
	public String toString() {
		return "Empleado [numEmpleado=" + numEmpleado + ", nombre=" + nombre + ", edad=" + edad + ", oficina=" + oficina
				+ ", puesto=" + puesto + ", contrato=" + contrato + "]";
	}
	
}