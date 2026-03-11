package ejercicio3;

public class Piloto extends MiembroEquipo {

	// Atributos: no tiene atributos propios
	
	// Constructor
	public Piloto(String nombre, String apellidos, int codigoLicencia, int aniosExperiencia, double presupuesto) {
		super(nombre, apellidos, codigoLicencia, aniosExperiencia, presupuesto);
	}
	public Piloto(String nombre, String apellidos, int codigoLicencia, String[] test, int aniosExperiencia,
			double presupuesto) {
		super(nombre, apellidos, codigoLicencia, test, aniosExperiencia, presupuesto);
	}
	
	@Override
	public String toString() {
		return "Piloto [toString()=" + super.toString() + "]";
	}
	
	// Metodo de la clase padre modificado en caso de penalización por resultados
	@Override
	public void incrementarPresupuesto(double cantidad) {
		if (rendimientoBajo()) {
			cantidad *= 0.9;
			// aqui llamará al método del padre con la cantidad disminuida por la penalización
			super.incrementarPresupuesto(cantidad);
		} else {
			// aquí llamará al método del padre sin la penalización
			super.incrementarPresupuesto(cantidad);
		}
	}
	
}