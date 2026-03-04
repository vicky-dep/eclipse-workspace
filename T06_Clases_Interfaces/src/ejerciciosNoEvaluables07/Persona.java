package ejerciciosNoEvaluables07;

public class Persona implements ClienteInterfaz, EmpleadoInterfaz {
	/*
	 * Implementar una aplicación para gestionar la información de los empleados y clientes de un banco, teniendo en cuenta que un empleado 
	 * puede ser, a la vez, cliente del banco. Para ello, crear una única clase Persona que implemente las interfaces Cliente y Empleado. 
	 * Para simplificar solo se van a tener en cuenta los siguientes atributos:
	 * Como empleado: número de horas trabajadas en el mes.
	 * Como cliente: saldo de su cuenta.
	 * Comunes: DNI (inmutable una vez creado), nombre y dos booleanos que digan si es cliente y/o empleado.
	 * Escribir un programa donde se crea un empleado que es cliente y se incrementa su número de horas trabajadas y su saldo como cliente.
	 */
	
	/**
	 * Como empleado: número de horas trabajadas en el mes. Como cliente: saldo de
	 * su cuenta. Comunes: DNI (inmutable una vez creado), nombre y dos booleanos
	 * que digan si es cliente y/o empleado.
	 * 
	 */
	
	// solucion Leticia:
	
	private int numHoras;
	private float saldo;
	private String dni;
	private String nombre;
	private boolean esCliente;
	private boolean esEmpleado;

	public Persona(int numHoras, float saldo, String dni, String nombre, boolean esCliente, boolean esEmpleado) {
		super();
		this.numHoras = numHoras;
		this.saldo = saldo;
		this.dni = dni;
		this.nombre = nombre;
		this.esCliente = esCliente;
		this.esEmpleado = esEmpleado;
	}

	public int getNumHoras() {
		return numHoras;
	}

	public void setNumHoras(int numHoras) {
		this.numHoras = numHoras;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	// El dni se asigna al crear el objeto, por eso no se implementa su set
	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isEsCliente() {
		return esCliente;
	}

	public void setEsCliente(boolean esCliente) {
		this.esCliente = esCliente;
	}

	public boolean isEsEmpleado() {
		return esEmpleado;
	}

	public void setEsEmpleado(boolean esEmpleado) {
		this.esEmpleado = esEmpleado;
	}

	@Override
	public String toString() {
		return "Persona [numHoras=" + numHoras + ", saldo=" + saldo + ", dni=" + dni + ", nombre=" + nombre
				+ ", esCliente=" + esCliente + ", esEmpleado=" + esEmpleado + "]";
	}

	@Override
	public void incrementarHoras(int numHorasAIncrementar) {
		if (esEmpleado) {
			numHoras += numHorasAIncrementar;
		}

	}

	@Override
	public void incrementarSaldo(float saldoAsumar) {
		if (esCliente) {
			saldo += saldoAsumar;
		}
	
	/*
	private String dni;
	private String nombre;
	private boolean esCliente;
	private boolean esEmpleado;
	
	// atributos de cada rol:
	private double saldo;
	private int horasTrabajadas;

	public Persona(String dni, String nombre, boolean esCliente, boolean esEmpleado) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.esCliente = esCliente;
		this.esEmpleado = esEmpleado;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean isEsCliente() {
		return esCliente;
	}
	public void setEsCliente(boolean esCliente) {
		this.esCliente = esCliente;
	}
	public boolean isEsEmpleado() {
		return esEmpleado;
	}
	public void setEsEmpleado(boolean esEmpleado) {
		this.esEmpleado = esEmpleado;
	}
	// el dni debe ser inmutable
	public String getDni() {
		return dni;
	}
	
	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", esCliente=" + esCliente + ", esEmpleado=" + esEmpleado
				+ "]";
	}

	@Override
	public void trabajar(int horas) {
		if (esEmpleado) {
			horasTrabajadas += horas;
			System.out.println("Se han incrementado las horas correctamente.");
		} else {
			System.out.println("Esta persona no es empleado.");
		}
	}
	
	@Override
	public int horasTrabajadasMes() {
		return horasTrabajadas;
	}

	@Override
	public void ingresar(double cantidad) {
		if (esCliente) {
			saldo += cantidad;
			System.out.println("Dinero ingresado correctamente.");
		} else {
			System.out.println("Esta persona no es cliente.");
		}
	}
	
	@Override
	public double saldoCuenta() {
		return saldo;
	}
	*/
	}
}