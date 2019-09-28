package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("1st number: ");
        int a = scan.nextInt();
        System.out.print("2d number: ");
        int b = scan.nextInt();
        System.out.print("3d number: ");
        int c = scan.nextInt();
        System.out.print("4th number: ");
        int d = scan.nextInt();
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scan.close();
        int DIFERENCA  = a * b - c * d ;
        System.out.println("DIFERENCA = " + DIFERENCA );    }
}
