package ejercicio1;

import java.util.Arrays;

public class CorreccionPrincipalEj1TipoA {

	public static void main(String[] args) {
		/**
		 * GestorReportesOficina gp = new GestorReportesOficina();
		 * 
		 * // 2. Generar 10 palabras de 4 caracteres cada una // Frase:
		 * "EstaES1FrAsEParAGeneRarPalabRasElDIa09y10Del02de2026HoyestAnUblado"
		 * gp.extraerReportes(10, 4);
		 * 
		 * System.out.println(Arrays.toString(gp.getReportesGenerados()));
		 * 
		 * // 3. Buscar palabras que contengan la letra 'a' (minúscula o mayúscula) char
		 * letraBusqueda = 'a'; String[] encontradas = gp.buscarPalabras(letraBusqueda);
		 * System.out.println("Palabras que contienen '" + letraBusqueda + "'");
		 * System.out.println(Arrays.toString(encontradas));
		 * 
		 * // 4. Ordenar palabras (Vocal -> Número -> Consonante) String[] ordenadas =
		 * gp.clasificarReportes(); System.out.println("Palabras Ordenadas ");
		 * System.out.println(Arrays.toString(ordenadas));
		 **/
		
		CorreccionGestor cg = new CorreccionGestor();
		cg.extraerReportes(10, 4);
		System.out.println(Arrays.toString(cg.getReportesGenerados()));
		
		char letraBusqueda = 'a'; 
		String[] encontradas = cg.buscarPalabras(letraBusqueda);
		System.out.println("Palabras que contienen '" + letraBusqueda + "'");
		System.out.println(Arrays.toString(encontradas));
		
		String[] ordenadas = cg.clasificarReportes(); 
		System.out.println("Palabras Ordenadas ");
		System.out.println(Arrays.toString(ordenadas));
	}

}