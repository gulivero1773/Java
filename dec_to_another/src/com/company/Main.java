package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in);
        System.out.println("Напишите число:");
        int num = in.nextInt();
        System.out.println("10 -> 2:" + " = " + Integer.toBinaryString(num));
        System.out.println("10 -> 16:" + " = " + Integer.toHexString(num));
        System.out.println("10 -> 8:" + " = " + Integer.toOctalString(num));
    }
        }
