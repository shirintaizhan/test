package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("input 1st number: ");
        int r = scan.nextInt();
        System.out.print("double number: ");
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scan.close();
        double pi = 3.14159;
        double volume =( 4.0/3) *pi * (r * r * r);
        System.out.printf("VOLUME = %.3f",volume);
    }
}
