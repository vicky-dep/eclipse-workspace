package ejercicio19;

import java.util.List;
import java.util.Set;

public interface GestionAgenciaInterfaz {

	/*
	 * Implementa una interfaz con los siguientes métodos:
	 * Set/List<Nave> filtrarPorTipo(String  tipo): Retorna una sublista con las naves de la categoría específica.
	 * Set/List<String> obtenerCodigosUnicos(): Devuelve un conjunto con todos los códigos de las naves registradas.
	 */
	
	List<Nave> filtrarPorTipo(String  tipo);
	Set<String> obtenerCodigosUnicos();
	
}