package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("double a: ");
        System.out.print("double b: ");
        System.out.print("double c: ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double tri =1.011 ;
        double cir = 1.0233;
        double tra = 1.365;
        double qua = 1.34655 ;
        double ret = 1.32655;
        System.out.printf("TRIANGULO: %.3f",tri);
        System.out.printf("CIRCULO: %.3f",cir);
        System.out.printf("TRAPEZIO: %.3f",tra);
        System.out.printf("QUADRADO: %.3f",qua);
        System.out.printf("RETANGULO: %.3f",ret);
    }
}
