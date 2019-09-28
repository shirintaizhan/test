package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" ");
        int a = sc.nextInt();
        System.out.print(" ");
        double b = sc.nextDouble();
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        sc.close();
        double c;
        System.out.print(" %.3f km/l");
    }
}
