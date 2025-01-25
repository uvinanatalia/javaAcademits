package academits.java;

import java.util.Scanner;

public class Numbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int i = scanner.nextInt();
        int sum = 0;
        while (i > 0) {
            int lastNumber = i % 10; // последняя цифра из числа
            sum = sum + lastNumber;
            i = i / 10; // удаление остатка, получаем целое число

        }

        System.out.println("Сумма цифр числа: " + sum);

    }
}
