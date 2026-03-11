package ejercicio3;

import java.util.Arrays;

public class Escuderia {

	// Atributos
	private MiembroEquipo[] miembros = new MiembroEquipo[0];
	private double fondoPremios;

	// Constructor
	public Escuderia() {
		super();
	}
	public Escuderia(MiembroEquipo[] miembros, double fondoPremios) {
		super();
		this.miembros = miembros;
		this.fondoPremios = fondoPremios;
	}

	// Getters & Setters
	public MiembroEquipo[] getMiembros() {
		return miembros;
	}
	public void setMiembros(MiembroEquipo[] miembros) {
		this.miembros = miembros;
	}
	public double getFondoPremios() {
		return fondoPremios;
	}
	public void setFondoPremios(double fondoPremios) {
		this.fondoPremios = fondoPremios;
	}
	
	@Override
	public String toString() {
		return "Escuderia [miembros=" + Arrays.toString(miembros) + ", fondoPremios=" + fondoPremios + "]";
	}
	
	// Metodos de la clase
	public void ficharMiembro(MiembroEquipo m) {
		boolean repetido = false;
		int cont = 0;
		while (!repetido && cont < miembros.length) {
			if (miembros[cont].getCodigoLicencia() == m.getCodigoLicencia()) { // la comparación es con == porque el tipo de código es "int"
				repetido = true;
				System.out.println("No se puede añadir, está repetido.");
			}
			cont++;
		}
		if (!repetido) {
			MiembroEquipo[] copy = Arrays.copyOf(miembros, miembros.length + 1);
			copy[copy.length - 1] = m;
			miembros = copy;
			System.out.println("Miembro añadido correctamente.");
		}
	}
	
	public void rescindirContrato(int codigo) {
		boolean encontrado = false;
		int cont = 0;
		while (!encontrado && cont < miembros.length) {
			if (miembros[cont].getCodigoLicencia() == codigo) {
				encontrado = true;
				MiembroEquipo[] aux = new MiembroEquipo[miembros.length-1];
				int contAux = 0;
				for (int i = 0; i < miembros.length; i++) {
					if (i != cont) {
						aux[contAux] = miembros[i];
						contAux++;
					}
				}
				miembros = aux;
				System.out.println("Se ha rescindido el contrato.");
			}
			cont++;
		}
		if (!encontrado) {
			System.out.println("Lo siento, código no encontrato, no se puede rescindir el contrato.");
		}
	}
	
	public void repartirPremios() {
		int miembrosMas5AniosExp = miembrosConMas5AniosExp();
		double premioRepartido = fondoPremios / miembrosMas5AniosExp;
		for (int i = 0; i < miembros.length; i++) {
			if (miembros[i].getAniosExperiencia() > 5) {
				miembros[i].incrementarPresupuesto(premioRepartido);
				System.out.println("Se ha repartido el premio correctamente.");
			}
		}
		fondoPremios = 0;
	}
	
	// Metodo auxiliar (quiero saber cuantos tienen mas de 5 años de experiencia para repartirPremios)
	public int miembrosConMas5AniosExp () {
		int cant = 0;
		for (int i = 0; i < miembros.length; i++) {
			if (miembros[i].getAniosExperiencia() > 5) {
				cant++;
			}
		}
		return cant;
	}
}