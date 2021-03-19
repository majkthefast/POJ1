package com.company;

import java.io.IOException;
import java.util.Scanner;

class ExampleInputOutput {
    public static void main(String[] args) throws IOException {
        int x;
        int y=0;
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        while(x<=0)
        {
            x = in.nextInt();
        }
        for(int i=0;i<=x-1;i++){
            System.out.println("*");
            for(y=0;y<=i;y++){
                if(i==x-1){
                    break;
                }
                else {
                    System.out.print("*");
                }
            }
        }
        for(int i=x;i>=0;i--){
            for(y=0;y<i-1;y++){
                System.out.print("*");
            }
            if(i==0){
                break;
            }
            else {
                System.out.println("*");
            }
        }
        for(int i=x;i>=0;i--){
            for(y=0;y<i-1;y++){
                System.out.print("*");
            }
            if(i==0){
                break;
            }
            else {
                System.out.println("*");
                for(int s=x;s>=i;s--) {
                    if(s==1){
                        break;
                    }
                    else {
                        System.out.print(" ");
                    }
                }
            }
        }
        int ss=x;
        for(int i=0;i<=x-1;i++){
            System.out.println("*");
            ss--;                           //do drugiej czesci
            for(int s=ss-2;s>=0;s--) {
                System.out.print(" ");
            }
            for(y=0;y<=i;y++){
                if(i==x-1){
                    break;
                }
                else {
                    System.out.print("*");
                }
            }
        }
    }
}
