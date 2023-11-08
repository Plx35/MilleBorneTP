package testsFonctionnels;

import jeu.*;
import cartes.Carte.*;
import java.util.List;
import cartes.Borne;

public class TestKm {

	public static void main(String[] args) {
		Joueur joueur = new Joueur("J1");
		System.out.println(joueur.getKM());
		Borne b1 = new Borne(1, 100);
		List<Borne> bornes = joueur.getBornes();
		bornes.add(b1);
		System.out.println(joueur.getKM());
		Borne b2 = new Borne(1, 100);
		Borne b3 = new Borne(1, 25);
		bornes.add(b2);
		bornes.add(b3);
		System.out.println(joueur.getKM());
	}

}
