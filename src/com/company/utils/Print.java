package com.company.utils;


public class Print {
    final static String INSERT_NUMBER_1 = "Informe um número inteiro: ";
    final static String INSERT_NUMBER_2 = "Informe outro número inteiro: ";
//    final static String MSG_RESULT = "Os resultados das operações são: %n " +
//            "ADIÇÃO: %d %n SUBTRAÇÃO: %d %n MULTIPLICAÇÃO: %d %n DIVISÃO: %.2f %n";

    public static void insertNumber1(){
        System.out.print(INSERT_NUMBER_1);
    }

    public static void insertNumber2(){
        System.out.print(INSERT_NUMBER_2);
    }

//    public static void showResults(int number1, int number2) {
//        System.out.printf(MSG_RESULT, number1, number2, Calculator.addResult(number1,number2),
//                Calculator.subResult(number1,number2), Calculator.multResult(number1, number2),
//                Calculator.divResult(number1,number2));
//    }

}
