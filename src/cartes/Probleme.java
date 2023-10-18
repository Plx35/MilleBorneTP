package cartes;

public abstract class Probleme extends Carte {

	public enum Type {
		FEU, ESSENCE, CREVAISON, ACCIDENT
	};

	private Type type;

	public Probleme(int n, Type t) {
		super(n);
		this.type = t;
	}

	public Type getType() {
		return type;
	}

}
