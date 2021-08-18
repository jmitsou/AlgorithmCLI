package com.company;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TitleCase extends CLI{

    public static void run() {
        //call method for this factor function
        //System.out.println("Running TitleCase Method");
        //StringBuilder title = new StringBuilder();
        System.out.println("Provide a sentence to Title Case");
        System.out.print("Input: ");
        String newStr = CLI.getStr();

        String[] strArr = newStr.split(" ");
        System.out.println(Arrays.toString(strArr));
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = strArr[i].substring(0,1).toUpperCase() + strArr[i].substring(1).toUpperCase();
            strArr[i] = newStr;
        }
        System.out.println(newStr);

    }
}
