package jeu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import cartes.*;

public class MainAsListe implements Main{
	
	List<Carte> main = new ArrayList<>();
	
	public void prendre(Carte c) {
		main.add(c);
	}
	
	public void jouer(Carte c) {
		if(!main.contains(c)) {
			throw new IllegalArgumentException();
		}
		main.remove(c);
	}
	
	public Iterator<Carte> iterator() {
		return main.iterator();
	}

}
