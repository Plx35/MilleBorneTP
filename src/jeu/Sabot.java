package jeu;

import java.util.Iterator;
import java.util.*;

import cartes.*;

public class Sabot implements Iterable<Carte> {

	private Carte[] paquet;
	private int nbCartes;
	private int nombreOperations = 0;

	public Sabot() {
		this.paquet = new Carte[110];
	}

	public int getNbCartes() {
		return nbCartes;
	}

	public class Iter implements Iterator<Carte> {

		private int indiceIter;
		private boolean nextEffectue = false;
		private int nombreOperationsReference = nombreOperations;

		@Override
		public boolean hasNext() {
			return indiceIter < nbCartes;
		}

		@Override
		public Carte next() {
			if (hasNext()) {
				Carte cartes = paquet[indiceIter];
				indiceIter++;
				nextEffectue = true;
				return cartes;
			} else {
				throw new NoSuchElementException();
			}
		}

		@Override
		public void remove() {
			verificationConcurrence();
			if (nbCartes < 1 || !nextEffectue) {
				throw new IllegalStateException();
			}
			for (int i = indiceIter - 1; i < nbCartes - 1; i++) {
				paquet[i] = paquet[i + 1];
			}
			nextEffectue = false;
			indiceIter--;
			nbCartes--;
			nombreOperations++;
			nombreOperationsReference++;
		}

		private void verificationConcurrence() {
			if (nombreOperations != nombreOperationsReference)
				throw new ConcurrentModificationException();
		}

	}

	@Override
	public Iterator<Carte> iterator() {
		return new Iter();
	}

	public void estVide() {
		if (nbCartes == 0) {
			System.out.println("Le paquet est vide");
		}
	}

	public void ajouterCarte(Carte c) throws IllegalStateException {
		if (nbCartes == paquet.length) {
			throw new IllegalStateException();
		}
		paquet[nbCartes] = c;
		nbCartes++;
		nombreOperations++;
	}

	/*
	 * public void ajouterFamilleCarte(Carte c) { for(int i = 0; i < c.getNombre();
	 * i++) { ajouterCarte(c); } }
	 */

	public void ajouterFamilleCarte(Carte... c) {
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].getNombre(); j++) {
				ajouterCarte(c[i]);
			}
		}
	}

	public Carte piocher() {
		Iter it = new Iter();
		if (it.hasNext()) {
			Carte carte = it.next();
			it.remove();
			System.out.println("Je pioche " + carte.toString());
			return carte;
		}
		throw new NoSuchElementException();
	}

}
