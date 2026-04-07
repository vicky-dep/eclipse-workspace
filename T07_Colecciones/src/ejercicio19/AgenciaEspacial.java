package ejercicio19;

import java.util.List;
import java.util.Set;

public class AgenciaEspacial implements GestionAgenciaInterfaz {
	
	/*
	 * Esta clase debe contener una colección (puedes usar un ArrayList<Nave> o un HashSet<Nave>) e implementar GestionAgencia.
	 * 
	 * Métodos a implementar:
	 * void registrarNave(Nave n): Agrega una nave a la colección. Importante: No se deben permitir naves con el mismo codigoNave. 
	 * Asegúrate de implementar equals y hashCode en la clase Nave.
	 * void retirarNave(String codigoNave): Elimina la nave del sistema usando su código identificador. 
	 * Usa un Iterator para evitar errores durante el borrado.
	 * List<Nave> filtrarPorTipoSonda(): Implementación del método de la interfaz. 
	 * Debe devolver una lista con las naves que pertenezcan a la clase Sonda.
	 * List<Nave> obtenerNavesOrdenadasPorConsumo(): Devuelve una lista de las naves ordenadas de menor a mayor consumo. 
	 * Para esto deberás crear un Comparator externo.
	 */

	@Override
	public List<Nave> filtrarPorTipo(String tipo) {
		
		return null;
	}

	@Override
	public Set<String> obtenerCodigosUnicos() {
		
		return null;
	}
	
	
}