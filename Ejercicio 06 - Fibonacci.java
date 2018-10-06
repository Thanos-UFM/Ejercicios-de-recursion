package com.company;

import java.util.Scanner;

public class Main {

    public static int fibonacci(int number){
        if (number <= 1) return number;
        else return fibonacci(number-1) + fibonacci(number-2);
    }

    public static void main(String[] args) {
	// write your code here
        Scanner reader = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de números Fibonacci que desea");
        int numb = reader.nextInt();

        /*System.out.println(fibonacci(numb));*/

        for (int i = 1; i <= numb; i++)
            System.out.println(i + ": " + fibonacci(i));
    }
}
