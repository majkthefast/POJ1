package com.company;

import java.util.Scanner;

class ExampleInputOutput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String zdanie = in.nextLine();
        int i = 0;
        for (char c : zdanie.toCharArray()) {
            int x = Character.toUpperCase(c);
            if (x >= 'A' && x <= 'Z') {
                i |= 1 << (x - 'A');
            }
        }
        if (i == (1 << (1 + 'Z' - 'A')) - 1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
