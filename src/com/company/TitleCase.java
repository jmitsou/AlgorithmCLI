package com.company;

import java.util.Scanner;

public class TitleCase {

    public static void run() {
        //call method for this factor function
        System.out.println("Running TitleCase Method");
    }

    public static void proceed() {
        Scanner pro = new Scanner(System.in);
        System.out.println("\nWould you like to choose another option?");
        System.out.println("(1) Run current Algorithm \n(2) Choose another Algorithm \n(3) Exit");
        System.out.print("\nSelection: ");
        int choice = pro.nextInt();

        if (choice == 1) {
            run();
        } else if (choice == 2) {
            AlgorithmMenu.start();
        } else {
            System.out.println("\nBye have a nice day");
        }
    }
}
