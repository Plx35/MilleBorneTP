package cartes;

public class Borne extends Carte {

	private int km;

	public Borne(int nombre, int km) {
		super(nombre);
		this.km = km;
	}

	public int getKm() {
		return km;
	}

	@Override
	public String toString() {
		return "Borne [" + km + "]";
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Borne) {
			Borne borne = (Borne) o;
			return km == borne.km;
		}
		return false;
	}

}
