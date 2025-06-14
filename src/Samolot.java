/**
 * Klasa Samolot jest klasą rozszerzającą klasę Transport i reprezentuje
 * konkretny środek transportu – samolot.
 *
 * W konstruktorze ustawia specyficzne dla samolotu parametry:
 * - cena_km = 1.7 – koszt przejazdu samolotem za jeden kilometr,
 * - mnoznik_czasu = 0.002 – czas przelotu w godzinach na kilometr.
 */
public class Samolot extends Transport{
    public Samolot() {
        super();
        this.cena_km = 1.7;
        this.mnoznik_czasu = 0.002;
    }

    @Override
    public double obliczCene(double kilometry) {
        return super.obliczCene(kilometry);
    }

    @Override
    public void wypisz(double kilometry){
        System.out.printf("%-10s: %18.2f km %18.2f pln %18.2f h \n", "Samolot", kilometry, this.obliczCene(kilometry),this.obliczCzas(kilometry));
    }
}
