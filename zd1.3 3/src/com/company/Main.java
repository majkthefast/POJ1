package com.company;

import java.util.Scanner;

class ExampleInputOutput {
    public static int max_rec(int tab[], int n)
    {
        if(n == 1)
            return tab[0];

        return Math.max(tab[n-1], max_rec(tab, n-1));
    }

    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        //Z inputem usera nie zadziała, bo ilość elementów nigdy nie jest                         podawana
        int n = 10;
        int tab[];
        tab = new int[10];
        for(int i = 0; i<n; i++) {
            tab[i] = scan.nextInt();
        }

        System.out.println(max_rec(tab, n));
    }
}
