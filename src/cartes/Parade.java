package cartes;

public class Parade extends Bataille{
	
	public Parade(int n, Type t){
		super(n, t);
	}
	
	@Override
	public String toString() {
		
		String nom;
		
		if (getType() == Type.FEU) {
			nom = " FeuVert";
		}
		
		else if (getType() == Type.ESSENCE) {
			nom = " Essence";
		}
		else if (getType() == Type.CREVAISON) {
			nom = " RoueDeSecours";
		}
		
		else {
			nom = " Reparation";
		}
		
		return nom;
	}
	
}
