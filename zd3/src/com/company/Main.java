package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ExampleInputOutput {
    public static void main(String[] args) throws IOException {
        double a, b;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        a = Double.parseDouble(br.readLine());
        b = Double.parseDouble(br.readLine());
        System.out.println(a*b);
    }
}
