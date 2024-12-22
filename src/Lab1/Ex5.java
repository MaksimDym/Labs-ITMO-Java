package Lab1;

import java.util.Scanner;


class Ex5 {
    public void readAndPrintIntegers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целые числа (для завершения ввода введите 'end'):");

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("end")) {
                break;
            }
            try {
                int number = Integer.parseInt(input);
                System.out.println(number);
            } catch (NumberFormatException e) {
                System.out.println("Некорректный ввод. Пожалуйста, введите целое число.");
            }
        }
        scanner.close();
    }
}
