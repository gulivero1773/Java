package com.company;
import java.util.Scanner;
public class Main {
static int price;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите номер товара. Максимум 6 товаров, если меньше 6, в конце 0 нажмите");
        while (true) {
            {
                int n = scan.nextInt();
                switch (n) {
                    case (0):
                    default:
                        System.out.println("Сумма =" + price);
                    case (1):
                        price += 20;
                        break;
                    case (2):
                        price += 30;
                        break;
                    case (3):
                        price +=70;
                    case (4):
                        price += 40;
                        break;
                    case (5):
                        price += 50;
                        break;
                    case (6):
                        price += 60;
                        break;
                }
            }
        }
    }
}
