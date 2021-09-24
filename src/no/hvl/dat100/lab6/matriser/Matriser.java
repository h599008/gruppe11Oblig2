package no.hvl.dat100.lab6.matriser;

public class Matriser {

	public static void main(String[] args) {
		final int tall = 2;
		int[][] a = { {1,2,3}, {4,5,2,}, {1,2,3}, {4,5,6} };
		int[][] b = { {1,2,3}, {4,5,6,}, {1,2,3}, {4,5,6} };

	}	
	
	// a)
	public static void skrivUt(int[][] matrise) {
		for (int[] i: matrise) {
			for (int a: i) {
				System.out.print(a + "\t");
			}
			// Newline
			System.out.println();
		}
		//throw new UnsupportedOperationException("skrivUt ikke implementert");
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String string = "";
		for (int[] i: matrise) {
			for (int a: i) {
				string += a;
			}
			string += " \n";
		}
		return string;
		//throw new UnsupportedOperationException("tilStreng ikke implementert");
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int[][] nyMatrise = new int[matrise.length][];
		for (int i=0; i < matrise.length; i++) {
			nyMatrise[i] = new int[matrise[i].length];
			for (int a=0;a < matrise[i].length; a++) {
				nyMatrise[i][a] = matrise[i][a] * tall;
			}
		}
		// Kun for å printe ut nyMatrise
		for (int[] i: nyMatrise) {
			for (int a: i) {
				System.out.print(a + "\t");
			}
			//Newline
			System.out.println();
		}
		
		return nyMatrise;
		//throw new UnsupportedOperationException("skaler ikke implementert");
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		String stringA = "";
		String stringB = "";
		
		// Looper gjennom a
		for (int[] i: a) {
			for (int f: i) {
				// Legger til elementene i stringA strengen.
				stringA += f;
			}
		}
		// Looper gjennom b
		for (int[] i: b) {
			for (int f: i) {
				// Legger til elementene i stringB strengen.
				stringB += f;
			}
		}
		// Sjekker om stringen av a og stringen av b er like.
		if (stringA.equals(stringB)) {
			return true;
		} else {
			return false;
		}
		//throw new UnsupportedOperationException("erLik ikke implementert");
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}
}
