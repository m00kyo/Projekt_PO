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
        System.out.printf("Pociąg: %18.2f km %18.2f pln %18.2f h \n", kilometry, this.obliczCene(kilometry),this.obliczCzas(kilometry));
    }
}
