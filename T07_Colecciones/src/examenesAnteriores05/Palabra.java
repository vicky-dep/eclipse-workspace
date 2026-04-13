package examenesAnteriores05;

public class Palabra {

	private String palabraOriginal;
	private String palabraTraducida;
	
	public Palabra() {
		super();
	}
	public Palabra(String palabraOriginal, String palabraTraducida) {
		super();
		this.palabraOriginal = palabraOriginal;
		this.palabraTraducida = palabraTraducida;
	}

	public String getPalabraOriginal() {
		return palabraOriginal;
	}
	public void setPalabraOriginal(String palabraOriginal) {
		this.palabraOriginal = palabraOriginal;
	}
	public String getPalabraTraducida() {
		return palabraTraducida;
	}
	public void setPalabraTraducida(String palabraTraducida) {
		this.palabraTraducida = palabraTraducida;
	}
	
	@Override
	public String toString() {
		return "Palabra [palabraOriginal=" + palabraOriginal + ", palabraTraducida=" + palabraTraducida + "]";
	}

}