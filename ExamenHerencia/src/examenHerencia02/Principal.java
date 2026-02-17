package examenHerencia02;

public class Principal {

	public static void main(String[] args) {
		Biblioteca biblioteca = new Biblioteca(10);

		// Agregar libros
		Novela novela1 = new Novela("1234", "El Gran Gatsby", "F. Scott Fitzgerald", 200, "ficcion");
		Enciclopedia enciclopedia1 = new Enciclopedia("5678", "Enciclopedia Universal", "Varios", 500, 6);

		biblioteca.agregarLibro(novela1);
		biblioteca.agregarLibro(enciclopedia1);

		// Prestar libro
		biblioteca.prestarLibro("1234");

		// Devolver libro con retraso
		biblioteca.devolverLibro(novela1, 5, true);

	}
}