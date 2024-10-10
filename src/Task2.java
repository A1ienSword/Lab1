import java.util.InputMismatchException;
import java.util.Scanner;
public class Task2 {
    /**
     * Задание 2
     */
    public static int abs(int x) {
        return (x < 0) ? -x : x;
    }

    public static boolean is35(int x) {
        boolean divisibleBy3 = (x % 3 == 0);
        boolean divisibleBy5 = (x % 5 == 0);

        if (divisibleBy3 && divisibleBy5) {
            return false;
        }

        return divisibleBy3 || divisibleBy5;
    }

    public static int max3(int x, int y, int z) {
        int max = (x > y) ? x : y;
        return (max > z) ? max : z;
    }

    public static int sum2(int x, int y) {
        int sum = x + y;
        if (sum >= 10 && sum <= 19) {
            return 20;
        }
        return sum;
    }

    public static String day(int x) {
        switch (x) {
            case 1:
                return "понедельник";
            case 2:
                return "вторник";
            case 3:
                return "среда";
            case 4:
                return "четверг";
            case 5:
                return "пятница";
            case 6:
                return "суббота";
            case 7:
                return "воскресенье";
            default:
                return "это не день недели";
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("1. Получить абсолютное значение числа");
            System.out.println("2. Проверить, является ли число кратным 3 или 5");
            System.out.println("3. Найти максимальное из трех чисел");
            System.out.println("4. Получить сумму двух чисел с условием");
            System.out.println("5. Получить название дня недели по номеру");
            System.out.println("0. Выход");

            int choice = getValidIntInput(scanner);
            switch (choice) {
                case 1:
                    System.out.print("Введите число для получения абсолютного значения: ");
                    int absValue = getValidIntInput(scanner);
                    System.out.println("Абсолютное значение: " + abs(absValue));
                    break;

                case 2:
                    System.out.print("Введите число для проверки на кратность: ");
                    int numberToCheck = getValidIntInput(scanner);
                    boolean isDivisible = is35(numberToCheck);
                    System.out.println("Число " + numberToCheck + " кратно 3 или 5: " + isDivisible);
                    break;

                case 3:
                    System.out.print("Введите три числа для нахождения максимального: ");
                    int x = getValidIntInput(scanner);
                    int y = getValidIntInput(scanner);
                    int z = getValidIntInput(scanner);
                    int maxValue = max3(x, y, z);
                    System.out.println("Максимальное значение: " + maxValue);
                    break;

                case 4:
                    System.out.print("Введите два числа для получения их суммы: ");
                    int a = getValidIntInput(scanner);
                    int b = getValidIntInput(scanner);
                    int sumResult = sum2(a, b);
                    System.out.println("Результат суммы: " + sumResult);
                    break;

                case 5:
                    System.out.print("Введите номер дня недели (1-7): ");
                    int dayNumber = getValidIntInput(scanner);
                    String dayName = day(dayNumber);
                    System.out.println("День недели: " + dayName);
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
