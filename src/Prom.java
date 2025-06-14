/**
 * Klasa Prom jest klasą rozszerzającą klasę Transport i reprezentuje
 * konkretny środek transportu – prom.
 *
 * W konstruktorze ustawia charakterystyczne dla promu parametry:
 * - cena_km = 2.2 – koszt przejazdu za jeden kilometr,
 * - mnoznik_czasu = 0.06 – czas podróży w godzinach na kilometr.
 */
public class Prom extends Transport{
    public Prom() {
        super();
        this.cena_km = 2.2;
        this.mnoznik_czasu = 0.06;
    }

    @Override
    public double obliczCene(double kilometry) {
        return super.obliczCene(kilometry)+150;
    }

    @Override
    public void wypisz(double kilometry){
        System.out.printf("%-10s: %20.2f km %20.2f pln %20.2f h \n", "Prom", kilometry, this.obliczCene(kilometry),this.obliczCzas(kilometry));
    }
}
