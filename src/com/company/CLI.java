package com.company;

import java.util.Scanner;

public class CLI {
    private static Scanner input = new Scanner(System.in);

    public static int getNum (){
        //System.out.println("Please enter a number.");
        int num = input.nextInt();
        return num;
    }

    public static String getStr (){
        String userStr = input.nextLine();
        return userStr;
    }

}
