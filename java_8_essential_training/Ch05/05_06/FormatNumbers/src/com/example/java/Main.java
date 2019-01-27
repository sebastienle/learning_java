package com.example.java;

import java.text.NumberFormat;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        double doubleValue = 1_234_567.89;

        NumberFormat numF = NumberFormat.getNumberInstance();
        System.out.println("Number: " + numF.format(doubleValue));

        //you can set the Locale yourself to control the output
        Locale locale = new Locale("da","DK");
        NumberFormat numF2 = NumberFormat.getNumberInstance(locale);
        System.out.println("Number: " + numF2.format(doubleValue));

        NumberFormat curF = NumberFormat.getCurrencyInstance();
        System.out.println("Currency: " + curF.format(doubleValue));

        NumberFormat curF2 = NumberFormat.getCurrencyInstance(locale);
        System.out.println("Currency: " + curF2.format(doubleValue));

        NumberFormat intF = NumberFormat.getIntegerInstance();
        System.out.println("Integer: " + intF.format(doubleValue));


    }

}
