package ejercicio02_03;

public class CajaCarton extends Caja {
	
	public CajaCarton(int ancho, int alto, int fondo, String unidad) {
		super(ancho, alto, fondo, unidad);
	}

	@Override // necesitamos modificar el metodo del padre
	public double getVolumen() {
		if(super.getUnidad().equals("m")) {
			return super.getVolumen()*1000000*0.8;
		}
		return super.getVolumen()*0.8;
	}
	
	public double calcularSuperficie() {
		double cara1 = super.getAlto()*super.getAncho()*2;
		double cara2 = super.getFondo()*super.getAncho()*2;
		double cara3 = super.getFondo()*super.getAlto()*2;
		return cara1+cara2+cara3;
	}
}