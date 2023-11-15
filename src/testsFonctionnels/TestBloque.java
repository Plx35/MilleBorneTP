package testsFonctionnels;

import java.util.List;
import java.util.Set;

import cartes.*;
import cartes.Probleme.Type;
import jeu.Joueur;

public class TestBloque {

	public static void main(String[] args) {
		Joueur joueur = new Joueur("J1");
		List<Bataille> batailles = joueur.getBatailles();
		Set<Botte> bottes = joueur.getBottes();
		
		Attaque feuRouge = new Attaque(1, Type.FEU);
		Attaque accident = new Attaque(1, Type.ACCIDENT);
		Attaque panneEssence = new Attaque(1, Type.ESSENCE);
		Parade feuVert = new Parade(1, Type.FEU);
		Parade essence = new Parade(1, Type.ESSENCE);
		Botte vehiculePrio = new Botte(1, Type.FEU);
		Botte asDuVolant = new Botte(1, Type.ACCIDENT);
		
		System.out.println(joueur.estBloque());
		batailles.add(feuVert);
		System.out.println(joueur.estBloque());
		batailles.add(feuRouge);
		System.out.println(joueur.estBloque());
		bottes.add(vehiculePrio);
		System.out.println(joueur.estBloque());
		batailles.add(accident);
		System.out.println(joueur.estBloque());
		bottes.add(asDuVolant);
		System.out.println(joueur.estBloque());
		batailles.add(panneEssence);
		System.out.println(joueur.estBloque());
		batailles.add(essence);
		System.out.println(joueur.estBloque());
				

	}

}
