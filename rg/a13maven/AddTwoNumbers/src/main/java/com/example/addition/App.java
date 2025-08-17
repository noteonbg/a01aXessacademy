package com.example.addition;


public class App {

    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = add(a, b);
        System.out.println("Sum of " + a + " and " + b + " is: " + sum);
    }
}


