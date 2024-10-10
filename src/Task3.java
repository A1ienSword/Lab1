import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3 {
    public  String listNums(int x) {
        if (x < 0) {
            return "Ошибка: N не может быть отрицательным.";
        }
        StringBuilder result = new StringBuilder();

        for (int i = 0; i <= x; i++) {
            result.append(i).append(" ");
        }

        return result.toString().trim();
    }

    public  String chet(int x) {
        if (x < 0) {
            return "Ошибка: N не может быть отрицательным.";
        }
        StringBuilder result = new StringBuilder();

        for (int i = 0; i <= x; i += 2) {
            result.append(i).append(" ");
        }
        return result.toString().trim();
    }

    public  int numLen(long x) {
        if (x == 0) {
            return 1;
        }
        int count = 0;
        x = Math.abs(x);
        while (x > 0) {
            x /= 10;
            count++;
        }
        return count;
    }

    public  void square(int x) {
        if (x < 0) {
            System.out.println("Ошибка: размер квадрата не может быть отрицательным.");
            return;
        }

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public  void rightTriangle(int x) {
        if (x < 0) {
            System.out.println("Ошибка: высота треугольника не может быть отрицательной.");
            return;
        }

        for (int i = 1; i <= x; i++) {
            for (int j = 0; j < x - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static int getValidIntInput(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Неверный ввод. Пожалуйста, введите целое число.");
                scanner.next();
            }
        }
    }

    private static long getValidLongInput(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextLong();
            } catch (InputMismatchException e) {
                System.out.println("Неверный ввод. Пожалуйста, введите целое число типа long.");
                scanner.next();
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Task3 task3 = new Task3();
        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("1. Вывести числа от 0 до N");
            System.out.println("2. Вывести четные числа от 0 до N");
            System.out.println("3. Узнать длину числа");
            System.out.println("4. Нарисовать квадрат из звездочек");
            System.out.println("5. Нарисовать левый треугольник из звездочек");
            System.out.println("0. Выход");

            int choice = getValidIntInput(scanner);

            switch (choice) {
                case 1:
                    System.out.print("Введите N: ");
                    int nList = getValidIntInput(scanner);
                    System.out.println("Числа от 0 до " + nList + ": " + task3.listNums(nList));
                    break;

                case 2:
                    System.out.print("Введите N: ");
                    int nEven = getValidIntInput(scanner);
                    System.out.println("Четные числа от 0 до " + nEven + ": " + task3.chet(nEven));
                    break;

                case 3:
                    System.out.print("Введите число для определения длины: ");
                    long numberLength = getValidLongInput(scanner);
                    int length = task3.numLen(numberLength);
                    System.out.println("Длина числа: " + length);
                    break;

                case 4:
                    System.out.print("Введите размер квадрата: ");
                    int squareSize = getValidIntInput(scanner);
                    task3.square(squareSize);
                    break;

                case 5:
                    System.out.print("Введите высоту треугольника: ");
                    int triangleHeight = getValidIntInput(scanner);
                    task3.rightTriangle(triangleHeight);
                    break;

                case 0:
                    System.out.println("Выход из программы.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Неверный выбор. Пожалуйста, попробуйте снова.");
            }
        }
    }
}