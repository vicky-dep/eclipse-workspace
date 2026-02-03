package ejercicio04_05_06_07_08;

public class Cola extends Lista {
	// Cola: los elementos se insertan siempre al final y se van a sacar de esa cola por el elemento 0

	// sobreescribimos los metodos que no se pueden utilizar
	@Override
	public void insertarAlprincipio(int num) {
		System.out.println("Una cola no permite la insercion al principio");
	}
	@Override
	public void insertarEnPosicion(int pos, int numero) {
		System.out.println("Operacion no permitida");
	}
	// este tambien lo sobreescribimos para que saque siempre al principio
	@Override
	public void eliminarPosicion(int pos) {
		super.eliminarPosicion(0);
	}
	
	
	
}