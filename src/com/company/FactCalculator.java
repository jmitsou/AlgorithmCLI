package com.company;

import java.util.Scanner;

public class FactCalculator extends CLI {

    //create function

    public void runFact(){
        //run fact funtion
    }
    public void proceed() {
        Scanner pro = new Scanner(System.in);
        System.out.println("Would you like to choose another option?");
        System.out.println("(1) Yes (2) No\"");
        int choice = pro.nextInt();

        if (choice == 1) {
            //run function again
        } else if choice == 2(){
            //run menu options again
            menuSelection();
        }else {
            System.out.println("Bye have a nice day");
        }
    }
}
