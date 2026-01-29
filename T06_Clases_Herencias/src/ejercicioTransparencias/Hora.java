package ejercicioTransparencias;

public class Hora {
	
	protected int hora; // lo mejor es siempre poner los atributos del padre en protected
	private int minutos;

	public Hora() {
		super();
	}
	public Hora(int hora, int minutos) {
		super();
		this.hora = hora;
		this.minutos = minutos;
	}
	
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public int getMinutos() {
		return minutos;
	}
	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}
	@Override
	public String toString() {
		return "Hora [hora=" + hora + ", minutos=" + minutos + "]";
	}
	
	public void inc() {
		// Incrementa la hora en 1 minuto
		if(minutos < 59) {
			minutos++;
		} else {
			if(hora == 23) {
				hora = 0;
				minutos = 0;
			} else {
				hora++;
				minutos = 0;
			}
		}
	}
	
	public boolean setMinuto(int valor) {
		boolean resultado = false;
		if(valor >= 0 && valor <= 59) {
			resultado = true;
		}
		return resultado;
	}
	
	public boolean setHoras(int valor) {
		boolean resultado = false;
		if(valor >= 0 && valor <= 23) {
			resultado = true;
		}
		return resultado;
	}
	
}