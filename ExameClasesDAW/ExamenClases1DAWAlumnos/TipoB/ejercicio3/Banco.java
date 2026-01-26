package ejercicio3;

public class Banco {

	private static String cif = "B7899855X";
	private int numEmpleados;

	public Banco() {
		super();
	}
	public Banco(int numEmpleados) {
		super();
		this.numEmpleados = numEmpleados;
	}

	public static String getCif() {
		return cif;
	}
	public static void setCif(String cif) {
		Banco.cif = cif;
	}
	public int getNumEmpleados() {
		return numEmpleados;
	}
	public void setNumEmpleados(int numEmpleados) {
		this.numEmpleados = numEmpleados;
	}
	
	@Override
	public String toString() {
		return "Banco [numEmpleados=" + numEmpleados + "]";
	}
	
}