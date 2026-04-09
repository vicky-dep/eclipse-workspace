package examenesAnteriores03;

public class Ciudad {
	/*
	 * agregamos esta clase al ejercicio para probar que pasaria en vez de un array list dentro de otro, que dentro tenga un objeto
	 */
	
	private String nombre;
	private int habitantes;

	public Ciudad() {
		super();
	}
	public Ciudad(String nombre, int habitantes) {
		super();
		this.nombre = nombre;
		this.habitantes = habitantes;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getHabitantes() {
		return habitantes;
	}
	public void setHabitantes(int habitantes) {
		this.habitantes = habitantes;
	}
	
	@Override
	public String toString() {
		return "Ciudad [nombre=" + nombre + ", habitantes=" + habitantes + "]";
	}
	
}