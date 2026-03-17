package ejercicio04;

public interface ProductoInterfaz {

	/*
	 * Diseña una interfaz que permita saber los productos que se les puede ofrecer al cliente a partir del dinero en su cuenta. 
	 * Si en la cuenta hay menos de 10000€ se le puede ofrecer sólo el seguro de hogar, si tiene entre 10000€ y 20000€ se le 
	 * ofrecerá el seguro de vida y a partir de 50000€ los fondos de inversión.
	 */
	
	String ofrecerProductos();
	
}