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
	
	private Notificacion[] bandeja = new Notificacion[5];
	private int contador = 0;
	
	public GestionNotificaciones() {
		super();
	}
	public GestionNotificaciones(Notificacion[] bandeja, int contador) {
		super();
		this.bandeja = bandeja;
		this.contador = contador;
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
	    if (contador < bandeja.length) {
	        bandeja[contador] = n;
	        contador++;
	        System.out.println("Notificacion agregada correctamente.");
	    } else {
	        System.out.println("Bandeja llena, no se ha podido agregar la notificacion.");
	    }
	}
	
	public void dispararTodo() {
		for (int i = 0; i < contador; i++) {
			bandeja[i].enviar();
			// opcional (no lo pide el enunciado):
			bandeja[i].mostrarLog();
		}
	}
	
	public void cancelar(int indice) throws IndiceInvalidoException {
		if (indice < 0 || indice >= contador) {
			throw new IndiceInvalidoException(IndiceInvalidoException.INDICE_INCORRECTO);
			// System.out.println("Indice no valido.");
		} else {
			for (int i = indice; i < contador - 1; i++) {
				bandeja[i] = bandeja[i + 1];
			}
		}
		bandeja[contador - 1] = null;
		contador--;
		System.out.println("Notificacion cancelada correctamente.");
	}
	
}