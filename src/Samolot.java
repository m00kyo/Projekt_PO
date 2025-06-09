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
        System.out.printf("Samolot: %18.2f km %18.2f pln %18.2f h \n", kilometry, this.obliczCene(kilometry),this.obliczCzas(kilometry));
    }
}
