package com.company;

import com.company.services.Calculator;
import com.company.utils.Reader;

public class Main {

    public static void main(String[] args) {
        int number1 = Reader.scanNumberInt1();
        int number2 = Reader.scanNumberInt2();
//        Print.showResults(number1, number2);

        int addition = Calculator.addResult(number1,number2);
        int subtraction = Calculator.subResult(number1,number2);
        int multiply = Calculator.multResult(number1,number2);
        float division = Calculator.divResult(number1,number2);

        System.out.printf("Os resultados das operações são: %n" +
                "ADIÇÃO: %d %n" +
                "SUBTRAÇÃO: %d %n" +
                "MULTIPLICAÇÃO: %d %n" +
                "DIVISÃO: %.2f %n", addition, subtraction, multiply, division);

    }
}
