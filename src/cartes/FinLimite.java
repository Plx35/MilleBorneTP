package cartes;

public class FinLimite extends Limite{
	
	public FinLimite(int n) {
		super(n);
	}
	@Override
	public String toString() {
		return " FinLimite";
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Limite) {
			Limite limite = (Limite) o;
			return toString().equals(limite.toString());
		}
		return false;
	}
	
}
