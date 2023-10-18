package testsFonctionnels;

import java.util.Iterator;
import cartes.*;
import cartes.Probleme.Type;
import jeu.*;

public class Test {

	public static void main(String[] args) {
		Sabot sabot = new Sabot();
		sabot.ajouterFamilleCarte(new Attaque(3, Type.ACCIDENT), new Parade(3, Type.ACCIDENT),
				new Botte(1, Type.ACCIDENT));
		/*
		 * int nb = sabot.getNbCartes(); 
		 * for (int i = 0; i < nb; i++) { 
		 * 	sabot.piocher();
		 * }
		 */
		for (Iterator<Carte> it = sabot.iterator(); it.hasNext();) {
			Carte c = it.next();
			System.out.println("Je pioche" + c.toString());
			it.remove();
			sabot.ajouterCarte(new Attaque(3, Type.ACCIDENT));
		}

	}

}
