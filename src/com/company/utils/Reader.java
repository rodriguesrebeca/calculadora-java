package com.company.utils;

import java.util.Scanner;

public class Reader {
    private static Scanner scanNumber = new Scanner(System.in);

    public static int scanNumberInt1(){
        Print.insertNumber1();
        int number1 = scanNumber.nextInt();
        return number1;
    }

    public static int scanNumberInt2(){
        Print.insertNumber2();
        int number2 = scanNumber.nextInt();
        return number2;
    }
}
