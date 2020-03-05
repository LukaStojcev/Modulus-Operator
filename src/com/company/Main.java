package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        testOddness();
        keepContained();
        lastDigit();
    }

    public static void testOddness() {
        //todo: even or odd

        Scanner keyboard;
        int positiveNumber;

        keyboard = new Scanner(System.in);
        System.out.println("Give me a positive number.");
        positiveNumber = keyboard.nextInt();
        System.out.println("Number is even: "+(positiveNumber % 2 ==0));
        System.out.println("Number is odd: "+(positiveNumber % 2 !=0));
    }

    public static void keepContained() {
        //todo: keep number contained

        Scanner keyboard;
        int number;

        keyboard = new Scanner(System.in);
        System.out.println("Aiight brother, Imma need another positive number por favor.");
        number = keyboard.nextInt();
        System.out.println((number%8)+5);
        System.out.println(number +" Contained Is: "+((number%8)+5));

    }
    public static void lastDigit() {
        //todo: get the last digit

        Scanner keyboard;
        int positiveNumber3;

        keyboard = new Scanner(System.in);
        System.out.println("And finally, I need a number that is four digits long. Ex: 8491");
        positiveNumber3 = keyboard.nextInt();
        System.out.println("The Last Digit Is: "+positiveNumber3%10);

    }
}