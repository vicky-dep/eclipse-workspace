package adivinarPalabra;

public class Partida {

	private String nombreJugador;
	private int puntos;

	public Partida() {
		super();
	}
	public Partida(String nombreJugador, int puntos) {
		super();
		this.nombreJugador = nombreJugador;
		this.puntos = puntos;
	}
	
	public String getNombreJugador() {
		return nombreJugador;
	}
	public void setNombreJugador(String nombreJugador) {
		this.nombreJugador = nombreJugador;
	}
	public int getPuntos() {
		return puntos;
	}
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	
	@Override
	public String toString() {
		return "Partida [nombreJugador=" + nombreJugador + ", puntos=" + puntos + "]";
	}
	
}