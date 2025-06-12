import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static ArrayList<Wycieczka> wycieczki = new ArrayList<>();
    public static void main(String[] args) {

       for(int i = 0; i < 10; i++){
           wycieczki.add(generuj_Wycieczke());
       }

        for(int i = 0; i < 10; i++){
            wycieczki.get(i).wypisz();
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
        System.out.println("Biuro podróży 'Pikselowa Łapka'!");
        System.out.println("1. Przeglądaj dostępne wycieczki.");
        System.out.println("2. Przeglądaj wykupione wycieczki.");
        System.out.println("3. Edytuj wykupione wycieczki.");
        System.out.println("4. Zrezygnuj z wykupionej wycieczki.");
        System.out.println("5. Wyjdź.");
        System.out.println("> ");

        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    static void dostepne_wycieczki(){
        System.out.println("DOSTEPNE");
    }
    static void przegladaj_zapisane(){
        System.out.println("przegalad");
    }
    static void edytuj_wycieczke(){
        System.out.println("edytuj");
    }
    static void rezygnacja(){
        System.out.println("rezygnacja");
    }

}