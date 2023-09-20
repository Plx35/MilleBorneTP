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
	
	
	
}
