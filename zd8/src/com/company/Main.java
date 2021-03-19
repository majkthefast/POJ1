package com.company;

import java.io.IOException;
import java.util.Scanner;

class ExampleInputOutput {
    public static void main(String[] args) throws IOException {
        int x;
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        switch(x) {
            case 1:
                System.out.print("Styczeń: 31 dni");
                break;
            case 2:
                System.out.print("Luty: 28 dni");
                break;
            case 3:
                System.out.print("Marzec: 31 dni");
                break;
            case 4:
                System.out.print("Kwiecień: 30 dni");
                break;
            case 5:
                System.out.print("Maj: 31 dni");
                break;
            case 6:
                System.out.print("Czerwiec: 30 dni");
                break;
            case 7:
                System.out.print("Lipiec: 31 dni");
                break;
            case 8:
                System.out.print("Sierpień: 31 dni");
                break;
            case 9:
                System.out.print("Wrzesień: 30 dni");
                break;
            case 10:
                System.out.print("Październik: 31 dni");
                break;
            case 11:
                System.out.print("Listopad: 30 dni");
                break;
            case 12:
                System.out.print("Grudzień: 31 dni");
                break;
            default:
                System.out.print("BŁĄD");
        }
    }
}
