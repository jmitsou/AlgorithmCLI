package com.company;

import java.util.Scanner;

public class CLI {

    public void proceed() {
        Scanner pro = new Scanner(System.in);
        System.out.println("Would you like to choose another option?");
        System.out.println("(1) Yes (2) No\"");
        int choice = pro.nextInt();

        if (choice == 1) {
            FactCalculator.runFact;
        } else if choice == 2(){
            menuSelection();
        }else {
            System.out.println("Bye have a nice day");
        }
    }
}
