package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("input 1st number: ");
        int a = scan.nextInt();
        System.out.print("input 2d number: ");
        int b = scan.nextInt();
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scan.close();
        int PROD = a * b ;
        System.out.println("PROD = " + PROD);
    }
}
