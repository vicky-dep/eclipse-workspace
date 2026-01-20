package ejercicio09;

public class Principal {

	public static void main(String[] args) {

        Cajero c = new Cajero();

        c.registrarBilletes(100, 2);
        c.registrarBilletes(50, 3);
        c.registrarBilletes(20, 5);
        c.registrarBilletes(10, 10);

        System.out.println();
        c.mostrarCajero();

        System.out.println();
        c.retirar(180);

        System.out.println();
        c.mostrarCajero();

	}

}