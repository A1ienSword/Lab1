import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
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
            System.out.println("1. 1 Задача");
            System.out.println("2. 2 Задача");
            System.out.println("3. 3 Задача");
            System.out.println("4. 4 Задача");
            System.out.println("0. Выход");

            int choice = getValidIntInput(scanner);
            switch (choice) {
                case 1:
                    Task1.main();
                    break;
                case 2:
                    Task2.main();
                    break;
                case 3:
                    Task3.main();
                    break;
                case 4:
                    Task4.main();
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
