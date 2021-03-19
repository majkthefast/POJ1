package com.company;

import java.util.Scanner;

class ExampleInputOutput {
    public static void main(String[] args) {
        java.text.DecimalFormat df = new java.text.DecimalFormat("0.00");
        Scanner in = new Scanner(System.in);
        float age = in.nextFloat();
        float basic = 31557600;
        float ziemia = age / basic;
        String planeta = in.next();
        switch (planeta) {
            case "Merkury":
                System.out.print(df.format(ziemia / 0.2408467));
                break;
            case "Wenus":
                System.out.print(df.format(ziemia / 0.61519726));
                break;
            case "Ziemia":
                System.out.print(df.format(ziemia));
                break;
            case "Mars":
                System.out.print(df.format(ziemia / 1.8808158));
                break;
            case "Jowisz":
                System.out.print(df.format(ziemia / 11.862615));
                break;
            case "Saturn":
                System.out.print(df.format(ziemia / 29.447498));
                break;
            case "Uran":
                System.out.print(df.format(ziemia / 84.016846));
                break;
            case "Neptun":
                System.out.print(df.format(ziemia / 164.79132));
                break;
            default:
                System.out.print("BŁĄD");
        }
    }
}
