package ejerciciosTransparencia;

public class Academico implements Comparable<Academico> {

	private String nombre;
	private int anioIngreso;

	public Academico() {
		super();
	}
	public Academico(String nombre, int anioIngreso) {
		super();
		this.nombre = nombre;
		this.anioIngreso = anioIngreso;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getAnioIngreso() {
		return anioIngreso;
	}
	public void setAnioIngreso(int anioIngreso) {
		this.anioIngreso = anioIngreso;
	}
	@Override
	public String toString() {
		return "Academico [nombre=" + nombre + ", anioIngreso=" + anioIngreso + "]";
	}
	
	@Override
	public int compareTo(Academico o) {
		return nombre.compareTo(o.nombre);
	}
	
}