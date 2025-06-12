import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static ArrayList<Wycieczka> wycieczki = new ArrayList<>();
    static ArrayList<Wycieczka> zapisane_wycieczki = new ArrayList<>();

    public static void main(String[] args) {

       for(int i = 0; i < 10; i++){
           wycieczki.add(generuj_Wycieczke());
       }

        while(true){
            int wybor = mainMenu();

            switch(wybor){
                case 1: dostepne_wycieczki(); break;
                case 2: przegladaj_zapisane(); break;
                case 3: edytuj_wycieczke(); break;
                case 4: rezygnacja(); break;
                default: return;
            }
            wyczysc_ekran();
        }
    }
    public static Wycieczka generuj_Wycieczke(){
        Cel[] miasta = {
                new Cel("Praga",520), new Cel("Wiedeń", 555), new Cel("Budapeszt", 545),
                new Cel("Rzym",1300), new Cel("Paryż", 1360), new Cel("Barcelona", 1850),
                new Cel("Ateny",1590), new Cel("Edynburg", 1650), new Cel("Sztokholm", 810),
                new Cel("Oslo",1100), new Cel("Florencja", 1150), new Cel("Lizbona", 2750)
        };

        Random random = new Random();
        Cel miasto = miasta[random.nextInt(12)];
        double cena = random.nextDouble(200,1000);
        int dzien = random.nextInt(2,20);
        int miesiac = random.nextInt(2,10);
        int rok = 2026;

        String data_wyjazdu = String.format("%02d.%02d.%d", dzien, miesiac, rok);
        String data_powrotu = String.format("%02d.%02d.%d", dzien+random.nextInt(2,7), miesiac, rok);

        return new Wycieczka(cena, miasto, data_wyjazdu, data_powrotu);
    }

    static int mainMenu(){
        System.out.println("Biuro podróży 'Pikselowa Przygoda'!");
        System.out.println("1. Przeglądaj dostępne wycieczki.");
        System.out.println("2. Przeglądaj wykupione wycieczki.");
        System.out.println("3. Edytuj wykupione wycieczki.");
        System.out.println("4. Zrezygnuj z wykupionej wycieczki.");
        System.out.println("5. Wyjdź.");
        System.out.print("> ");

        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    static void dostepne_wycieczki(){
        System.out.printf("| LP. | %-20s | %-10s | %-10s | %14s | %13s |\n", "Cel podróży", "Wyjazd", "Powrót", "Cena podstawowa", "Odległość");

        for(int i = 0; i < 10; i++){
            System.out.printf("| %3d ", i+1);
            wycieczki.get(i).wypisz();
        }

        System.out.println("Wybierz numer wycieczki, którą chcesz wykupić lub x jeśli chcesz wyjść do menu startowego.");
        System.out.print("> ");
        Scanner scanner = new Scanner(System.in);

        try {
            int wybor = scanner.nextInt();
            Wycieczka wybrana_wycieczka = wycieczki.get(wybor-1);
            zapisane_wycieczki.add(wybrana_wycieczka);
        } catch (Exception e) {
            return;
        }

    }
    static void przegladaj_zapisane(){
        Scanner scanner = new Scanner(System.in);
        if(zapisane_wycieczki.size()==0){
            System.out.println("Brak wykupionych wycieczek.");
            scanner.nextLine();
            return;
        }
        System.out.printf("| LP. | %-20s | %-10s | %-10s | %14s | %13s |\n", "Cel podróży", "Wyjazd", "Powrót", "Cena podstawowa", "Odległość");

        for(int i = 0; i < zapisane_wycieczki.size(); i++){
            System.out.printf("| %3d ", i+1);
            zapisane_wycieczki.get(i).wypisz();
        }

        System.out.print("> ");


        int wybor = scanner.nextInt();
    }

    static void edytuj_wycieczke(){
        System.out.println("edytuj");
    }

    static void rezygnacja(){
        Scanner scanner = new Scanner(System.in);
        if(zapisane_wycieczki.size()==0){
            System.out.println("Brak wykupionych wycieczek.");
            scanner.nextLine();
            return;
        }
        System.out.printf("| LP. | %-20s | %-10s | %-10s | %14s | %13s |\n", "Cel podróży", "Wyjazd", "Powrót", "Cena podstawowa", "Odległość");

        for(int i = 0; i < zapisane_wycieczki.size(); i++){
            System.out.printf("| %3d ", i+1);
            zapisane_wycieczki.get(i).wypisz();
        }

        System.out.println("Wybierz numer wycieczki z której chcesz zrezygnować lub x jeśli chcesz wyjść do menu startowego.");
        System.out.print("> ");

        try {
            int wybor = scanner.nextInt();
            zapisane_wycieczki.remove(wybor-1);
        } catch (Exception e) {
            return;
        }

    }

    static void wyczysc_ekran(){
        for(int i = 0; i<50; i++){
            System.out.println();
        }
    }
}