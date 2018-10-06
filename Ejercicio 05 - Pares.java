package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner reader = new Scanner(System.in);
        System.out.println("Ingrese el número que desea verificar");
        int numb = reader.nextInt();

        if(parNumber(numb)==1)
            System.out.println("Es número PAR");
        else
            System.out.println("No es par");
    }

    public static int parNumber(int number)
    {
        if(number==0){
            return 1;
        }else if (number == 1){
            return 0;
        }else {
            return(parNumber(number - 2));
        }
    }
}
