package ejercicio1;

public class SocioJunior extends Socio {
	
	// Atributos
	private String escuelaDeportiva;
	
	// Constructor
	public SocioJunior() {
		super();
	}
	public SocioJunior(String escuelaDeportiva) {
		super();
		this.escuelaDeportiva = escuelaDeportiva;
	}
	public SocioJunior(String idSocio, double cuotaBase, double saldoCuenta, String escuelaDeportiva) {
		super(idSocio, cuotaBase, saldoCuenta);
		this.escuelaDeportiva = escuelaDeportiva;
	}

	// Getters & Setters
	public String getEscuelaDeportiva() {
		return escuelaDeportiva;
	}
	public void setEscuelaDeportiva(String escuelaDeportiva) {
		this.escuelaDeportiva = escuelaDeportiva;
	}
	
	@Override
	public String toString() {
		return super.toString() + "SocioJunior [escuelaDeportiva=" + escuelaDeportiva + "]";
	}
	
	// Implementa método abstracto del padre
	@Override
	public void aplicarTarifaActividad(int minutos) {
		double consumo = 0.2 * minutos;
		if (getEscuelaDeportiva().equals("")) { // quizas lo podria mejorar con un if negando ... para que solo haga consumo*0.85
			consumo = consumo;
		} else {
			consumo *= 0.85;
		}
		if (getSaldoCuenta() < consumo) {
			System.out.println("No tienes saldo suficiente.");
		} else {
			setSaldoCuenta(getSaldoCuenta() - consumo);
			System.out.println("Se ha aplicado la tarifa.");
		}
	}
	
}