package ejerciciosNoEvaluables09_10;

public interface PrestableInterfaz {
	/*
	 * Para prevenir posibles cambios en el programa se tiene que implementar una interfaz Prestable 
	 * con los métodos prestar(), devolver() y prestado. La clase Libro implementa esta interfaz
	 */
	
	//prestar(), devolver() y prestado
	void prestar();
	void devolver();
	void prestado();
	
	/*
	void prestar();
	void devolver();
	boolean estaPrestado();
	// la profe pone:
	// void prestado();
	*/
}