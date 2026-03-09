package repasoHerencia02;

import java.util.Arrays;

public class GestionNotificaciones {
	/* 
	 * Por último estos mensajes los gestiona una centralita, para ello tenemos una clase GestionNotificaciones
	 * Esta clase debe gestionar el envío masivo sin dejar huecos en el array.
	 * Atributos: private Notificacion[] bandeja = new Notificacion[5];
	 * private int contador = 0;
	 * Métodos
	 * agregar(Notificacion n): Lo guarda en la posición contador y suma 1.
	 * dispararTodo(): Recorre el array hasta contador y ejecuta el método enviar() de cada objeto. 
	 * cancelar(int indice): Elimina la notificación en ese índice. Mueve los elementos siguientes hacia la 
	 * izquierda para que no quede un null en medio. Resta 1 al contador.
	 */
	
	// los arrays y los metodos operan sobre la clase padre
	// a no ser que pida el ejercicio que se opere con una clase hija
	private Notificacion[] bandeja = new Notificacion[5];
	private int contador = 0;
	
	public GestionNotificaciones() {
		super();
	}
	// no hace falta constructor con contador
	public GestionNotificaciones(Notificacion[] bandeja) {
		super();
		this.bandeja = bandeja;
	}
	
	public Notificacion[] getBandeja() {
		return bandeja;
	}
	public void setBandeja(Notificacion[] bandeja) {
		this.bandeja = bandeja;
	}
	public int getContador() {
		return contador;
	}
	public void setContador(int contador) {
		this.contador = contador;
	}
	
	@Override
	public String toString() {
		return "GestionNotificaciones [bandeja=" + Arrays.toString(bandeja) + ", contador=" + contador + "]";
	}

	public void agregar(Notificacion n) {
		if (contador >=5) {
			System.out.println("No se pueden añadir mas notificaciones");
			// aqui se agregaria la otra excepcion... y luego en el main, try catch por cada vez que llamas a agregar...
		} else {
			bandeja[contador] = n;
			contador++;
			System.out.println("Notificacion agregada correctamente.");			
		}
		
		/* mi version:
	    if (contador < bandeja.length) {
	        bandeja[contador] = n;
	        contador++;
	        System.out.println("Notificacion agregada correctamente.");
	    } else {
	        System.out.println("Bandeja llena, no se ha podido agregar la notificacion.");
	    }*/
	}
	
	public void dispararTodo() {
		for (int i = 0; i < contador; i++) { // con esto se recorre el array evitando los nulos
			bandeja[i].enviar();
		}
		
		/* otra forma: (importante comprobar que NO sea nulo para que no lance excepcion)
		for (int i = 0; i < bandeja.length; i++) {
			if (bandeja[i] != null) {
				bandeja[i].enviar();
			}
		}*/
		
		/* mi version:
		for (int i = 0; i < contador; i++) {
			bandeja[i].enviar();
			// opcional (no lo pide el enunciado):
			bandeja[i].mostrarLog();
		}*/
	}
	
	public void cancelar(int indice) throws IndiceInvalidoException {
		Notificacion[] aux = new Notificacion[5];
		int contAux = 0;
		if (indice >= 0 && indice < bandeja.length) {
			for (int i = 0; i < bandeja.length; i++) {
				Notificacion notificacion = bandeja[i];
				if (i != indice) {
					aux[contAux] = notificacion;
					contAux++;
				}
			}
			bandeja = aux;
			contador--;
			System.out.println("Notificacion cancelada.");
		} else {
			System.out.println("El indice supera la longitud del array.");
			throw new IndiceInvalidoException(IndiceInvalidoException.INDICE_INCORRECTO);
		}
		
		//mi version:
		//if (indice < 0 || indice >= contador) {
			//throw new IndiceInvalidoException(IndiceInvalidoException.INDICE_INCORRECTO);
			// System.out.println("Indice no valido.");
		//} else {
			//for (int i = indice; i < contador - 1; i++) {
				//bandeja[i] = bandeja[i + 1];
			//}
		//}
		//bandeja[contador - 1] = null;
		//contador--;
		//System.out.println("Notificacion cancelada correctamente.");
	}
	
}