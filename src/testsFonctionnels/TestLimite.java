package testsFonctionnels;

import java.util.List;
import java.util.Set;

import cartes.*;
import cartes.Probleme.Type;
import jeu.*;

public class TestLimite {

	public static void main(String[] args) {
		Joueur joueur = new Joueur("j1");
		List<Limite> lims = joueur.getLimites();
		Set<Botte> botts = joueur.getBottes();
		Botte b1 = new Botte(1, Type.FEU);
		DebutLimite deb1 = new DebutLimite(1);
		FinLimite Fin1 = new FinLimite(1);
		botts.add(b1);
		lims.add(deb1);
		System.out.println(joueur.getLimite());
		botts.remove(b1);
		System.out.println(joueur.getLimite());
		joueur.getLimites().add(Fin1);
		System.out.println(joueur.getLimite());
		DebutLimite deb2 = new DebutLimite(1);
		FinLimite Fin2 = new FinLimite(1);
		lims.add(deb2);
		System.out.println(joueur.getLimite());
		lims.add(Fin2);
		System.out.println(joueur.getLimite());
		
	}

}
