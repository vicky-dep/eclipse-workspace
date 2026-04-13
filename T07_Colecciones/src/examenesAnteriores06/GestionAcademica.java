package examenesAnteriores06;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class GestionAcademica {
	/*
	 * Se requiere implementar un sistema de gestión de estudiantes donde cada curso académico tenga un 
	 * conjunto de estudiantes almacenados en un array [ ].
	 * Para ello, se usará un Mapa donde:
	 * Clave (String): Representa el curso académico (ejemplo: "2023-2024", "2024-2025").
	 * Valor ([]): Un array que almacena los estudiantes de ese curso. 
	 * El array es dinámico, lo que significa que se tiene que ir redimensionando.
	 */
	
	Map<String, Estudiante[]> mapa = new HashMap<String, Estudiante[]>();
	
	public GestionAcademica() {
		super();
	}
	public GestionAcademica(Map<String, Estudiante[]> mapa) {
		super();
		this.mapa = mapa;
	}

	public Map<String, Estudiante[]> getMapa() {
		return mapa;
	}
	public void setMapa(Map<String, Estudiante[]> mapa) {
		this.mapa = mapa;
	}
	
	@Override
	public String toString() {
		return "GestionAcademica [mapa=" + mapa + "]";
	}
	
	// Si el curso no existe, se creará y se añadirá al mapa.
	// Si el curso ya existe, añade el estudiante redimensionando el array
	// Hay que validar que no haya estudiantes duplicados en un mismo curso (basado en el DNI).
	public void agregarEstudiante(String curso, Estudiante estudiante) {
		Set<String> claves = mapa.keySet();
		if (claves.contains(curso)) {
			Iterator<String> it = claves.iterator();
			while (it.hasNext()) {
				String clave = (String) it.next();
				if (clave.equalsIgnoreCase(curso)) {
					Estudiante[] arrayE = mapa.get(clave); 
					Estudiante[] copy = Arrays.copyOf(arrayE, arrayE.length+1);
					copy[copy.length-1] = estudiante;
					mapa.put(clave, copy);
				}
			}
		} else {
			Estudiante[] nuevoArrayE = {estudiante};
			mapa.put(curso, nuevoArrayE);
		}
	}
}