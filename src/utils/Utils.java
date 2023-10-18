package utils;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class Utils<E> {

	public E extraire(List<E> liste) {
		Random rand = new Random();
		int index = rand.nextInt(liste.size());
		E e = liste.get(index);
		liste.remove(index);
		return e; 
		
	}
	
	public E extraireV2(List<E> liste) {
		Random rand = new Random();
		int index = rand.nextInt(liste.size());
		E e = liste.get(0);
		for (ListIterator<E> it = liste.listIterator(); !it.hasNext() || it.nextIndex() > index;) {
			e = it.next();
		}
		liste.remove(e);
		return e; 
	}
	
	public List<E> melanger(List<E> liste){
		int size = liste.size();
		List<E> listeMelanger = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			listeMelanger.add(extraire(liste));
		}
		return listeMelanger;
	}
	
}
