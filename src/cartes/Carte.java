package cartes;

public abstract class Carte {

	private int nombre;

	protected Carte(int nombre) {
		super();
		this.nombre = nombre;
	}

	public int getNombre() {
		return nombre;
	}
	
	@Override
	public boolean equals(Object o) {
		return o != null && o.getClass() == getClass(); 
	}
	

}
