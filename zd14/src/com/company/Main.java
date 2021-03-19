package com.company;

import java.util.Scanner;

class ExampleInputOutput {
    public static void main(String args[]) {
        char Charray[];
        Charray = new char[100];
        Scanner s = new Scanner(System.in);
        Charray = s.next().toCharArray();
        int j = Charray.length;
        boolean isPalindrom = false;

        for(int i = 0;i < j;i++){
            j--;
            if (Charray[i] != Charray[j]){
                isPalindrom = false;
                break;
            }
            else if(Charray[i] == Charray[j]){
                isPalindrom = true;
            }
        }
        if(isPalindrom) {
            System.out.print("TAK");
        }
        else{
            System.out.print("NIE");
        }
    }
}
