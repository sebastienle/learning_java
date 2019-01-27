package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {

            Scanner q1 = new Scanner(System.in);

            System.out.print("Enter a numeric value: ");
            String a1 = q1.nextLine();

            System.out.print("Enter a numeric value: ");
            String a2 = q1.nextLine();

            System.out.print("Choose an operation (+ - * /): ");
            String ops = q1.nextLine();

            Double d1 = null;
            Double d2 = null;

            d1 = Double.parseDouble(a1);
            d2 = Double.parseDouble(a2);

            switch (ops) {
                case "+":
                    System.out.println("The answer is: " + addValues(d1, d2));
                    break;
                case "-":
                    System.out.println("The answer is: " + subValues(d1, d2));
                    break;
                case "*":
                    System.out.println("The answer is: " + multiplyValues(d1, d2));
                    break;
                case "/":
                    System.out.println("The answer is: " + divideValues(d1, d2));
                    break;
                default:
                    System.out.println("This is not a supported operation");
                    break;
            }
        } catch (NumberFormatException e) {
            System.out.println("Number formatting exception " + e.getMessage());
        }

    }

    static Double addValues(Double d1, Double d2) {
        double result = d1 + d2;
        return result;
    }

    static Double subValues(Double d1, Double d2) {
        double result = d1 - d2;
        return result;
    }

    static Double multiplyValues(Double d1, Double d2) {
        double result = d1 * d2;
        return result;
    }

    static Double divideValues(Double d1, Double d2) {
        double result = d1 / d2;
        return result;
    }
}
