package ejerciciosTransparencias;

public class CuentaCorriente {
	String nombre;
	String dni;
	float saldo = 0;
	static String nombreBanco; // todos los objetos que crees a partir de esta clase, este atributo tendra siempre el mismo valor
	
	public CuentaCorriente(String nombre, String dni) {
		super();
		this.nombre = nombre;
		this.dni = dni;
	}
	
	public void sacarDinero(float dineroAretirar) {
		if (dineroAretirar <= saldo) {
			saldo -= dineroAretirar;
			System.out.println("Operacion realizada correctamente");
		} else {
			System.out.println("Saldo insufuciente");
		}
	}
	
	public void ingresarDinero (float ingreso) {
		saldo += ingreso;
		System.out.println("Ingreso realizado correctamente");
	}
	
	public void mostrarInformacion() {
		System.out.println("Nombre: " + nombre);
		System.out.println("DNI: " + dni);
		System.out.println("Saldo: " + saldo);
		System.out.println("Banco: " + nombreBanco);
	}
	
	
}