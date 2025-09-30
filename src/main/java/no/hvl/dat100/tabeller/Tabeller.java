package no.hvl.dat100.tabeller;

import java.util.Arrays;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
        for (int i = 0; i < tabell.length; i++) {
            System.out.println(tabell[i]);
        }
	}

	// b)
	public static String tilStreng(int[] tabell) {
        String streng = "[";

        for (int i = 0; i < tabell.length; i++) {
            streng += tabell[i];
            if (i < tabell.length-1){
                streng += ",";
            }
        }
        streng += "]";

        return streng;
	}


	// c)
	public static int summer(int[] tabell) {
        int sum = 0;

        for (int i = 0; i < tabell.length; i++) {
            sum += tabell[i];
        }
        return sum;
    }

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
        int leteTall = tall;
        boolean status = false;

        for (int i = 0; i < tabell.length; i++) {
            if (tall == tabell[i]) {
                status = true;
            }
        }
        return status;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
        int index = -1;

        for (int i = 0; i < tabell.length; i++) {
            if (tall == tabell[i]){
                index = i;
                break;
            }
        }
        return index;

	}

	// f)
	public static int[] reverser(int[] tabell) {
        int[] nyTabell = new int[tabell.length];
        int j = 0;


        for (int i = tabell.length - 1; i >= 0; i--) {
            nyTabell[j] = tabell[i];
            j++;
        }

        return nyTabell;
    }

	// g)
	public static boolean erSortert(int[] tabell) {
        for (int i = 0; i < tabell.length - 1; i++) {
            if (tabell[i] > tabell[i + 1]){
                return false;
            }
        }
        return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
        int sammenLengde = tabell1.length + tabell2.length;
        int[] sammenTabell = new int[sammenLengde];

        for (int i = 0; i < tabell1.length; i++) {
            sammenTabell[i] = tabell1[i];
        }

        int j = 0;
        for (int i = tabell1.length; i < sammenLengde; i++) {
            sammenTabell[i] = tabell2[j];
            j++;
        }

            return sammenTabell;

	}
}