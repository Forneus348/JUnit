package org.example;

public class Calc {
    private final double number1;
    private final double number2;

    public Calc(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public double sum(){
        return this.number1 + this.number2;
    }

    public double subtract(){
        return this.number1 - this.number2;
    }

    public double multiply(){
        return this.number1 * this.number2;
    }

    public double divide(){
        try {
            return this.number1 / this.number2;
        }
        catch (ArithmeticException ex) {
            return Double.NaN;
        }
    }
}

