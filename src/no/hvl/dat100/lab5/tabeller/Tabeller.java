package no.hvl.dat100.lab5.tabeller;
import java.util.*;

public class Tabeller {
	public static void main(String[] args) {
		
		int[] tabellMedHeltall = {1, 2, 3, 4, 5, 8, 7};
		System.out.println(erSortert(tabellMedHeltall));
	}
	
	
	// a)
	public static void skrivUt(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("skrivUt ikke implementert");

	}

	// b)
	public static String tilStreng(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("tilStreng ikke implementert");
		
	}
	
	
	// c)
	public static int summerFor (int[] tabell) {
		int sum = 0;
		for (int i = 0; i<tabell.length; i++) {
			sum+=tabell[i];
		}
		
		return sum;
		//throw new UnsupportedOperationException("summer ikke implementert");
	}

	public static int summerWhile(int[] tabell) {
		int sum = 0;
		int i = 0;
		while (tabell.length > i) {
			sum+=tabell[i];
			i++;
		}
		
		return sum;
		//throw new UnsupportedOperationException("summer ikke implementert");
	}
	
	public static int summerExtFor(int[] tabell) {
		int sum = 0;
		for (int tall: tabell) {
			sum += tall;
		}
		
		return sum;
		//throw new UnsupportedOperationException("summer ikke implementert");
	}

	

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		for (int tall1: tabell) {
			if (tall1 == tall) {
				return true;
			} 
		}
		
		return false;
		
		//throw new UnsupportedOperationException("finnesTall ikke implementert");
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		int index = 0;
		for (int i = 0; i<tabell.length; i++) {
			if (tabell[i] == tall) {
				index = i;
				break;
			}
		}
		return index;
		//throw new UnsupportedOperationException("posisjonTall ikke implementert");
	}

	// f)
	public static int[] reverser(int[] tabell) {
		throw new UnsupportedOperationException("reverser ikke implementert");
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		for (int i = 0; i<tabell.length-1; i++) {
			if (tabell[i] > tabell[i+1]) {
				return false;
			}
		}

		return true;
//		throw new UnsupportedOperationException("erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		throw new UnsupportedOperationException("settSammen ikke implementert");
	}
}
