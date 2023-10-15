package cartes;

import cartes.Probleme.Type;
import java.util.List;
import java.util.ArrayList;


public class JeuDeCartes {
	
	private Carte[] typesDeCartes = {new Borne(10,25), new Borne(10,50),
			new Borne(10,75), new Borne(12,100), new Borne(10,25), 
			new Botte(1, Type.FEU), new Botte(1, Type.ESSENCE),
			new Botte(1, Type.CREVAISON), new Botte(1, Type.ACCIDENT),
			new Parade(14, Type.FEU), new Parade(6, Type.ESSENCE),
			new Parade(6, Type.CREVAISON), new Parade(6, Type.ACCIDENT),
			new Attaque(5, Type.FEU), new Attaque(3, Type.ESSENCE),
			new Attaque(3, Type.CREVAISON), new Attaque(3, Type.ACCIDENT),
			new DebutLimite(4), new FinLimite(6)};
	
	
	public JeuDeCartes() {
		List<Carte> listeCartes = new ArrayList<>();
	}
	
}
