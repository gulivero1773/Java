package com.company;
import java.util.Random;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.print(Arrays.toString(array) + " ");

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        
        int max = array[0];
        for (int i = 0; array.length > i; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        int total = 0, total1 = 0;
        for (int i = 0; array.length > i; i++){
                total += array[i];
            total1 = total / 2;
        }

        Arrays.sort(array);
        for (int i = 0; i < array.length; i++){
            System.out.println("[" + array[i] + "]");
        }

            System.out.println("total = " + total1);
            System.out.println("Min = " + min);
            System.out.println("Max = " + max);

        }
    }
