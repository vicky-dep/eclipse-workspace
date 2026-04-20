package ejercicio05;

import java.util.ArrayList;

public class Club {

	/*
	 * Dado el fichero ejercicio5.json, implementar la clase Club, la clase Club tendrá sólo un ArrayList<> como atributo  
	 * y leer el fichero para rellenar los datos de la clase.
	 */
	
	private ArrayList<Atleta> deportistas = new ArrayList<Atleta>();

	public Club() {
		super();
	}
	public Club(ArrayList<Atleta> deportistas) {
		super();
		this.deportistas = deportistas;
	}
	
	public ArrayList<Atleta> getDeportistas() {
		return deportistas;
	}
	public void setDeportistas(ArrayList<Atleta> deportistas) {
		this.deportistas = deportistas;
	}
	
	@Override
	public String toString() {
		return "Club [deportistas=" + deportistas + "]";
	}
	
}