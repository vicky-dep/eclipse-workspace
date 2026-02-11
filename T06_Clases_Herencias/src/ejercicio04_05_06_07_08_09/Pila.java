package ejercicio04_05_06_07_08_09;

public class Pila extends Lista {
	// Una pila tanto inserta como elimina de la ultima posicion

	@Override
	public void insertarAlprincipio(int num) {
		System.out.println("Operacion no permitida");
	}

	@Override
	public void insertarEnPosicion(int pos, int numero) {
		System.out.println("Operacion no permitida");
	}

	@Override
	public void eliminarPosicion(int pos) {
		// una pila siempre elimina la ultima posicion
		super.eliminarPosicion(super.getLista().length-1);
	}
	
}