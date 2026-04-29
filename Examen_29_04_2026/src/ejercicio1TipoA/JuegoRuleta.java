package ejercicio1TipoA;

import java.util.ArrayList;

public class JuegoRuleta {

	// Atributos
	private String nombreConcurso;
	ArrayList<Paneles> listaPaneles = new ArrayList<Paneles>();

	// Constructor
	public JuegoRuleta() {
		super();
	}
	public JuegoRuleta(String nombreConcurso, ArrayList<Paneles> listaPaneles) {
		super();
		this.nombreConcurso = nombreConcurso;
		this.listaPaneles = listaPaneles;
	}
	
	// Getters & Setters
	public String getNombreConcurso() {
		return nombreConcurso;
	}
	public void setNombreConcurso(String nombreConcurso) {
		this.nombreConcurso = nombreConcurso;
	}
	public ArrayList<Paneles> getListaPaneles() {
		return listaPaneles;
	}
	public void setListaPaneles(ArrayList<Paneles> listaPaneles) {
		this.listaPaneles = listaPaneles;
	}
	@Override
	public String toString() {
		return "JuegoRuleta [nombreConcurso=" + nombreConcurso + ", listaPaneles=" + listaPaneles + "]";
	}	
	
}