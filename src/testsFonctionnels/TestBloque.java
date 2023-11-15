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
		
		Attaque a1 = new Attaque(1, Type.FEU);
		Attaque a2 = new Attaque(1, Type.ACCIDENT);
		Attaque a3 = new Attaque(1, Type.ESSENCE);
		Parade p1 = new Parade(1, Type.FEU);
		Parade p2 = new Parade(1, Type.ESSENCE);
		Botte b1 = new Botte(1, Type.FEU);
		Botte b2 = new Botte(1, Type.ACCIDENT);
		
		System.out.println(joueur.estBloque());
		batailles.add(p1);
		System.out.println(joueur.estBloque());
		batailles.add(a1);
		System.out.println(joueur.estBloque());
		bottes.add(b1);
		System.out.println(joueur.estBloque());
		batailles.add(a2);
		System.out.println(joueur.estBloque());
		bottes.add(b2);
		System.out.println(joueur.estBloque());
		batailles.add(a3);
		System.out.println(joueur.estBloque());
		batailles.add(p2);
		System.out.println(joueur.estBloque());
				

	}

}
