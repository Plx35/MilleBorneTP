package cartes;

public class Botte extends Probleme{
	
	public Botte(int n, Type t) {
		super(n, t);
	}

	@Override
	public String toString() {
		String nom;
		if (getType() == Type.FEU) {
			nom = "VéhiculePrioritaire";
		}
		
		else if (getType() == Type.ESSENCE) {
			nom = "Citerne";
		}
		else if (getType() == Type.CREVAISON) {
			nom = "Increvable";
		}
		
		else {
			nom = "AsDuVolant";
		}
		
		return "Botte [" + nom + "]";
	}
	
}
