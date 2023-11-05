package utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class Utils<E> {

	public static <E> E extraire(List<E> liste) {
		Random rand = new Random();
		int index = rand.nextInt(liste.size());
		E e = liste.get(index);
		liste.remove(index);
		return e; 
		
	}
	
	public static <E> E extraireV2(List<E> liste) {
		Random rand = new Random();
		int index = rand.nextInt(liste.size());
		E e = liste.get(0);
		for (ListIterator<E> it = liste.listIterator(); !it.hasNext() || it.nextIndex() > index;) {
			e = it.next();
		}
		liste.remove(e);
		return e; 
	}
	
	public static <E> List<E> melanger(List<E> liste){
		int size = liste.size();
		List<E> listeMelanger = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			listeMelanger.add(extraire(liste));
		}
		return listeMelanger;
	}
	
	public static <E> boolean verifierMelange(List<E> liste1, List<E> liste2) {
		for(int i = 0; i < liste1.size(); i++) {
			if (Collections.frequency(liste2, liste1.get(i)) 
					!= Collections.frequency(liste1, liste1.get(i))) {
				return false;
			}
			
		}
		return true;
	}
	
	public static <E> List<E> rassembler(List<E> liste) {
		List<E> liste2 = new ArrayList<>();
		for(int i = 0; i < liste.size(); i++) {
			E elem = liste.get(i);
			if(!liste2.contains(elem)) {
				int num = Collections.frequency(liste, elem);
				for(int j = 0; j < num; j++) {
					liste2.add(elem);
				}
			}
		}
		return liste2;
	}
	
	public static <E> boolean verifierRassemblement(List<E> liste) {
		return liste.equals(rassembler(liste));
	}
	
	
}
