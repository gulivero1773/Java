package com.company;
import java.util.Scanner;

public class Main {

    public static void main (String [] args){

    String login = "Mykola";
    String password = "1223";
    autentification Person = new autentification();
    if (Person.entLog().equals(login)&&(Person.entPass().equals(password))) {
        System.out.println("");
    } else {
        System.out.println("");}
    }
}
