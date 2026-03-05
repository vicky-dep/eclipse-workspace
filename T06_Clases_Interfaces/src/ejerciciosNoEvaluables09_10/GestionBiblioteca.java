package ejerciciosNoEvaluables09_10;

public class GestionBiblioteca {

	public int cuentaPrestados(Publicacion[] publicaciones) {
		int prestados = 0;
		for (int i = 0; i < publicaciones.length; i++) {
			// Se utiliza instanceof porque el atributo prestado es de libro,
			// Si intentaramos obtener si está prestado sin el instanceof, cuando
			// la publicación fuera una revista os daria un ClassCastException
			if (publicaciones[i] instanceof Libro) {
				Libro l = (Libro) publicaciones[i];
				if (l.isPrestado()) {
					prestados++;
				}
			}

		}
		return prestados;
	}

	public int publicacionesAnterioresA(Publicacion[] publicaciones, int anio) {
		int publicAnteriores = 0;
		for (int i = 0; i < publicaciones.length; i++) {
			Publicacion p = publicaciones[i];
			if (p.getAnioPublicacion() <= anio) {
				publicAnteriores++;
			}

		}
		return publicAnteriores;
	}
}