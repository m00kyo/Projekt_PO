# Projekt-Oliwia-Stoś
# System Obsługi Biura Podróży

## Opis
Program konsolowy pozwalający na zarządzanie wycieczkami.

## Funkcje
- Wyświetlanie dostępnych wycieczek
- Wykupienie wycieczek
- Edycja wycieczek
- Rezygnacja z wycieczek

## Jak używać
1. Uruchom klasę `Main` i wybierz odpowiednią opcje z menu:  
    - Przeglądaj dostępne wycieczki 
    - Przeglądaj wykupione wycieczki
    - Edytuj wykupione wycieczki  
    - Zrezygnuj z wykupionej wycieczki
    - Wyjdź
2. Przy wykonywaniu funkcji postępuj zgodnie z poleceniami wyświetlanymi w konsoli.

## Struktura
- `Main.java`: Główny punkt wejścia do aplikacji, tutaj obsługiwany jest interfejs i związane z nim funkcjonalności.
- `Wycieczka.java`: Reprezentuje pojedynczą wycieczkę, zawierającą szczegóły takie jak cel podróży, daty, cena, liczba osób, typ transportu i ubezpieczenie. Zawiera również metody do wyświetlania informacji o wycieczce i obliczania całkowitego kosztu.
- `Cel.java`: Definiuje cel podróży wraz z jego nazwą i odległością.
- `Transport.java`: Klasa bazowa dla różnych środków transportu, definiująca wspólne metody do obliczania kosztu i czasu podróży.
- `Samolot.java`: Rozszerza `Transport` dla obliczeń specyficznych dla samolotu.
- `Pociag.java`: Rozszerza `Transport` dla obliczeń specyficznych dla pociągu.
- `Prom.java`: Rozszerza `Transport` dla obliczeń specyficznych dla promu.


## Wymagania
- Java 8 lub wyższa  
- Konsola do obsługi interaktywnego menu
