package examenDAMTipoA;

import java.util.Arrays;

public class GestionarFlota {

	Vehiculo[] vehiculos = new Vehiculo[20]; // maximo 20 vehiculos

	public GestionarFlota() {
		super();
	}
	public GestionarFlota(Vehiculo[] vehiculos) {
		super();
		this.vehiculos = vehiculos;
	}
	
	public Vehiculo[] getVehiculos() {
		return vehiculos;
	}
	public void setVehiculos(Vehiculo[] vehiculos) {
		this.vehiculos = vehiculos;
	}
	
	@Override
	public String toString() {
		return super.toString() + "GestionarFlota [vehiculos=" + Arrays.toString(vehiculos) + "]";
	}

	public void anadirVehiculo(Vehiculo v) {
		boolean repetido = false;
		int cont = 0;
		while(!repetido && cont < vehiculos.length) {
			if(vehiculos[cont].getMatricula().equalsIgnoreCase(v.getMatricula())) {
				repetido = true;
				System.out.println("Ese vehículo ya está registrado.");
			}
			cont++;
		}
		if(!repetido) {
			Vehiculo[] copy = Arrays.copyOf(vehiculos, vehiculos.length + 1);
			copy[copy.length-1] = v;
			vehiculos = copy;
			System.out.println("Vehiculo añadido correctamente.");
		}
	}
	
	public void iniciarRuta(String matricula, double km) {
		
	}
	
}