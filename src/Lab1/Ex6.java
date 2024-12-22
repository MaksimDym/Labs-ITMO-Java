package Lab1;

import java.util.Scanner;


public class Ex6 {
    public static void checkEvenOdd() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число b: ");
        int b = scanner.nextInt();

        if (b % 2 != 0) {
            System.out.println("Нечетное");
        } else {
            System.out.println("Четное");
            if (b > 100) {
                System.out.println("Выход за пределы диапазона");
            }
        }
        scanner.close();
    }
}
