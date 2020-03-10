package com.company;

public class Min {
    public static void main(String[] args) throws InterruptedException {
        int i = 1;
        int b = 0;
        while (i<61) {
            System.out.println("Количество секунд: " + i);
            Thread.sleep(1000);
            i++;}
        if(i>=60){
            b++;
        }
    }
}
