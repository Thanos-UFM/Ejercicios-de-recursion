package com.company;
import java.util.Scanner;

public class Main {

    private static int suma (int n){
        if (n==0)
            return 0;
        else
            return suma(n-1)+n;
    }

    public static void main(String[] args) {
        int n;
        Scanner scan= new Scanner(System.in);
        n=scan.nextInt();
        System.out.print(suma(n));
    }
}
