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
