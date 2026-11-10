package org.javaturk.oopj.hw.ch02;

public class CalculatePower {

    public int calculatePower(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    public static void main(String[] args) {
        CalculatePower powerCalculator = new CalculatePower();

        int base = 2;
        int exponent = 10;
        int result = powerCalculator.calculatePower(base, exponent);

        System.out.println(base + " ^ " + exponent + " is " + result);
    }
}