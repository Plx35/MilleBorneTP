package cartes;

public class DebutLimite extends Limite {

	public DebutLimite(int nombre) {
		super(nombre);
	}

	@Override
	public String toString() {
		return " DebutLimite";
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Limite) {
			Limite limite = (Limite) o;
			return toString().equals(limite.toString());
		}
		return false;
	}

}
