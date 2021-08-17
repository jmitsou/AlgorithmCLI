package com.company;

import java.util.Scanner;

public class MarioStairs {
    public static void run() {
        //call method for this factor function
        //System.out.println("Running Mario Stairs Method");
        System.out.println("Build a pyramid with me eh Mario");
        System.out.print("Input: ");
        int num = CLI.getNum();
        for (int i = 1; i <=num ; i++) {
            for (int j = 1; j <=num ; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=i ; k++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
