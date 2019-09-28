package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Введите радиус круга: ");
        double r = sc.nextDouble();
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        sc.close();

        double pi = 3.14159;
        double a = r * r *pi;
        System.out.printf("A = %.4f",a);

    }
}

