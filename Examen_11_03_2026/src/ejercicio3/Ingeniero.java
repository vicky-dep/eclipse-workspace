package ejercicio3;

public class Ingeniero extends MiembroEquipo {

	// Atributos: no tiene atributos propios
	
	// Constructor
	public Ingeniero(String nombre, String apellidos, int codigoLicencia, int aniosExperiencia, double presupuesto) {
		super(nombre, apellidos, codigoLicencia, aniosExperiencia, presupuesto);
	}
	public Ingeniero(String nombre, String apellidos, int codigoLicencia, String[] test, int aniosExperiencia,
			double presupuesto) {
		super(nombre, apellidos, codigoLicencia, test, aniosExperiencia, presupuesto);
	}
	
	@Override
	public String toString() {
		return "Ingeniero [toString()=" + super.toString() + "]";
	}
	
	// Metodo de la clase padre modificado, bono extra en caso de ultimos 3 test "eficiente"
	@Override
	public void incrementarPresupuesto(double cantidad) {
		if (rendimientoAlto()) {
			cantidad += 800;
			// aqui llamará al método del padre con la cantidad + el bono
			super.incrementarPresupuesto(cantidad);
		} else {
			// aquí llamará al método del padre sin el bono
			super.incrementarPresupuesto(cantidad);
		}
	}
	
}