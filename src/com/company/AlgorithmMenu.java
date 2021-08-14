package com.company;

import java.util.Scanner;

public class AlgorithmMenu {

    public static void start() {
        Scanner userConvo = new Scanner(System.in);
        System.out.println("\nPlease choose an option to continue:");
        System.out.println("(1) Factorial Calculator \n(2) Title Case A String \n(3) PigLatin Converter \n(4) Is it a" +
                " Factor \n(5) Exit Program");
        System.out.print("\nSelection: ");
        int enteredValue = userConvo.nextInt();

        if (enteredValue == 1) {
            System.out.println("You selected Factorial Calculator");
            FactCalculator.run();
            FactCalculator.proceed();
        } else if (enteredValue == 2) {
            System.out.println("You selected Title Case A String");
            TitleCase.run();
            TitleCase.proceed();
        } else if (enteredValue == 3) {
            System.out.println("You selected PigLatin Converter");
            PigLatinCon.run();
            PigLatinCon.proceed();
        } else if (enteredValue == 4) {
            System.out.println("You selected Is it a Factor");
            FactorOf.run();
            FactorOf.proceed();
        } else if (enteredValue == 5) {
            System.out.println("\nBye have a nice day");
        }else if (enteredValue == 1983){
            System.out.println("You have Unlocked a Bonus.");
            System.out.println("FUN!! Mario Stairs Algorithm. FUN!!");
        }
    }

}
