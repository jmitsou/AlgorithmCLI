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
        int choice = 0;

        do { // loops the method they just selected
            menuSelection(enteredValue);
            choice = subMenu();
        }
        while (choice == 1); //while they select 1 from the submenu it will loop

        if (choice == 2) {
            start(); //runs the method again
        } else {
            System.out.println("\nBye have a nice day");
        }

    }

    public static void menuSelection(int enteredValue) {

        if (enteredValue == 1) {
            System.out.println("You selected Factorial Calculator");
            FactCalculator.run();
        } else if (enteredValue == 2) {
            System.out.println("You selected Title Case A String");
            TitleCase.run();
        } else if (enteredValue == 3) {
            System.out.println("You selected PigLatin Converter");
            PigLatinCon.run();
        } else if (enteredValue == 4) {
            System.out.println("You selected Is it a Factor");
            FactorOf.run();
        } else if (enteredValue == 5) {
            System.out.println("\nBye have a nice day");
        } else if (enteredValue == 1983) {
            System.out.println("You have Unlocked a Bonus.");
            System.out.println("FUN!! Mario Stairs Algorithm. FUN!!");
            MarioStairs.run();
        }

    }

    public static int subMenu() {
        Scanner pro = new Scanner(System.in);
        System.out.println("\nWould you like to choose another option?");
        System.out.println("(1) Re-run current Algorithm \n(2) Choose another Algorithm \n(3) Exit");
        System.out.print("\nSelection: ");
        int choice = CLI.getNum();
        return choice;
    }

}
