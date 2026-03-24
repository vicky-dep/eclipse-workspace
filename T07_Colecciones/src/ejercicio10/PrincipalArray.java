package ejercicio10;

import java.util.Arrays;
import java.util.HashMap;

import ejercicio010203.Gato;

public class PrincipalArray {
	
	public static void main(String[] args) {

		Gato g1 = new Gato("Tom", "blanco", "angora");
		Gato g2 = new Gato("Bolita", "blanco", "comun");
		Gato g3 = new Gato("Toby", "manchas", "egipcio");
		Gato g4 = new Gato("Lila", "negro", "persa");
		Gato g5 = new Gato("Bella", "blanco", "persa");
		Gato g6 = new Gato("Brutus", "negro", "egipcio");
		Gato g7 = new Gato("Tommy", "marron", "egipcio");
		Gato g8 = new Gato("Pulguita", "negro", "persa");
		Gato g9 = new Gato("Carbon", "negro", "comun");
		Gato g10 = new Gato("Lilly", "marron", "persa");
		
		Gato[] gatos = {g1, g2, g3, g4, g5, g6, g7, g8, g9, g10};
		
		HashMap<String, Gato[]> mapaGatos = new HashMap<String, Gato[]>();
		//Recorrer el array gatos
		for (int i = 0; i < gatos.length; i++) {
			Gato g=gatos[i];
			//Obtenemos la raza
			String raza=g.getRaza();
			if(mapaGatos.containsKey(raza)) {
				//Si esa raza está ya almacenada en el mapa, se añade el gato
				Gato[] arrayGatos = mapaGatos.get(raza);
				//Redimensionamos el array para añadir el nuevo gato
				Gato[] aux=Arrays.copyOf(arrayGatos, arrayGatos.length+1);
				aux[aux.length-1]=g;
				mapaGatos.put(raza, aux);
			}else {
				//Si la raza no está en el mapa
				Gato[] arrayG= {g};
				mapaGatos.put(raza, arrayG);
			}
		}
	}
}