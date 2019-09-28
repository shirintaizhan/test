package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("first student's assessment: ");
        double a = scan.nextDouble() * 2;
        System.out.print("second student's assessment: ");
        double b = scan.nextDouble() * 3;
        System.out.print("third student's assessment: ");
        double c = scan.nextDouble() * 5;
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scan.close();
        double MEDIA = (a + b + c)/ 10;
        System.out.printf("MEDIA = %.1f",MEDIA);

    }
}
