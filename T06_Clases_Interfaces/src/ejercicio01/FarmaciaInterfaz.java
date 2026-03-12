package ejercicio01;

public interface FarmaciaInterfaz {

	// Los metodos de la interfaz van sin el public
	
	int cuantosJarabesCaducados(String fechaActual);
	
	boolean comprarTiritas(ProductosFarmaceuticos e);
	
	boolean modificarPrecio(ProductosFarmaceuticos o, float precio);
	
	boolean modificarCantidad(ProductosFarmaceuticos o,int cantidadNueva);

}