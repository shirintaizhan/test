package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Number: ");
        int Number = scan.nextInt();
        System.out.print("watch: ");
        int watch = scan.nextInt();
        System.out.print("salary for an hour: ");
        double money = scan.nextDouble();
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scan.close();
        double salary = watch * money;
        System.out.printf("NUMBER = %d \nSALARY U$ = %.2f", Number, salary);
    }
}