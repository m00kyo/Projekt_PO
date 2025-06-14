/**
 * Klasa Transport reprezentuje ogólny środek transportu, który jest bazą
 * do tworzenia bardziej szczegółowych klas.
 *
 * Pola klasy:
 * - cena_km
 * - mnoznik_czasu.
 *
 * Metody klasy:
 * - obliczanie ceny przejazdu na podstawie liczby kilometrów (obliczCene),
 * - obliczanie czasu przejazdu (obliczCzas),
 * - wypisywanie informacji o przejeździe (wypisz).
 *
 * Konstruktor domyślny ustawia oba pola (cena_km i mnoznik_czasu) na 0.
 */
public class Transport {
    protected double cena_km;
    protected double mnoznik_czasu;

    public Transport() {
        this.cena_km = 0;
        this.mnoznik_czasu = 0;
    }

    public double obliczCene(double kilometry){
        return cena_km*kilometry;
    }

    public double obliczCzas(double kilometry){
        return kilometry*mnoznik_czasu;
    }

    public void wypisz(double kilometry){
        System.out.printf("(%f) %f pln", kilometry, this.obliczCene(kilometry));
    }
}
