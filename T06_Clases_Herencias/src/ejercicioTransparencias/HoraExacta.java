package ejercicioTransparencias;

public class HoraExacta extends Hora { // Herencia

	private int segundos; // solo el padre puede tener los atributos protected, los hijos siempre private !!

	public HoraExacta(int hora, int minutos, int segundos) {
		super(hora, minutos); // llama a los constructores de la clase padre
		this.segundos = segundos;
	}
	
	@Override
	public boolean equals(Object obj) { // Source - Override ...
		return super.equals(obj);
	}

	public void setSegundos(int valor) {
		if(valor >= 0 && valor <= 59) {
			if (segundos + valor <= 59) {				
				segundos += valor;
			} else {
				int seg = (segundos + valor)-60;
				segundos = seg;
				super.inc(); // aqui se llama a un metodo del padre
			}
		}
	}

}