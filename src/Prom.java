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
        System.out.printf("Prom: %20.2f km %20.2f pln %20.2f h \n", kilometry, this.obliczCene(kilometry),this.obliczCzas(kilometry));
    }
}
