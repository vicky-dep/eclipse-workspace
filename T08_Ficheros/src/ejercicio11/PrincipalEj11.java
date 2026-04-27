package ejercicio11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PrincipalEj11 {

	public static void main(String[] args) {
		BufferedReader brCodec = null;
		BufferedReader brMensaje = null;
		BufferedWriter bw = null;

		try {
			brCodec = new BufferedReader(new FileReader("codec.txt"));
			String alfabeto = brCodec.readLine();
			String cifrado = brCodec.readLine();
			brMensaje = new BufferedReader(new FileReader("mensaje.txt"));
			bw = new BufferedWriter(new FileWriter("mensajeCifrado.txt"));
			String linea = brMensaje.readLine();

			while (linea != null) {
				String lineaCifrada = "";
				for (int i = 0; i < linea.length(); i++) {
					char letra = linea.charAt(i);
					int posicion = alfabeto.indexOf(letra);
					if (posicion != -1) {
						lineaCifrada += cifrado.charAt(posicion);
					} else {
						lineaCifrada += letra;
					}
				}
				bw.write(lineaCifrada);
				bw.newLine();
				linea = brMensaje.readLine();
			}
			System.out.println("Fichero cifrado creado correctamente");
		} catch (IOException e) {
			System.out.println("Error al leer o escribir los ficheros");
			e.printStackTrace();
		} finally {
			try {
				if (brCodec != null) brCodec.close();
				if (brMensaje != null) brMensaje.close();
				if (bw != null) bw.close();
			} catch (IOException e) {
				System.out.println("Error al cerrar los buffers");
				e.printStackTrace();
			}
		}
	}
}