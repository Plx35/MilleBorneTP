package jeu;
import cartes.*;


public class Sabot {
	
	private Carte[] paquet;
	private int nbCartes;
	
	public Sabot() {
		this.paquet = new Carte[110];
	}

	public int getNbCartes() {
		return nbCartes;
	}

	public Carte[] getPaquet() {
		return paquet;
	}
	
	public void estVide() {
		if (nbCartes == 0) {
			System.out.println("Le paquet est vide");
		}
	}
	
	public void ajouterCarte(Carte c) throws IllegalStateException {
		if (nbCartes == paquet.length) {
			throw new IllegalStateException();
		}
		paquet[nbCartes] = c;
		nbCartes++;
	}
	
	/*public void ajouterFamilleCarte(Carte c) {
		for(int i = 0; i < c.getNombre(); i++) {
			ajouterCarte(c);
		}
	}*/
	
	public void ajouterFamilleCarte(Carte[] c) {
		for(int i = 0; i < c.length; i++) {
			for(int j = 0; j < c[i].getNombre(); j++) {
				ajouterCarte(c[i]);
			}
		}
	}
	
}
