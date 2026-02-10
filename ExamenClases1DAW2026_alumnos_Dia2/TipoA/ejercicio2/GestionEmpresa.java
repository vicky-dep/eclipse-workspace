package ejercicio2;

import java.util.Arrays;

public class GestionEmpresa {

	// Atributos
	private final int CAPACIDAD = 100;
	private Oficina[] registros = new Oficina[CAPACIDAD];

	// Constructor
	public GestionEmpresa() {
		super();
	}
	public GestionEmpresa(Oficina[] registros) {
		super();
		this.registros = registros;
	}
	
	// Getters & Setters
	public Oficina[] getRegistros() {
		return registros;
	}
	public void setRegistros(Oficina[] registros) {
		this.registros = registros;
	}
	public int getCAPACIDAD() {
		return CAPACIDAD;
	}
	
	// toString
	@Override
	public String toString() {
		return "GestionEmpresa [CAPACIDAD=" + CAPACIDAD + ", registros=" + Arrays.toString(registros) + "]";
	}
	
	// Metodos de la clase
	public void registrarOficina(String codigo, int n) {
		// No se puede registrar un código de oficina que ya exista, ni exceder el límite (100)
		boolean repetida = false;
		int i = 0;
		while (!repetida && i < registros.length) {
			if (registros[i] != null && registros[i].getCodigoOficina().equals(codigo)) {
				repetida = true;
			}
			i++;
		}
		if (repetida) {
			System.out.println("No se puede registrar, ese códido de oficina ya existe.");			
		} else {
			boolean agregada = false;
			int pos = 0;
			while (!agregada && pos < registros.length) {
				// para registrarla necesito un hueco que esté null
				if (registros[pos] == null) {
					registros[pos] = new Oficina(codigo,n);
					agregada = true;
					System.out.println("Oficina registrada correctamente");
				}
				pos++;
			}
			if (!agregada) {
				// Si no puedo agregarla es porque no hay hueco, es decir, ya están los 100 registros completos
				System.out.println("Se ha excedido el limite de 100 registros.");
			}
		}
	}
	
	/* de esta forma imprimia el array de 100 posiciones, con null donde no existen oficinas
	public void mostrarInformacion() {
		System.out.println(Arrays.toString(registros));
	}*/
	
	// en este metodo, redimensiono un array con las oficinas que hay registradas y solo muestro esas
	// o un mensaje que indica que aún no hay registros (se puede verificar en el main antes de crear oficinas)
	public void mostrarInformacion() {
		Oficina[] resultado = new Oficina [0];
		for (int i = 0; i < registros.length; i++) {
			if (registros[i] != null) {
				Oficina[] copy = Arrays.copyOf(resultado, resultado.length +1);
				copy[copy.length -1] = registros[i];
				resultado = copy;
			}
		}
		if (resultado.length == 0) {
			System.out.println("Aún no existen oficinas registradas.");
		} else {
			System.out.println(Arrays.toString(resultado));
		}
	}
	
	public int consultarEspacio() {
		int espacios = 0;
		for (int i = 0; i < registros.length; i++) {
			if(registros[i] == null) {
				espacios++;
			}
		}
		return espacios;
	}
	
	public void buscarOficina(String codigo) {
		// Si existe la oficina, muestra la cantidad de empleados, sino muestra error
		boolean encontrada = false;
		int i = 0;
		while (!encontrada && i < registros.length) {
			if (registros[i] != null && registros[i].getCodigoOficina().equals(codigo)) {
				encontrada = true;
				System.out.println("Esta oficina tiene: " + registros[i].getNumeroEmpleados() + " empleados.");
			}
			i++;
		}
		if (!encontrada) {
			System.out.println("Error: la sede que estás buscando no se encuentra registrada en el sistema.");
		}	
	}
	
	public void eliminarOficina(String codigo) {
		// al eliminar, no deben quedar huecos, es por ello, que si encuentro la oficina la pongo a null
		boolean encontrada = false;
		int i = 0;
		while (!encontrada && i < registros.length) {
			if (registros[i] != null && registros[i].getCodigoOficina().equals(codigo)) {
				registros[i] = null;
				encontrada = true;
				System.out.println("Oficina eliminada correctamente.");
			}
			i++;
		}
		if (!encontrada) {
			System.out.println("No se puede eliminar ya que esa oficina no está en los registros.");
		}
	}
	
	public int calcularEmpleadosTotal() {
		// creo un contador para que vaya acumulando los empleados de todas las oficinas
		int totalEmpleados = 0 ;
		for (int i = 0; i < registros.length; i++) {
			if (registros[i] != null) {
				totalEmpleados += registros[i].getNumeroEmpleados();
			}
		}
		return totalEmpleados;
	}
	
}