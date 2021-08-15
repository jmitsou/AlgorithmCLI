package com.company;

import java.util.Scanner;

public class FactCalculator {

    public static void run() {
        //call method for this factor function
        //System.out.println("Running Factorial Method");
        System.out.print("Input: ");
        int num = CLI.getNum();
        int factor = 1;
        for (int i = num; i > 0; i--){
            factor *= i;
        }
        System.out.println("The factor of " + num + " is " + factor);
    }
}