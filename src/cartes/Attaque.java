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
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Attaque) {
			Attaque attaque = (Attaque) o;
			return getType().equals(attaque.getType());
		}
		return false;
	}
	
}
