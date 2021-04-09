package zadanie;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //losowanie wartości wartość max 12 (0-12) bo więcej kart nie ma w enumie
        //to samo z kolorem, łącznie 4 kolory
        Random wartość = new Random();
        int K1Wartosc = wartość.nextInt(13);
        int K1Kolor = wartość.nextInt(3);
        int K2Wartosc = wartość.nextInt(13);
        int K2Kolor = wartość.nextInt(3);
        int K3Wartosc = wartość.nextInt(13);
        int K3Kolor = wartość.nextInt(3);

        Card Karta1 = new Card(K1Wartosc, K1Kolor);
        Card Karta2 = new Card(K2Wartosc, K2Kolor);
        Card Karta3 = new Card(K3Wartosc, K3Kolor);

        if(K1Wartosc != 13 || K2Wartosc != 13 || K3Wartosc != 13) {
            System.out.println("Pierwsza karta to " + Karta1.gWartosc() + " " + Karta1.gColour()
                    + "\n,druga karta to " + Karta2.gWartosc() + " " + Karta2.gColour() + "\n,a trzecia to "
                    + Karta3.gWartosc() + " " + Karta3.gColour() );
        }
            else{
            System.out.println("Powinien być joker ale to już chyba wyższa szkoła jazdy");
        }
    }
}