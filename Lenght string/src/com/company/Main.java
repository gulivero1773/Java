package com.company;
import java.util.Scanner;

public class Main {

        public static void main(String args[]) {

            Scanner in = new Scanner(System.in);
            System.out.println("Ведите пароль:");
            String s1 = in.nextLine();
            int len1 = s1.length();

            if (len1 >= 10){
                System.out.println( "\nОк.");
            }
            else {
                System.out.println( "\nПароль короткий.");
            }
        }
}