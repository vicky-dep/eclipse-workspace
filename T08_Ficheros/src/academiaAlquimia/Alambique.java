package academiaAlquimia;

import java.util.ArrayList;

public class Alambique {

	private ArrayList<Pocima> pocimas;

	public Alambique() {
		pocimas = new ArrayList<Pocima>();
	}
	public Alambique(ArrayList<Pocima> pocimas) {
		super();
		this.pocimas = pocimas;
	}
	
	public ArrayList<Pocima> getPocimas() {
		return pocimas;
	}
	public void setPocimas(ArrayList<Pocima> pocimas) {
		this.pocimas = pocimas;
	}
	@Override
	public String toString() {
		return "Alambique [pocimas=" + pocimas + "]";
	}

	public void addPocima(Pocima p) {
		pocimas.add(p);
	}
}