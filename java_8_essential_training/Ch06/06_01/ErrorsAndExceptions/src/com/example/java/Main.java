package com.example.java;

public class Main {

    public static void main(String[] args) {

        //Was set to Null before (with capital N) which causes a compilation error
        String s = null;

        System.out.println(s);

        //Causes a run time error
        String welcome = "Welcome!";
        char[]  chars = welcome.toCharArray();
        char lastChar = chars[chars.length];
        System.out.println(lastChar);

    }

}
