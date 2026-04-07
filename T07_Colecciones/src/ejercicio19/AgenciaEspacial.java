package ejercicio19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
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
	
	private ArrayList<Nave> naves = new ArrayList<>();
	
	public AgenciaEspacial() {
		super();
	}
	public AgenciaEspacial(ArrayList<Nave> naves) {
		super();
		this.naves = naves;
	}

	public ArrayList<Nave> getNaves() {
		return naves;
	}
	public void setNaves(ArrayList<Nave> naves) {
		this.naves = naves;
	}
	
	public void registrarNave(Nave n) {
        if (!naves.contains(n)) {
            naves.add(n);
            System.out.println("Nave registrada correctamente.");
        } else {
            System.out.println("No se puede registrar, ya existe una nave con ese código.");
        }
	}
	
	public void retirarNave(String codigoNave) {
		boolean encontrada = false;
		Iterator<Nave> it = naves.iterator();
	    while (it.hasNext() && !encontrada) {
	    	Nave nave = it.next();
	        if (nave.getCodigoNave().equalsIgnoreCase(codigoNave)) {
	        	it.remove();
	            encontrada = true;
	            System.out.println("Nave retirada correctamente.");
	        }
	    }
	    if (!encontrada) {
	    	System.out.println("No existe ninguna nave con ese código.");
	    }
	}
	
	public List<Nave> obtenerNavesOrdenadasPorConsumo() {
        List<Nave> copia = new ArrayList<>(naves);
        Collections.sort(copia, new ComparadorConsumoNave());
        return copia;
	}

	@Override
	public List<Nave> filtrarPorTipo(String tipo) {
        List<Nave> listaFiltrada = new ArrayList<>();
        for (int i = 0; i < naves.size(); i++) {
            if (tipo.equalsIgnoreCase("sonda") && naves.get(i) instanceof Sonda) {
                listaFiltrada.add(naves.get(i));
            } else if (tipo.equalsIgnoreCase("carguero") && naves.get(i) instanceof Carguero) {
                listaFiltrada.add(naves.get(i));
            } else if (tipo.equalsIgnoreCase("transportepersonal") && naves.get(i) instanceof TransportePersonal) {
                listaFiltrada.add(naves.get(i));
            }
        }
        return listaFiltrada;
    }
	/*
	 * Si fuese solo filtrar por tipoSonda:
	 * 
	 public List<Nave> filtrarPorTipoSonda() {
     	List<Nave> listaSondas = new ArrayList<>();
        for (int i = 0; i < naves.size(); i++) {
            if (naves.get(i) instanceof Sonda) {
                listaSondas.add(naves.get(i));
            }
        }
        return listaSondas;
    }
	*/

	@Override
	public Set<String> obtenerCodigosUnicos() {
        Set<String> codigos = new HashSet<>();
        for (int i = 0; i < naves.size(); i++) {
            codigos.add(naves.get(i).getCodigoNave());
        }
        return codigos;
	}
	
}