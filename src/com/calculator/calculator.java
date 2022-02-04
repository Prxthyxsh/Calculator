package com.calculator;
import java.util.Scanner;


public class calculator {
    int Number1,Number2,operator;

    public calculator(int Number1, int Number2){
        System.out.println("Enter the operator required");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.Exponent");

        Scanner abc=new Scanner(System.in);
        operator=abc.nextInt();

        Number1=Number1;
        Number2=Number2;
        cal(Number1,Number2,operator);
    }

    public int cal(int Number1, int Number2, int  operator){
        switch(operator){
            case 1:
                System.out.println(Number1 + Number2);
                break;
            case 2:
                System.out.println(Number1 - Number2);
                break;
            case 3:
                System.out.println(Number1 * Number2);
                break;
            case 4:
                System.out.println(Number1 / Number2);
                break;
            case 5:
                for(int Number3=Number2;Number3>0;Number3--){
                    Number1*=Number1;}
            System.out.println(Number1);
            default:
                System.out.println("Enter a valid operation");}
return 0;}}
