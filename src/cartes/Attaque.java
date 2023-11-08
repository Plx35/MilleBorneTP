package cartes;

public class Attaque extends Bataille {

	public Attaque(int nombre, Type type) {
		super(nombre, type);
	}

	@Override
	public String toString() {

		String nom = "";

		switch(getType()) {
			case FEU:
				nom = " FeuRouge";
				break;
				
			case ESSENCE:
				nom = " Panne";
				break;
			
			case CREVAISON:
				nom = " Crevaison";
				break;
				
			case ACCIDENT:
				nom = " Accident";
				break;

		}
		return nom;
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Attaque attaque) {
			return getType().equals(attaque.getType());
		}
		return false;
	}

}
