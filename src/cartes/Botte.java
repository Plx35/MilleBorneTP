package cartes;

public class Botte extends Probleme {

	public Botte(int nombre, Type type) {
		super(nombre, type);
	}

	@Override
	public String toString() {
		String nom;
		if (getType() == Type.FEU) {
			nom = "VehiculePrioritaire";
		}

		else if (getType() == Type.ESSENCE) {
			nom = " Citerne";
		} else if (getType() == Type.CREVAISON) {
			nom = " Increvable";
		}

		else {
			nom = " AsDuVolant";
		}

		return nom;
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Botte) {
			Botte botte = (Botte) o;
			return getType().equals(botte.getType());
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return super.getType().hashCode()*31;
	}

}
