package ejercicio1;

public class CifradoCesar {
	
	public String cifrarTexto(String texto, int n) {
		
		String resultado = "";
		
		for (int i = 0; i < texto.length(); i++) {
			char c = texto.charAt(i);
			
			// lestras minúsculas
			if (c >= 'a' && c <= 'z') {
				char cifrada = (char) (c + n);
				if (cifrada > 'z') {
					cifrada = (char) (cifrada - 26);
				}
				resultado += cifrada;
			
			// letras mayúsculas
			} else if (c >= 'A' && c <= 'Z') { 
				char cifrada = (char) (c + n);
				if (cifrada > 'Z') {
					cifrada = (char) (cifrada - 26);
				}
				resultado += cifrada;
			
			// no es letra, se deja igual
			} else {
				resultado += c;
			}
		}
		return resultado;
	}
}