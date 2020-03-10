package com.company;

import java.util.Scanner;

public class autentification {
String log = "";
String pass = "";
public String entLog(){

    Scanner scan = new Scanner(System.in);
    System.out.println("Enter login");
    return scan.nextLine();
}
public String entPass(){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter pass");
    return scan.nextLine();
}

}
