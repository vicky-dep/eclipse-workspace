package ejercicio1;

import java.util.Arrays;

public class PrincipalB {

	public static void main(String[] args) {
		// comento ya que seria para tipo enumerado
		/*Plato c = new Plato("queso",tipoPlato.entrada,8.5f);
		Plato c1 = new Plato("fresas",tipoPlato.postre,4.5f);
		Plato c2 = new Plato("chuletas",tipoPlato.principal,12);*/
		Plato c = new Plato("queso","entrada",8.5f);
		Plato c1 = new Plato("fresas","postre",4.5f);
		Plato c2 = new Plato("chuletas","principal",12);
		Menu p = new Menu();
		p.anadirPlato(c);
		p.anadirPlato(c1);
		p.anadirPlato(c2);
		p.anadirPlato(c);
		System.out.println(p);
		
		System.out.println("Generando Menu aleatorio");
		System.out.println(Arrays.toString(p.generarPlatosAleatorios(4)));
		System.out.println(Arrays.toString(p.generarListaPorTipo("entrada", 3)));
		System.out.println(Arrays.toString(p.generarListaPorTipo("postre", 2)));
		
		/*System.out.println(Arrays.toString(p.generarListaPorTipo(tipoPlato.entrada, 3)));
		System.out.println(Arrays.toString(p.generarListaPorTipo(tipoPlato.postre, 2)));*/
		
	}

}