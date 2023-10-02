package testsFonctionnels;
import cartes.*;
import cartes.Probleme.Type;
import jeu.*;

public class Test {

	public static void main(String[] args) {
		Sabot sabot = new Sabot();
		sabot.ajouterFamilleCarte(new Attaque(3, Type.ACCIDENT), new Parade(3, Type.ACCIDENT),  new Botte(1, Type.ACCIDENT));
		for (int i = 0; i < 7; i++) {
			sabot.piocher();
		}
	}

}
