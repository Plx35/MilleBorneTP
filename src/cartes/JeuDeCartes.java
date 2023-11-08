package cartes;

import cartes.Probleme.Type;
import utils.Utils;

import java.util.List;
import java.util.ArrayList;

public class JeuDeCartes {

	private Carte[] typesDeCartes = { new Borne(10, 25), new Borne(10, 50), new Borne(10, 75), new Borne(12, 100),
			new Borne(4, 200), new Botte(1, Type.FEU), new Botte(1, Type.ESSENCE), new Botte(1, Type.CREVAISON),
			new Botte(1, Type.ACCIDENT), new Parade(14, Type.FEU), new Parade(6, Type.ESSENCE),
			new Parade(6, Type.CREVAISON), new Parade(6, Type.ACCIDENT), new Attaque(5, Type.FEU),
			new Attaque(3, Type.ESSENCE), new Attaque(3, Type.CREVAISON), new Attaque(3, Type.ACCIDENT),
			new DebutLimite(4), new FinLimite(6) };

	private List<Carte> listeCartes = new ArrayList<>();
	
	
	public JeuDeCartes() {
		for (Carte c : typesDeCartes) {
			for (int i = 0; i < c.getNombre(); i++) {
				listeCartes.add(c);
			}
		}
		listeCartes = Utils.melanger(listeCartes);
	}

	public List<Carte> getListeCartes() {
		return listeCartes;
	}
	
	public Carte[] getTypeCarte() {
		return typesDeCartes;
	}
	
	public boolean checkCount() {
		if (listeCartes.size() != 106) {
			return false;
		}
		
		for (Carte c : typesDeCartes) {
			int nb = 0;
			for (int i = 0; i < listeCartes.size(); i++) {
				if (c.equals(listeCartes.get(i))) {
					nb++;
				}
			}
			if (nb != c.getNombre()) {
				return false;
			}
		}
		
		return true;
	}

}
