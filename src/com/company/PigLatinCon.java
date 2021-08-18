package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class PigLatinCon {

    public static void run() {
        //call method for this factor function
        //System.out.println("Running PigLatin Method");
        System.out.println("What would you like to convert.");
        System.out.print("Input: ");
        String newStr = CLI.getStr().toUpperCase().trim();
        ;
        String[] strArr = newStr.split(" ");

        for (int i = 0; i < strArr.length; i++) {
            char chars = strArr[i].charAt(0);

            if (chars == 'A' || chars == 'E' || chars == 'I' || chars == 'O' || chars == 'U') {
                strArr[i] += "WAY";
            } else {
                strArr[i] = strArr[i].substring(1) + strArr[i].substring(0, 1) + "AY";
            }
        }
        String pig = "";

        for (int i = 0; i < strArr.length; i++) {

            pig += strArr[i] + " ";
        }
        System.out.println();
        System.out.println(pig);
    }


}
