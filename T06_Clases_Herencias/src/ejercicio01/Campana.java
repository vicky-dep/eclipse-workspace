package ejercicio01;

public class Campana extends Instrumento {

	@Override
	public void interpretar() {
		String nota1 = super.melodia[0];
		String nota2 = super.melodia[3];
		String nota3 = super.melodia[0];
		System.out.println("Melodia: " + nota1 + " " + nota2 + " " + nota3);
		
	}	
}