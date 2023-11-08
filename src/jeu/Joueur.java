package jeu;

import java.util.NavigableSet;
import java.util.Objects;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import cartes.*;

public class Joueur {
	
	
	private List<Limite> limites = new ArrayList<>();
	private List<Bataille> batailles = new ArrayList<>();
	private List<Borne> bornes = new ArrayList<>();
	private NavigableSet<Botte> bottes = 
			new TreeSet<>(
					new Comparator<Botte>() {
						public int compare(Botte b1, Botte b2) {
							String nomB1 = b1.toString();
							String nomB2 =b2.toString();
							return nomB1.compareTo(nomB2);
						}
					}
			);
	private String nom;
	
	public Joueur(String nom) {
		this.nom = nom;
	}
	
	public List<Limite> getLimite() {
		return limites;
	}
	
	public List<Bataille> getBataille() {
		return batailles;
	}
	
	public List<Borne> getBorne() {
		return bornes;
	}

	public NavigableSet<Botte> getBottes() {
		return bottes;
	}

	public String getNom() {
		return nom;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Joueur) {
			Joueur joueur = (Joueur) obj;
			return getNom().equals(joueur.getNom());
		}
		return false;
	}

	@Override
	public String toString() {
		return "Joueur [nom=" + nom + "]";
	}
}
