package examenHerencia03;

import examenHerencia02.Enciclopedia;
import examenHerencia02.Novela;

public class PrincipalConExcepciones {

	public static void main(String[] args) {
		BibliotecaConEx biblioteca = new BibliotecaConEx(10);

		// Agregar libros
		Novela novela1 = new Novela("1234", "El Gran Gatsby", "F. Scott Fitzgerald", 200, "ficcion");
		Enciclopedia enciclopedia1 = new Enciclopedia("5678", "Enciclopedia Universal", "Varios", 500, 6);

		try {
			biblioteca.agregarLibro(novela1);
		} catch (BibliotecaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			biblioteca.agregarLibro(enciclopedia1);
		} catch (BibliotecaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Prestar libro
		try {
			biblioteca.prestarLibro("1234");
		} catch (BibliotecaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Devolver libro con retraso
		biblioteca.devolverLibro(novela1, 5, true);

	}
}