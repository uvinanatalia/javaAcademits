package academits.java;

import java.util.Scanner;

public class Average {

    public static void main(String[] args) {

/*Среднее арифметическое всех чисел */

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Введите начальное число: ");
        int firstNumber = scanner.nextInt();
        while (firstNumber < 1) {
            System.out.println("Введите число больше 1: ");
            firstNumber = scanner.nextInt();
        }

        System.out.println("Введите конечное число: ");
        int lastNumber = scanner.nextInt();
        while (lastNumber > 25) {
            System.out.println("Введите число меньше 25: ");
            lastNumber = scanner.nextInt();
        }

        int sum = 0;
        int count = 0;

        for (int i = firstNumber; i <= lastNumber; i = i + 1) {
            sum = sum + i;
            count = count + 1;
        }

        double average = getAverage(sum, count);
        System.out.println("Среднее арифиметическое чисел: " + average);

    }

        public static double getAverage(int sum, int count) {
            return (double) sum / count;
        }
}*/


/*Найти среднее арифметическое только
четных чисел из этого диапазона чисел*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите начальное число: ");
        int firstNumber = scanner.nextInt();
        while (firstNumber < 1) {
            System.out.println("Введите число больше 1: ");
            firstNumber = scanner.nextInt();
        }

        System.out.println("Введите конечное число: ");
        int lastNumber = scanner.nextInt();
        while (lastNumber > 25) {
            System.out.println("Введите число меньше 25: ");
            lastNumber = scanner.nextInt();
        }
        int sum = 0;
        int count = 0;

        for (int i = firstNumber; i <= lastNumber; i = i + 1) {
            if (i % 2 == 0) {
                sum = sum + i;
                count = count + 1;
            }
        }

        double average = getAverage(sum, count);
        System.out.println("Среднее арифиметическое четных чисел: " + average);

    }

    public static double getAverage(int sum, int count) {
        return (double) sum / count;
    }
}


