package academits.java;

import java.util.Scanner;

public class Numbers {

    public static void main(String[] args) {

        //Найдите сумму цифр

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int i = scanner.nextInt();
        int sum = 0;
        while (i > 0) {
            int lastNumber = i % 10; // последняя цифра из числа
            sum = sum + lastNumber;
            i = i / 10; // удаление остатка, получаем целое число

        }

        System.out.println("Сумма цифр числа: " + sum);*/

        /* Найдите сумму только тех цифр числа, которые являются
нечетными числами*/
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int n = scanner.nextInt();
        int sum = 0;
        while (n > 0) {
            int lastNumber = n % 10; // последняя цифра из числа
            if (lastNumber % 2 != 0) {
                sum = sum + lastNumber;
            }
            n = n / 10; // удаление остатка, получаем целое число
        }
            System.out.println("Сумма нечетных цифр числа: " + sum);*/

        //Найдите максимальную цифру числа
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int n = scanner.nextInt();
        int maxNumber = 0;
        while (n > 0) {
            int lastNumber = n % 10; // последняя цифра из числа
            if (lastNumber > maxNumber) {
                maxNumber = lastNumber;
            }
                n = n / 10; // удаление остатка, получаем целое число
            }
        System.out.println("Максимальное число: " + maxNumber);
    }
}