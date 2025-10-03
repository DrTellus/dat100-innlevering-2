package no.hvl.dat100.matriser;

public class Matriser {

    // a)
    public static void skrivUt(int[][] matrise) {
        for (int i = 0; i < matrise.length; i++) {
            for (int j = 0; j < matrise[i].length; j++) {
                System.out.print(matrise[i][j] + " ");

            }
            System.out.println();
        }


    }

    // b)
    public static String tilStreng(int[][] matrise) {
        String tekst = "";


        for (int i = 0; i < matrise.length; i++) {
            for (int j = 0; j < matrise[i].length; j++) {
                tekst = tekst + matrise[i][j] + " ";
            }
            tekst = tekst + "\n";
        }
        return tekst;
    }


    // c)
    public static int[][] skaler(int tall, int[][] matrise) {
        int rader = matrise.length;

        int kolonner = matrise[0].length;

        int ny[][] = new int[rader][kolonner];

        for (int i = 0; i < rader; i++) {
            for (int j = 0; j < kolonner; j++) {
                ny[i][j] = matrise[i][j] * tall;
            }

        } return ny;
    }


// d)
public static boolean erLik(int[][] a, int[][] b) {
    if (a.length != b.length) {
        return false;
    }
    for (int i = 0; i < a.length; i++) {
        if (a[i].length != b[i].length) {
            return false;
        }
        for (int j = 0; j < a[i].length; j++) {
            if (a[i][j] != b[i][j]) {
                return false;
            }

        }


    }return true;
}






    // e)
    public static int[][] speile(int[][] matrise) {
        int[][] nyMatrise = new int[matrise.length][];

//        for (int i = 0; i < nyMatrise.length; i++) {
//            nyMatrise[i] = new int[matrise[i].length];
//            int k = 0;
//
//            for (int j = nyMatrise[i].length - 1; j >= 0 ; j--) {
//                nyMatrise[i][k] = matrise[i][j];
//                k++;
//            }
//        }

        for (int i = 0; i < nyMatrise.length; i++) {
            nyMatrise[i] = new int[matrise[i].length];
            for (int j = 0; j < nyMatrise[i].length; j++) {
                nyMatrise[i][j] = matrise[j][i];

            }

        }
        return nyMatrise;
    }
}

