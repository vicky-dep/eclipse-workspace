package DAOs;

public class Oficina {

	/*
	 * oficina int PK 
ciudad varchar(30) 
superficie int 
ventas decimal
	 */
	private int oficina;
	private String ciudad;
	private int superficie;
	private float ventas;
	
	public int getOficina() {
		return oficina;
	}
	public void setOficina(int oficina) {
		this.oficina = oficina;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public int getSuperficie() {
		return superficie;
	}
	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}
	public float getVentas() {
		return ventas;
	}
	public void setVentas(float ventas) {
		this.ventas = ventas;
	}
	public Oficina(int oficina, String ciudad, int superficie, float ventas) {
		super();
		this.oficina = oficina;
		this.ciudad = ciudad;
		this.superficie = superficie;
		this.ventas = ventas;
	}
	public Oficina() {
		super();
	}
	@Override
	public String toString() {
		return "Oficina [oficina=" + oficina + ", ciudad=" + ciudad + ", superficie=" + superficie + ", ventas="
				+ ventas + "]";
	}

}