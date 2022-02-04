package com.calculator;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	Scanner abc=new Scanner(System.in);
        System.out.println("enter the first number");
        int Number1=abc.nextInt();
        Scanner def=new Scanner(System.in);
        System.out.println("enter the second number");
        int Number2=def.nextInt();

        calculator dog=new calculator(Number1,Number2);



    }
}
