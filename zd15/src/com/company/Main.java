package com.company;

import java.io.IOException;
import java.util.Scanner;

class ExampleInputOutput {
    public static void main(String args[]) throws IOException {
        int x, y;
        Scanner in = new Scanner(System.in);
        int j = in.nextInt();
        int d = in.nextInt();
        int macierz[][] = new int[j][d];
        if(j<=0 || d<=0){
            System.out.print("BŁĄD");
        }
        for (x = 0; x < j; x++) {
            for (y = 0; y < d; y++) {
                macierz[x][y] = in.nextInt();
            }
        }
        for (x = 0; x < d; x++) {
            for (y = 0; y < j; y++) {
                if(y==j-1){
                    System.out.print(macierz[y][x]);
                }
                else{
                    System.out.print(macierz[y][x] + " ");
                }
            }
            System.out.print("\n");
        }
    }
}
