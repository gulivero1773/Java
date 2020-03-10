package com.company;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {

        String login0;
        String pass0;
        login0 = "Mykola";
        pass0 = "pass";


        Scanner in = new Scanner(System.in);
        System.out.println("Write login");
        String login1 = in.nextLine();

        Scanner in3 = new Scanner(System.in);
        System.out.println("Write login");
        String login2 = in.nextLine();


        Scanner in1 = new Scanner(System.in);
        System.out.println("Write password");
        String pass1 = in.nextLine();

        Scanner in2 = new Scanner(System.in);
        System.out.println("Write password");
        String pass2 = in.nextLine();


        if ((login1 == login0) && (pass0 == pass1)) {
            System.out.println("You have right: admin");
        } else if ((login1 == login0) && (pass0 == pass1)) {
            System.out.println("You have right: admin");
        } else {

        }


    }

}


