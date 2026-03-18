package ejercicio04;

import java.util.Arrays;

public class Banco {

	private Cuenta[] cuentas = new Cuenta[0];

	public Banco() {
		super();
	}
	public Banco(Cuenta[] cuentas) {
		super();
		this.cuentas = cuentas;
	}

	public Cuenta[] getCuentas() {
		return cuentas;
	}
	public void setCuentas(Cuenta[] cuentas) {
		this.cuentas = cuentas;
	}

	@Override
	public String toString() {
		return "Banco [cuentas=" + Arrays.toString(cuentas) + "]";
	}
	
}