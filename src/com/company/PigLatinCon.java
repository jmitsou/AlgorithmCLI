package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class PigLatinCon {

    public static void run() {
        //call method for this factor function
        //System.out.println("Running PigLatin Method");
        System.out.println("What would you like to convert.");
        System.out.print("Input: ");
        String newStr = CLI.getStr();
        char[] vowel = {'a', 'e', 'i', 'o', 'u'};
        StringBuilder pigCon = new StringBuilder();
        String[] strArr = newStr.split(" ");
        //ArrayLists<String> pigArr

        for (int i = 0; i < strArr.length; i++) {
            char p = newStr.charAt(0);
            boolean isFirstVowel = false;
            for (int j = 0; j < vowel.length; j++) {
                if (p == vowel[i]) {
                    isFirstVowel = true;
                    strArr[i] = strArr[i] + "way";
                }

            }
            if (!isFirstVowel && Character.isUpperCase(p)) {
                strArr[i] = strArr[i].substring(1) + strArr[i].substring(0, 1).toLowerCase() + "ay";
            }
        }
        System.out.println(Arrays.toString(strArr));


    }

    public static void main(String[] args) {
        run();
    }
}
