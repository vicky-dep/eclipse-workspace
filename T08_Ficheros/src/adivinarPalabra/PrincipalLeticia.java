package adivinarPalabra;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.google.gson.Gson;

public class PrincipalLeticia {

	public static void main(String[] args) {
		ArrayList<String> palabras = new ArrayList<String>();
		BufferedReader br = null;
		BufferedWriter bw=null;
		try {
			br = new BufferedReader(new FileReader("palabras.txt"));
			String line = br.readLine();
			while (line != null) {
				palabras.add(line);
				line = br.readLine();
			}
			int numAzar=(int) (Math.random()*palabras.size());
			String palabraParaAdivinar = palabras.get(numAzar);
			String huecos="";
			String resultado="";
			System.out.println("Esta es tu palabra para adivinar");
			System.out.println("Tiene una longitud de:"+palabraParaAdivinar.length());
			for (int i = 0; i < palabraParaAdivinar.length(); i++) {
				huecos+="_";

			}
			System.out.println(huecos);
			int errores=0;
			boolean adivinada=false;
			int puntos=0;
			resultado=huecos+";"+errores+";"+puntos+";"+adivinada;
			Scanner sc=new Scanner(System.in);
			while (errores<5 && !adivinada) {
				System.out.println("Dime una letra");
				String letra=sc.next();
				String[] split = resultado.split(";");
				resultado=	reemplazarHuecos(palabraParaAdivinar,letra,Integer.valueOf(split[1]),Boolean.valueOf(split[3]),split[0],Integer.valueOf(split[2]));
				split = resultado.split(";");
				errores=Integer.valueOf(split[1]);
				adivinada=Boolean.valueOf(split[3]);
				puntos=Integer.valueOf(split[2]);
				System.out.println("Errores:"+errores+" de 5");
				System.out.println(split[0]);

			}
			if(errores==5) {
				puntos=0;
				System.out.println("Has cometido 5 errores, tus puntos son 0");	
			}else {
				System.out.println("Puntos totales:"+puntos);
			}
			//Escribimos el fichero JSON
			System.out.println("Dame tu nombre para guardar la partida");
			String nombre=sc.next();
			Partida p=new Partida(nombre, puntos);
			Gson g=new Gson();
			String cadena = g.toJson(p);
			bw=new BufferedWriter(new FileWriter("partida.json"));
			bw.write(cadena);
			System.out.println("Fichero escrito correctamente");

		} catch (FileNotFoundException e) {
			System.out.println("Fichero de lectura no encontrado");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error al leer");
			e.printStackTrace();
		}finally {
			try {
				bw.close();
			} catch (IOException e) {
				System.out.println("Error al cerrar el fichero json");
				e.printStackTrace();
			}
		}
	}
	
	private static String reemplazarHuecos(String palabraParaAdivinar, String letra, int errores, boolean adivinada, String huecos, int puntos) {
		//Miramos si la letra existe dentro del String
		if(!palabraParaAdivinar.contains(letra)) {
			errores+=1;
			puntos+=(-2);
			return huecos+";"+errores+";"+puntos+";"+adivinada;

		}else {
			//reemplazamos los guiones bajos por la letra
			String aux="";
			puntos+=5;
			for(int i=0;i<palabraParaAdivinar.length();i++) {
				if(String.valueOf(palabraParaAdivinar.charAt(i)).equals(letra)){
					aux+=letra;
				}else if(String.valueOf(huecos.charAt(i)).equals("_")){
					aux+="_";
				}else {
					aux+=huecos.charAt(i);
				}
			}
			huecos=aux;
			if(!huecos.contains("_")) {
				adivinada=true;
			}
		}
		return huecos+";"+errores+";"+puntos+";"+adivinada;
	}
}
