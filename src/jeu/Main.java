package jeu;

import cartes.*;

public interface Main extends Iterable<Carte>{
	
	public void prendre(Carte c);
	public void jouer(Carte c);
}
