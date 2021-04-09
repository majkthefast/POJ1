package zadanie;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        int First = rand.nextInt(20)+1;
        int Second = rand.nextInt(20)+1;
        int Third = rand.nextInt(20)+1;
        Numbers numbers = new Numbers(First, Second, Third);

        System.out.printf("Liczby: " + numbers.getFirst() + " " + numbers.getSecond() + " " +  numbers.getThird() + "\n");
        System.out.println("Suma = " + numbers.suma());
        System.out.println("Średnia = (" + numbers.getFirst() + "*" + numbers.getSecond() + "*" +  numbers.getThird()
                + ")/3 = " + numbers.średnia());
        System.out.println("Najmniejsza = " + numbers.min());
        System.out.println("Największa = " + numbers.max());
        System.out.println("Średnia geometryczna = " + numbers.geometric());
    }
}
