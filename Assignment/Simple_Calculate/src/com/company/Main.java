package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("kod product: ");
        int a = scan.nextInt();
        System.out.print("quantity: ");
        int b = scan.nextInt();
        System.out.print("price: ");
        double c = scan.nextDouble();
        System.out.print("kod product: ");
        int d = scan.nextInt();
        System.out.print("quantity: ");
        int f = scan.nextInt();
        System.out.print("price: ");
        double o = scan.nextDouble();
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scan.close();
        double sum = b *c + f * o;
        System.out.printf("VALOR A PAGAR : R $ = %.2f",sum);    }
}
