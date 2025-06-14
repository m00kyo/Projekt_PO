// Klasa reprezentująca cel podróży wycieczki.
// Używana w klasie Wycieczka do określenia lokalizacji i dystansu podróży.
public class Cel {
    public String nazwa;
    public double odleglosc;

    public Cel(String nazwa, double odleglosc) {
        this.nazwa = nazwa;
        this.odleglosc = odleglosc;
    }
}
