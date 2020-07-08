package com.company;

import java.util.Scanner;

public class StringPars {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//          System.out.print("Enter line: ");
//        String str = sc.nextLine();
        System.out.println(result(null));

    }

    public static Boolean result(String str) {
        int counter = 0;
        boolean result = true;
        if (str == null) {
            throw new IllegalArgumentException("Input incorrect");
        }

        if (str.isEmpty()) {
            return result;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                counter++;
            } else if (str.charAt(i) == ')') {
                counter--;
            }
            if (counter < 0) {
                result = false;
                break;
            }
        }

        if (counter == 0) {
            result = true;
        } else result = false;
        // else result="Empty line";
        return result;
    }


}