package ejercicio2;

import java.util.Arrays;

public class GestionGimnasio {

	// Atributos
	private Socio[] socios = new Socio[50];
	private int contador = 0;

	// Constructor
	public GestionGimnasio() {
		super();
	}
	public GestionGimnasio(Socio[] socios) {
		super();
		this.socios = socios;
	}
	
	// Getters & Setters
	public Socio[] getSocios() {
		return socios;
	}
	public void setSocios(Socio[] socios) {
		this.socios = socios;
	}
	
	@Override
	public String toString() {
		return "GestionGimnasio [socios=" + Arrays.toString(socios) + "]";
	}

	// Metodos de la clase
	public void darAlta(Socio s) {
		if (contador < socios.length) {
			socios[contador] = s;
			contador++;
			System.out.println("Socio dado de alta correctamente.");
		} else {
			System.out.println("No hay espacio suficiente para dar de alta un socio nuevo");
		}
	}
	
	public void realizarEntrenamiento(String id, int min) throws GimnasioException {
		boolean encontrado = false;
		int cont = 0;
		while(!encontrado && cont < socios.length) {
			if(socios[cont] != null && socios[cont].getIdSocio().equalsIgnoreCase(id)) {
				encontrado = true;
				Socio s = socios[cont];
				s.aplicarTarifaActividad(min);
				System.out.println("Se aplica la tarifa al socio con id: " + id + ".");
				System.out.println("El nuevo saldo después de aplicar la tarifa es: " + s.getSaldoCuenta());
			}
			cont++;
		}
		if(!encontrado) {
			System.out.println("Lo siento, no hemos encontrado al socio con id: " + id + ".");
		}
	}
	
}