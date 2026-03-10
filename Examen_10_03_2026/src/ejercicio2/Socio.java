package ejercicio2;

public abstract class Socio {

	// Atributos (la clase padre podría tener los atributos protected)
	private String idSocio;
	private double cuotaBase;
	private double saldoCuenta;

	// Constructor
	public Socio() {
		super();
	}
	public Socio(String idSocio, double cuotaBase, double saldoCuenta) {
		super();
		this.idSocio = idSocio;
		this.cuotaBase = cuotaBase;
		this.saldoCuenta = saldoCuenta;
	}

	// Getters & Setters
	public String getIdSocio() {
		return idSocio;
	}
	public void setIdSocio(String idSocio) {
		this.idSocio = idSocio;
	}
	public double getCuotaBase() {
		return cuotaBase;
	}
	public void setCuotaBase(double cuotaBase) {
		this.cuotaBase = cuotaBase;
	}
	public double getSaldoCuenta() {
		return saldoCuenta;
	}
	public void setSaldoCuenta(double saldoCuenta) {
		this.saldoCuenta = saldoCuenta;
	}
	
	@Override
	public String toString() {
		return "Socio [idSocio=" + idSocio + ", cuotaBase=" + cuotaBase + ", saldoCuenta=" + saldoCuenta + "]";
	}
	
	// Metodo abstracto (lo implementarán las hijas)
	public abstract void aplicarTarifaActividad(int minutos) throws GimnasioException;
	
	// Metodos de la clase
	public void recargarSaldo(double importe) {
		if (importe < 0) {
			System.out.println("No puedes recargar un importe negativo.");
		} else {
			saldoCuenta += importe;
			System.out.println("Se han agregado " + importe + " euros a la cuenta. Saldo actual: " + saldoCuenta);			
		}
	}
	
	public void validarAcceso(int edad) throws GimnasioException {
		if (edad >= 14) {
			System.out.println("Acceso permitido.");
		} else {
			System.out.println("Acceso denegado, debes ser mayor de 14 años.");
			throw new GimnasioException(GimnasioException.MENOR_EDAD);
		}
	}
	
}