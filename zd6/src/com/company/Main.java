package com.company;

import java.io.IOException;
import java.util.Scanner;

class ExampleInputOutput {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String zdanie = in.nextLine();
        String[] splitZdanie = zdanie.split("\\s+");
        System.out.print("\"%"+splitZdanie[1]+" "+splitZdanie[0]+"%\"");

    }
}
