import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    /**
     * Задание 1
     */
    private boolean isEqual(int a, int b, int c) {
        return (a == b) && (b == c);
    }

    private boolean isInRange(int a, int b, int num) {
        return num >= Math.min(a, b) && num <= Math.max(a, b);
    }

    private boolean is2Digits(int x) {
        return x >= 10 && x <= 99;
    }

    private int charToNum(char x) {
        return x - '0';
    }

    private double fraction(double x) {
        return x % 1;
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

    private static char getValidCharInput(Scanner scanner) {
        while (true) {
            String input = scanner.next();
            if (input.length() == 1) {
                return input.charAt(0);
            } else {
                System.out.println("Неверный ввод. Пожалуйста, введите один символ.");
            }
        }
    }

    public static double getValidDoubleInput(Scanner scanner) {
        while (true) {
            try {
                String input = scanner.next();
                input = input.replace(',', '.');
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод. Пожалуйста, введите число с плавающей запятой.");
            }
        }
    }

    public static void main() {
        Scanner scanner = new Scanner(System.in);
        Task1 task1 = new Task1();
        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("1. Проверить равенство трех чисел");
            System.out.println("2. Проверить, находится ли число в диапазоне");
            System.out.println("3. Проверить, является ли число двузначным");
            System.out.println("4. Преобразовать символ в число");
            System.out.println("5. Получить дробную часть числа");
            System.out.println("0. Выход");

            int choice = getValidIntInput(scanner);
            switch (choice) {
                case 1:
                    System.out.print("Введите три числа (a, b, c): ");
                    int a = getValidIntInput(scanner);
                    int b = getValidIntInput(scanner);
                    int c = getValidIntInput(scanner);
                    boolean equalResult = task1.isEqual(a, b, c);
                    System.out.println("Результат проверки равенства: " + equalResult);
                    break;

                case 2:
                    System.out.print("Введите два числа (a, b) и число для проверки: ");
                    int x1 = getValidIntInput(scanner);
                    int x2 = getValidIntInput(scanner);
                    int num = getValidIntInput(scanner);
                    boolean rangeResult = task1.isInRange(x1, x2, num);
                    System.out.println("Число " + num + " в диапазоне: " + rangeResult);
                    break;

                case 3:
                    System.out.print("Введите число для проверки: ");
                    int twoDigitNumber = getValidIntInput(scanner);
                    boolean twoDigitResult = task1.is2Digits(twoDigitNumber);
                    System.out.println("Число " + twoDigitNumber + " двузначное: " + twoDigitResult);
                    break;

                case 4:
                    System.out.print("Введите символ для преобразования: ");
                    char character = getValidCharInput(scanner);
                    if (character >= '0' && character <= '9') { // Check if the character is a digit
                        int numberFromChar = task1.charToNum(character);
                        System.out.println("Число из символа '" + character + "': " + numberFromChar);
                    } else {
                        System.out.println("Ошибка: введенный символ не является цифрой.");
                    }
                    break;

                case 5:
                    System.out.print("Введите число для получения дробной части: ");
                    double decimalNumber = getValidDoubleInput(scanner);
                    double fractionResult = task1.fraction(decimalNumber);
                    System.out.println("Дробная часть числа " + decimalNumber + ": " + fractionResult);
                    break;

                case 0:
                    System.out.println("Выход из задачи 1.");
                    return;

                default:
                    System.out.println("Неверный выбор. Пожалуйста, попробуйте снова.");
            }
        }
    }
}