package jeu;

import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import cartes.*;
import cartes.Probleme.Type;

public class Joueur {
	
	
	private List<Limite> limites = new ArrayList<>();
	private List<Bataille> batailles = new ArrayList<>();
	private List<Borne> bornes = new ArrayList<>();
	private Set<Botte> bottes = new HashSet<>();
	private String nom;
	private MainAsListe mainJoueur = new MainAsListe();
	
	public Joueur(String nom) {
		this.nom = nom;
	}
	
	public List<Limite> getLimites() {
		return limites;
	}
	
	public List<Bataille> getBatailles() {
		return batailles;
	}
	
	public List<Borne> getBornes() {
		return bornes;
	}

	public Set<Botte> getBottes() {
		return bottes;
	}

	public String getNom() {
		return nom;
	}

	public MainAsListe getMainJoueur() {
		return mainJoueur;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Joueur joueur) {
			return getNom().equals(joueur.getNom());
		}
		return false;
	}

	@Override
	public String toString() {
		return "Joueur [nom=" + nom + "]";
	}
	
	public void donner(Carte c) {
		mainJoueur.main.add(c);
	}
	
	public Carte prendreCarte(List<Carte> sabot) {
		if(sabot.isEmpty()) {
			return null;
		}
		Carte c = sabot.get(sabot.size() - 1);
		sabot.remove(c);
		donner(c);
		return c;
	}
	
	public int getKM() {
		int km = 0;
		for(Borne borne : bornes) {
			km += borne.getKm();
		}
		return km; 
	}
	
	public int getLimite() {
		int limite = 200;
		
		if(!bottes.isEmpty()) {
			for(Botte b : bottes) {
				if(b.getType() == Type.FEU) {
					return limite;
				}
			}
		}
		
		else if(!limites.isEmpty()) {
			if (limites.get(limites.size() - 1) instanceof DebutLimite) {
				limite = 50;
			}
		}
		return limite;
	}
	
	public boolean estBloque() {
		Bataille sommet;
		Botte Prioritaire = new Botte(1, Type.FEU);
		Attaque feuRouge = new Attaque(1, Type.FEU);
		Parade feuVert = new Parade(1, Type.FEU);
		boolean isPrioritaire = bottes.contains(Prioritaire);
		if(batailles.isEmpty() && isPrioritaire) {
			return false;
		}
		
		else if(!batailles.isEmpty()) {
			sommet = batailles.get(batailles.size() - 1);
			Botte botteSommet = new Botte(1, sommet.getType());
			if(sommet.equals(feuVert)) {
				return false;
			}
			
			if(isPrioritaire) {
				if(sommet.equals(feuRouge)) {
					return false;
				}
				
				else if(sommet instanceof Parade) {
					return false;
				}
				
				else if(sommet instanceof Attaque && bottes.contains(botteSommet)) {
					return false;
				}
			}
			
		}
		
		
		
		return true;
	}
	
	
	
}
