package cartes;

public class Parade extends Bataille {

	public Parade(int n, Type t) {
		super(n, t);
	}

	@Override
	public String toString() {

		String nom = "";
		
		switch(getType()) {
			case FEU:
				nom = " FeuVert";
				break;
			
			case ESSENCE:
				nom = " Essence";
				break;
				
			case CREVAISON:
				nom = " RoueDeSecours";
				break;
				
			case ACCIDENT:
				nom = " Reparation";
				break;
				
		}

		return nom;
	}

	public boolean equals(Object o) {
		if (o instanceof Parade) {
			Parade parade = (Parade) o;
			return getType().equals(parade.getType());
		}
		return false;
	}

}
