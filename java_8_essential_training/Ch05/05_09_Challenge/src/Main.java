package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner q1 = new Scanner(System.in);
        System.out.print("Enter a numeric value: ");
        String a1 = q1.nextLine();

        System.out.print("Enter a numeric value: ");
        String a2 = q1.nextLine();

        Double d1 = Double.parseDouble(a1);
        Double d2 = Double.parseDouble(a2);

        Double total = d1 + d2;

        System.out.println("The answer is: " + total);
    }

}
