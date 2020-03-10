package com.company;
import java.lang.Math;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

 int a = 0;
 int bulet = (int) Math.random();

 a = (int) (bulet + Math.random() * 6);
 if (a == 0) {
     System.out.println( a +" Вы живи");
        }
 else {
   System.out.println(a +" Вы мертвы");
 }
    }
}

