package ejerciciosTransparencias;

public class Principal {

	public static void main(String[] args) {
		
		CuentaCorriente c = new CuentaCorriente("Ana", "789456123V");
		
		c.sacarDinero(5);
		c.ingresarDinero(100);
		c.sacarDinero(10);
		
		c.nombreBanco = "BBVA";
		c.mostrarInformacion();
		
		CuentaCorriente c1 = new CuentaCorriente("Luis", "9055665");
		c1.mostrarInformacion();
		// System.out.println(c); // posicion de memoria que esta ocupando la clase cuentacorriente
		

	}

}