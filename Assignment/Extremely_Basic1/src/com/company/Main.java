package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("input 1st number: ");
        int a = scan.nextInt();
        System.out.print("input 2d number: ");
        int b = scan.nextInt();
        int x ;
        x = a + b;
        System.out.println("X = " + x);
    }
}
