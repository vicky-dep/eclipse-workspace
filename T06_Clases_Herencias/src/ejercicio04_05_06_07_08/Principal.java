package ejercicio04_05_06_07_08;

public class Principal {

	public static void main(String[] args) {
		
		Lista l = new Lista();
		l.insertarAlfinal(2);
		l.insertarAlfinal(4);
		l.insertarAlfinal(6);
		System.out.println(l);
		l.insertarAlprincipio(1);
		System.out.println(l);
		l.insertarEnPosicion(2, 3);
		System.out.println(l);
		l.insertarEnPosicion(4, 5);
		System.out.println(l);
		l.insertarAlfinal(7);
		System.out.println(l);
		
		l.eliminarPosicion(1);
		System.out.println(l);
		
		int e = l.obtenerElemento(5);
		System.out.println(e);
		
		int i = l.buscarLista(6);
		System.out.println(i);
		
		int[] otra = {100,200,300};
		l.insertarAlFinalLista(otra);
		System.out.println(l);
	}

}