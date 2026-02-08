package examenTipoADAWejercicio1;

import java.util.Arrays;

public class Equipo {

	Empleado[] empleados = {new Empleado("Carlos", 44, "informatico", "avanzado"), new Empleado("Vicky", 35, "informatica", "principiante")};
	
	public Equipo() {
		super();
	}

	public Equipo(Empleado[] empleados) {
		super();
		this.empleados = empleados;
	}

	public Empleado[] getEmpleados() {
		return empleados;
	}

	public void setEmpleados(Empleado[] empleados) {
		this.empleados = empleados;
	}

	@Override
	public String toString() {
		return "Equipo [empleados=" + Arrays.toString(empleados) + "]";
	} 
	
	// Metodos de la clase
	public void agregarEmpleados(Empleado e) {
		boolean repetido = false;
		int i = 0;
		while (!repetido && i < empleados.length) {
			if (empleados[i].getNombre().equals(e.getNombre()) &&
			    empleados[i].getEdad() == e.getEdad() &&
			    empleados[i].getPuesto().equals(e.getPuesto())) {
				repetido = true;
				System.out.println("Ese empleado ya se encuentra registrado");
			}
			i++;	
		}
		if (!repetido) {
			Empleado[] copy = Arrays.copyOf(empleados, empleados.length +1);
			copy[copy.length-1] = e;
			empleados = copy;
			System.out.println("Empleado agregado correctamente");
		}
	}
	
	public Empleado[] formarEquipoAleatorio (int n) {
		Empleado[] resultado = new Empleado[0];
		resultado = obtenerEmpleadosAleatorios(n, empleados);
		return resultado;
	}
	
	public Empleado[] equipoPorNivelAleatorio (String nivel, int n) {
		Empleado[] resultado = new Empleado[0];
		Empleado[] filtro = new Empleado[0];
		for (int i = 0; i < empleados.length; i++) {
			if(empleados[i].getExperiencia().equalsIgnoreCase(nivel)) {
				Empleado[] copy = Arrays.copyOf(filtro, filtro.length+1);
				copy[copy.length-1] = empleados[i];
				filtro = copy;				
			}
		}
		if(filtro.length == 0) {
			System.out.println("No hay empleados de ese nivel");
		} else {
			resultado = obtenerEmpleadosAleatorios(n, filtro);			
		}
		return resultado;
	}
	
	// Metodo privado que utilizare para generar las listas aleatorias
	private Empleado[] obtenerEmpleadosAleatorios(int n, Empleado[] empleados) {
		Empleado[] resultado = new Empleado[0];
		if (n > empleados.length) {
			System.out.println("No hay empleados suficientes, te muestro los que tengo");
			resultado = empleados;
		} else {
			int contAux = 0;
			while (contAux < n) {
				int pos = (int) (Math.random()*empleados.length);
				Empleado empleado = empleados[pos];
				boolean repetido = false;
				int i = 0;
				while(!repetido && i < resultado.length) {
					if(resultado[i].equals(empleado)) {
						repetido = true;
					} 
					i++;
				}
				if (!repetido) {
					Empleado[] copy = Arrays.copyOf(resultado, resultado.length+1);
					copy[copy.length-1] = empleado; 
					resultado = copy;						
					contAux++;
				} else {
					System.out.println("Ya esta en la lista, se debe generar otro aleatorio");					
				}
			}
		}
		return resultado;
	}

}