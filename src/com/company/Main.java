package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Iveskite Kilometrus ");
        float km = scanner.nextFloat();

        System.out.println("Iveskite Kuro Sanaudas ");
        float sanaudos = scanner.nextFloat();

        double KS = KS(km,sanaudos);
        System.out.println("Kuro sanaudos: " + KS);
    }
    public static double KS(float km, float sanaudos){
        return (sanaudos * 100) / km;
    }
}
