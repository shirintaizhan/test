package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scan.close();
        if (a>b && a>c){
            System.out.println("The Greatest  = " + a );
        }else if(b>a && b>c){
        System.out.println("The Greatest  = " + b);
       }else {
            System.out.println("The Greatest  = " + c);
        }

    }
}
