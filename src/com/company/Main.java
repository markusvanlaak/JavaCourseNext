package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");
        int newVar;
        newVar = 1;
        //System.out.print(newVar);
        while (newVar <= 10) {

            System.out.println(newVar);
            newVar++;
        }
        float myFloat = 11;
        float modFloat;
        modFloat = myFloat % 2;
        System.out.print(modFloat);
        if (modFloat > 0) {
            System.out.println("If");
        }
        int newZahl = newVar > 1 ? 10 : 12;
        System.out.print(newZahl);
    }
}