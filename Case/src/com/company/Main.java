package  com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input 0 to 10: ");
        int num = in.nextInt();
        switch (num)
        {
            case 0:
                System.out.println("Число равно 0");
            break;
                case 1:
                System.out.println("Число равно 1");
            case 2:
                System.out.println("Число равно 2");
                break;
            case 3:
                System.out.println("Число равно 3");
                break;
            case 4:
                System.out.println("Число равно 4");
                break;
            case 5:
                System.out.println("Число равно 5");
                break;
            case 6:
                System.out.println("Число равно 6");
                break;
            case 7:
                System.out.println("Число равно 7");
                break;
            case 8:
                System.out.println("Число равно 8");
                break;
            case 9:
                System.out.println("Число равно 9");
                break;
            case 10:
                System.out.println("Число равно 10");
                break;
                default:
                    System.out.println("Число не равно 0 до 10");
        }
        in.close();
    }
}