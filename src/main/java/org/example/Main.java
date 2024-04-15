package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("enter a number:");
        int num1 = new Scanner(System.in).nextInt();
        System.out.println("enter the operation");
        String operation = new Scanner(System.in).nextLine();
        System.out.println("enter a number:");
        int num2 = new Scanner(System.in).nextInt();

        if (operation.equals("+")) {
            int result = num1 + num2;
            System.out.println(result);
        } else if (operation.equals("-")) {
            int result = num1 - num2;
            System.out.println(result);
        } else if (operation.equals("*")) {
            int result = num1* num2;
            System.out.println(result);
        } else if (operation.equals("/")) {
            int result = num1 / num2;
            System.out.println(result);
        } else {
            System.out.println("INCORRECT OPERATOR");
        }
    }
}
