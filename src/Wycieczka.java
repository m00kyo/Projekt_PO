public class Wycieczka {
    double cena_podst;
    Cel cel_podrozy;
    String data_wyjazdu;
    String data_powrotu;

    public void wypisz(){
        System.out.printf("| %-20s | %10s | %10s | %10.2f pln | %10.0f km |\n", cel_podrozy.nazwa, data_wyjazdu, data_powrotu, cena_podst, cel_podrozy.odleglosc);
    }

    public Wycieczka(double cena_podst, Cel cel_podrozy, String data_wyjazdu, String data_powrotu) {
        this.cena_podst = cena_podst;
        this.cel_podrozy = cel_podrozy;
        this.data_wyjazdu = data_wyjazdu;
        this.data_powrotu = data_powrotu;
    }
}
