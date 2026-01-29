package ejercicio01;

public class Principal {
	
	/**
	 * Crear la clase abstracta Instrumento, que almacena en una tabla las notas musicales de una melodía (dentro de una misma octava). 
	 * El método add () añade nuevas notas musicales. La clase también dispone del método abstracto interpretar () que, en cada subclase 
	 * que herede de Instrumento, mostrará por consola las notas musicales según las interprete. 
	 */

	public static void main(String[] args) {
		Campana c = new Campana();
		// Probamos añadir e interpretar
		c.add("si");
		System.out.println(c);
		c.interpretar();
	}
}