package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
        for (int i = 0; i < matrise.length; i++) {
            for (int j = 0; j < matrise[i].length; j++) {
                System.out.println(matrise[i][j]);
            }
        }
    }

	// b)
	public static String tilStreng(int[][] matrise) {
        String streng = "";

        for (int i = 0; i < matrise.length; i++) {
            for (int j = 0; j < matrise[i].length; j++) {
                streng += matrise[i][j];
                if (j < matrise[i].length -1){
                    streng += " ";
                }
            }
            streng += " \n";
        }
        return streng;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
        int[][] nyMatrise = new int[matrise.length][];


        for (int i = 0; i < matrise.length; i++) {
            nyMatrise[i] = new int[matrise[i].length];

            for (int j = 0; j < matrise[i].length; j++) {
                nyMatrise[i][j] = matrise[i][j] * tall;
            }
        }
        return nyMatrise;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
        boolean status = false;
        if (a.length == b.length){
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    if (a[i][j] == b[i][j]){
                        status = true;
                    }
                }
            }
        }
        return status;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO

		throw new UnsupportedOperationException("Metoden speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");
	
	}
}