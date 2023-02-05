package com.javanews;
public class VariablesPractice {
    public static void main(String[] args) {
        int whole = 7;
        double decimal = 8.95;
        String word = "panda";

        double sum = whole + decimal;
        String wholeWord = whole + word;

        System.out.println("The sum, expressed as a DOUBLE, is " + sum);
        System.out.println("The wholeWord, expressed as a STRING, is " + wholeWord);
    }
}
