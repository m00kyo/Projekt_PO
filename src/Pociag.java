/**
 * Klasa Pociag jest klasą rozszerzającą klasę Transport i reprezentuje
 * konkretny środek transportu – pociąg.
 *
 * W konstruktorze ustala specyficzne dla pociągu parametry:
 * - cena_km = 0.40 – koszt przejazdu pociągiem za jeden kilometr,
 * - mnoznik_czasu = 0.011 – czas przejazdu pociągiem w godzinach na kilometr.
 */
public class Pociag extends Transport{
    public Pociag() {
        super();
        this.cena_km = 0.40;
        this.mnoznik_czasu = 0.011;
    }

    @Override
    public double obliczCene(double kilometry) {
        return super.obliczCene(kilometry);
    }

    @Override
    public void wypisz(double kilometry){
        System.out.printf("%-10s: %18.2f km %18.2f pln %18.2f h \n", "Pociąg", kilometry, this.obliczCene(kilometry),this.obliczCzas(kilometry));
    }
}
