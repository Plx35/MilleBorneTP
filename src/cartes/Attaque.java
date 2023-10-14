package cartes;

public class Attaque extends Bataille{
	
	public Attaque(int n, Type t) {
		super(n, t);
	}
	
	@Override
	public String toString() {
		
		String nom;
		
		if (getType() == Type.FEU) {
			nom = " FeuRouge";
		}
		
		else if (getType() == Type.ESSENCE) {
			nom = " Panne";
		}
		else if (getType() == Type.CREVAISON) {
			nom = " Crevaison";
		}
		
		else {
			nom = " Accident";
		}
		
		return nom;
	}
	
}
