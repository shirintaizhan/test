package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("input a name: ");
        String name = scan.next();
        System.out.print("input fixed salary: ");
        double money = scan.nextDouble();
        System.out.print("sale's total: ");
        double sale = scan.nextDouble();
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scan.close();
        double total = money * 15 / 100 + sale;
        System.out.printf("TOTAL = R$ %.2f",total);
    }
}
