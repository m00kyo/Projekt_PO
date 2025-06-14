/**
 * Klasa Wycieczka reprezentuje jedną wycieczkę turystyczną.
 * Zawiera informacje o celu podróży (nazwa i odległość), dacie wyjazdu i powrotu,
 * liczbie osób, środku transportu, cenie podstawowej oraz opcji ubezpieczenia.
 *
 * Umożliwia:
 * - wypisanie podstawowych i szczegółowych danych o wycieczce,
 * - obliczenie całkowitego kosztu (z transportem, ubezpieczeniem, dopłatą za większą ilość osób).
 *
 * Domyślnie transportem jest samolot, a domyślna liczba osób to 1.
 */
public class Wycieczka {
    double cena_podst;
    Cel cel_podrozy;
    String data_wyjazdu;
    String data_powrotu;
    public int ilosc_osob = 1;
    public Transport typ_transportu = new Samolot();
    public boolean ubezpieczenie = false;

    public void wypisz(){
        System.out.printf("| %-20s | %10s | %10s | %11.2f pln | %10.0f km |\n", cel_podrozy.nazwa, data_wyjazdu, data_powrotu, cena_podst, cel_podrozy.odleglosc);
    }

    public void szczegoly(){
        System.out.println("Szczegóły wycieczki: ");
        System.out.printf("%-30s: %s\n","Cel podróży", cel_podrozy.nazwa);
        System.out.printf("%-30s: %s\n", "Data wyjazdu", data_wyjazdu);
        System.out.printf("%-30s: %s\n", "Data powrotu", data_powrotu);
        System.out.printf("%-30s: %.2f\n", "Cena podstawowa", cena_podst);
        System.out.printf("%-30s: %d\n", "Ilość osób", ilosc_osob);
        System.out.printf("%-30s: ", "Transport");
        typ_transportu.wypisz(cel_podrozy.odleglosc);
        System.out.printf("%-30s: %s\n", "Ubezpieczenie", ubezpieczenie ? "tak" : "nie");
        System.out.printf("%-30s: %.2f pln \n", "Cena całkowita", this.wycena());


    }

    public Wycieczka(double cena_podst, Cel cel_podrozy, String data_wyjazdu, String data_powrotu) {
        this.cena_podst = cena_podst;
        this.cel_podrozy = cel_podrozy;
        this.data_wyjazdu = data_wyjazdu;
        this.data_powrotu = data_powrotu;
    }

    public Wycieczka() {
        this.cena_podst = 0;
        this.cel_podrozy = null;
        this.data_wyjazdu = null;
        this.data_powrotu = null;
    }

    public double getOdleglosc(){
        return this.cel_podrozy.odleglosc;
    }

    public double wycena(){
        double cena = cena_podst + typ_transportu.obliczCene(cel_podrozy.odleglosc);

        if(ubezpieczenie){
            cena = cena + 125;
        }

        for(int i = 1; i < ilosc_osob; i++){
            cena = cena * 1.5;
        }

        return cena;
    }
}
