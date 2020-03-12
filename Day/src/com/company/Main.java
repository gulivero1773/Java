package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = null;

        br = new BufferedReader(new InputStreamReader(System.in));
        SimpleDateFormat sdf = new SimpleDateFormat("dd MM yyyy");

        System.out.println("Введите дату номер один : dd MM yyyy: ");
        Date dt1 = sdf.parse(br.readLine().trim());

        System.out.println("Введите дату номер два: dd MM yyyy: ");
        Date dt2 = sdf.parse(br.readLine().trim());

        long diff = dt2.getTime() - dt1.getTime();

        System.out.println("Days: " + diff / 1000L / 60L / 60L / 24L);

        if (br != null) {
            br.close();
        }
    }
}