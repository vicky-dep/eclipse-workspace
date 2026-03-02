package ejerciciosNoEvaluables01_02_03;

// se usa comparable ...
public class Jornada  implements JornadaInterfaz, Comparable<Jornada> {
	/*
	 * Implementar la clase Jornada, cuyos objetos son los datos de cada día de trabajo de los empleados de una empresa. 
	 * En ella se identificará al trabajador por su DNI y figurarán la fecha(String) y las horas de entrada y salida del 
	 * trabajo de cada jornada(int, formato 24h). Un método computará el número de minutos trabajados en la jornada. 
	 * El criterio de orden natural de las jornadas será el de los DNI, y para igual DNI, el de la fecha de la jornada, 
	 * con objeto de que aparezcan consecutivas todas las jornadas de cada trabajador. Asimismo implementar el método 
	 * toString () que muestre el DNI del empleado, la fecha y la duración en minutos de las jornadas.
	 */

	private String dni;
	private String fecha;
	private int horaEntrada;
	private int horaSalida;
	
	public Jornada(String dni, String fecha, int horaEntrada, int horaSalida) {
		super();
		this.dni = dni;
		this.fecha = fecha;
		this.horaEntrada = horaEntrada;
		this.horaSalida = horaSalida;
	}
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public int getHoraEntrada() {
		return horaEntrada;
	}
	public void setHoraEntrada(int horaEntrada) {
		this.horaEntrada = horaEntrada;
	}
	public int getHoraSalida() {
		return horaSalida;
	}
	public void setHoraSalida(int horaSalida) {
		this.horaSalida = horaSalida;
	}
	@Override
	public String toString() {
		return "Jornada [dni=" + dni + ", fecha=" + fecha + ", horaEntrada=" + horaEntrada + ", horaSalida="
				+ horaSalida + "]";
	}
	
	@Override
	public int calcularMinutosJornada() {
		return (horaSalida - horaEntrada) * 60;
	}

	@Override
	public int compareTo(Jornada j) {
		// Para String se compara con compareTo, para numeros se realiza la resta. Ambos devuelve un valor negativo, cero (si son iguales) o positivo
		if (dni.compareTo(j.dni) == 0) {
			// Son iguales
			return fecha.compareTo(j.fecha);
		}
		return dni.compareTo(j.dni);
	}
	
}