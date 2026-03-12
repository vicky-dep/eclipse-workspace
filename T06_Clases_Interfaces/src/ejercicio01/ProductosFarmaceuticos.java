package ejercicio01;

public class ProductosFarmaceuticos {

	private String id;

	public ProductosFarmaceuticos() {
		super();
	}
	public ProductosFarmaceuticos(String id) {
		super();
		this.id = id;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "ProductosFarmaceuticos [id=" + id + "]";
	}
	
}