package org.example;

public class Main {
    public static void main(String[] args) {
        Calc calc = new Calc(1, 0);
        System.out.println(calc.sum());
        System.out.println(calc.subtract());
        System.out.println(calc.multiply());
        System.out.println(calc.divide());
    }
}