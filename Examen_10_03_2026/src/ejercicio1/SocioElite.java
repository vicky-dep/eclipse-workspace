package ejercicio1;

public class SocioElite extends Socio {
	
	// Atributos
	private boolean accesoVIP;
	
	//Constructor
	public SocioElite() {
		super();
	}
	public SocioElite(boolean accesoVIP) {
		super();
		this.accesoVIP = accesoVIP;
	}	
	public SocioElite(String idSocio, double cuotaBase, double saldoCuenta, boolean accesoVIP) {
		super(idSocio, cuotaBase, saldoCuenta);
		this.accesoVIP = accesoVIP;
	}
	
	// Getters & Setters
	public boolean isAccesoVIP() {
		return accesoVIP;
	}
	public void setAccesoVIP(boolean accesoVIP) {
		this.accesoVIP = accesoVIP;
	}

	@Override
	public String toString() {
		return super.toString() + "SocioElite [accesoVIP=" + accesoVIP + "]";
	}

	// Implementa método abstracto del padre
	@Override
	public void aplicarTarifaActividad(int minutos) {	
		double consumo = 0.5 * minutos;
		if (getSaldoCuenta() < consumo) {
			System.out.println("No tienes saldo suficiente.");
		} else {
			setSaldoCuenta(getSaldoCuenta() - consumo);
			System.out.println("Se ha aplicado la tarifa.");
		}
	}

}