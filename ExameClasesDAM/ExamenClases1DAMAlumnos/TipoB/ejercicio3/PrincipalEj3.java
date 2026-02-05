package ejercicio3;

public class PrincipalEj3 {

	public static void main(String[] args) {
		
		Usuario u1 = new Usuario("Vicky");
		Usuario u2 = new Usuario("Pili");
		Usuario u3 = new Usuario("Clarita");
		Usuario u4 = new Usuario("Charly");
		
		System.out.println(u1);
		System.out.println(u2);
		System.out.println(u3);
		System.out.println(u4);
		System.out.println(u1.getTotalUsuarios());
		System.out.println(u2.getTotalUsuarios());
		
		u4.setTotalUsuarios(80);
		System.out.println(u1.getTotalUsuarios());
		System.out.println(u2.getTotalUsuarios());
	}

}