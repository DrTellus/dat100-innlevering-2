package no.hvl.dat100.tabeller;

public class Tabeller {

	// a) Jeg tester
	public static void skrivUt(int[] tabell) {
        for (int i = 0; i < tabell.length; i++) {
            System.out.print(tabell[i] + " ");
        }

	}

	// b)
	public static String tilStreng(int[] tabell) {
        String tekst = "[";//initialiserer teksten som [

        for (int i = 0; i < tabell.length; i++) {//lager forløkke der
            tekst = tekst + tabell[i]; //teksten legger til tabellen
            if (i < tabell.length -1) {// for alle elementer i tabellen unntatt den siste
                tekst = tekst + ",";//legg til komma etter
            }
        }
        tekst = tekst + "]"; // legger til ] etter tekst
        return tekst; //returnerer ferdig tekst

    }

	// c)
	public static int summer(int[] tabell) {
        int sum = 0; //initialiserer sum til 0
        for (int i = 0; i<tabell.length; i++) {//lager forløkke der..
            sum = sum + tabell[i];//summen øker med hver instans av i
        }
        return sum; //returnerer summen av alle elementene

	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("Metoden finnesTall ikke implementert");

	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("Metoden posisjonTall ikke implementert");
	}

	// f)
	public static int[] reverser(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden reverser ikke implementert");
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		throw new UnsupportedOperationException("Metoden settSammen ikke implementert");

	}
}
