package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.print("input number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (1 <= n && n <= 100) {
            if (n % 2 != 0) {
                System.out.println("Weird");
            } else {
                if (n >= 2 && n <= 5) {
                    System.out.println("Not Weird");
                } else if (n >= 6 && n <= 20) {
                    System.out.println("Weird");
                } else {
                    System.out.println("Not Weird");

                }
            }
        }
    }
}
