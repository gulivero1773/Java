package com.company;
import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException{
	FileWriter writen = new FileWriter("player.txt");
	writen.write("Hello world");
	writen.close();

	FileReader writen1 = new FileReader("player.txt");
        FileReader writen2 = new FileReader("player.txt");
        Scanner scan = new Scanner(writen2);
        while (scan.hasNextLine()) {
            System.out.println(scan.nextLine());
        }
    }
}
