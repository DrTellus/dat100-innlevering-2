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
            if (i < tabell.length - 1) {// for alle elementer i tabellen unntatt den siste
                tekst = tekst + ",";//legg til komma etter
            }
        }
        tekst = tekst + "]"; // legger til ] etter tekst
        return tekst; //returnerer ferdig tekst

    }

    // c)
    public static int summer(int[] tabell) {
        int sum = 0; //initialiserer sum til 0
        for (int i = 0; i < tabell.length; i++) {//lager forløkke der..
            sum = sum + tabell[i];//summen øker med hver instans av i
        }
        return sum; //returnerer summen av alle elementene

    }

    // d)
    public static boolean finnesTall(int[] tabell, int tall) {
        for (int i = 0; i < tabell.length; i++) {// søker langs tabellen
            if (tabell[i] == tall) { //hvis den finner tall i tabellen
                return true; //er tallet i tabellen, altså true
            }
        } return false;// hvis ikke tallet er i tabell er det false

    }


	// e)
	public static int posisjonTall(int[] tabell, int tall) {
        for (int i = 0; i < tabell.length; i++) {//Leter langs tabellen
            if (tabell[i] == tall) {//Hvis elementet er lik parameter tall
                return i;// returner posisjon/index der tallet ble funnet.
            }
        }return -1;// om tallet ikke er i tabellen, return -1.

	}

	// f)
	public static int[] reverser(int[] tabell) {
        int lengde = tabell.length;//initierer lengden på tabellen
        int[] ny = new int[lengde]; //lager ny tabell med samme lengde
        for (int i = 0; i < lengde; i++) { //for hver verdi av i
            ny[i] = tabell[lengde-1-i];//..blir ny "i" elementet som ligger på
            //..hele lengden av tabellen minus 1 minus stigende verdi av "i".
            // i starter foran og teller oppover, mens lengde-1-i starter
            //..bak og teller nedover. -1 er pga index starter på 0.
        }return ny;

        }




	// g)
	public static boolean erSortert(int[] tabell) {
        for (int i = 1; i < tabell.length; i++) {//Man starter med i=1 for å bruke minus (i-1)(Sammenligne med elementet rett før)
            if (tabell[i] < tabell[i - 1]) {//.. og trekke fra for å sjekke om det er false først.
                //Altså om et element er mindre enn det forrige = ikke sortert stigende
                return false;
                // Om man starter på 0 og går oppover for å finne true, vil den fortsette
                //.. til den er utenfor indexen (out of bounds). Tricky.
            }
//       Om ingen brudd, og alt er stigende..
        }return true;
    }// her kunne man brukt Arrays.sort tab for å legge alt i riktig rekkefølge


	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
        int lengde1 = tabell1.length;// finner antall elementer i tabell1
        int lengde2 = tabell2.length;// finner antall elementer i tabell2

        int[] ny =new int[lengde1 + lengde2];// initialiserer ny tabell med ny sammenlagt lengde

        for (int i = 0; i < lengde1; i++) {
            ny[i] = tabell1[i];// Kopierer alle verdier fra tabell1 til "ny"
        }
        for (int j = 0; j < lengde2; j++) {
            ny[lengde1 + j] = tabell2[j];//Kopierer alle elementene fra tabell2 til ny
            //Men tar vare på lengde1 slik at "ny" blir elementene fra
            //.. tabell1 og så tabell2
        }return ny;

    }







}
