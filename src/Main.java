import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
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
    private int abs(int x) {
        return (x < 0) ? -x : x;
    }

    private boolean is35(int x) {
        boolean divisibleBy3 = (x % 3 == 0);
        boolean divisibleBy5 = (x % 5 == 0);

        if (divisibleBy3 && divisibleBy5) {
            return false;
        }

        return divisibleBy3 || divisibleBy5;
    }

    private int max3(int x, int y, int z) {
        int max = (x > y) ? x : y;
        return (max > z) ? max : z;
    }

    private int sum2(int x, int y) {
        int sum = x + y;
        if (sum >= 10 && sum <= 19) {
            return 20;
        }
        return sum;
    }

    private String day(int x) {
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
    private  String listNums(int x) {
        if (x < 0) {
            return "Ошибка: N не может быть отрицательным.";
        }
        StringBuilder result = new StringBuilder();

        for (int i = 0; i <= x; i++) {
            result.append(i).append(" ");
        }

        return result.toString().trim();
    }

    private  String chet(int x) {
        if (x < 0) {
            return "Ошибка: N не может быть отрицательным.";
        }
        StringBuilder result = new StringBuilder();

        for (int i = 0; i <= x; i += 2) {
            result.append(i).append(" ");
        }
        return result.toString().trim();
    }

    private  int numLen(long x) {
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

    private  void square(int x) {
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

    private  void rightTriangle(int x) {
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
    private int findFirst(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    private int maxAbs(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (Math.abs(num) > Math.abs(max)) {
                max = num;
            }
        }
        return max;
    }

    private int[] add(int[] arr, int[] ins, int pos) {
        if (pos < 0 || pos > arr.length) {
            pos = arr.length ;
        }
        int[] result = new int[arr.length + ins.length];
        System.arraycopy(arr, 0, result, 0, pos);
        System.arraycopy(ins, 0, result, pos, ins.length);
        System.arraycopy(arr, pos, result, pos + ins.length, arr.length - pos);
        return result;
    }

    private int[] reverseBack(int[] arr) {
        int[] reversedArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversedArray[i] = arr[arr.length - 1 - i];
        }
        return reversedArray;
    }

    private int[] findAll(int[] arr, int x) {
        int count = 0;
        for (int value : arr) {
            if (value == x) {
                count++;
            }
        }
        int[] indices = new int[count];
        int currentIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                indices[currentIndex] = i;
                currentIndex++;
            }
        }
        return indices;
    }

    private static int getValidIntInput(Scanner scanner) {
        while (true) {
            try {
                int input = scanner.nextInt();
                return input;
            } catch (InputMismatchException e) {
                System.out.println("Неверный ввод. Пожалуйста, введите целое число.");
                scanner.next();
            }
        }
    }

    private static int getValidIntInputNoNeg(Scanner scanner) {
        while (true) {
            try {
                int input = scanner.nextInt();
                if (input < 0) {
                    System.out.println("Ошибка: значение не может быть отрицательным. Пожалуйста, введите положительное число.");
                    continue;
                }
                return input;
            } catch (InputMismatchException e) {
                System.out.println("Неверный ввод. Пожалуйста, введите целое число.");
                scanner.next();
            }
        }
    }
    private static void Task1() {
        Scanner scanner = new Scanner(System.in);
        Main task1 = new Main();
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
    private static void Task2(){
        Scanner scanner = new Scanner(System.in);
        Main task2 = new Main();
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
                    System.out.println("Абсолютное значение: " + task2.abs(absValue));
                    break;

                case 2:
                    System.out.print("Введите число для проверки на кратность: ");
                    int numberToCheck = getValidIntInput(scanner);
                    boolean isDivisible = task2.is35(numberToCheck);
                    System.out.println("Число " + numberToCheck + " кратно 3 или 5: " + isDivisible);
                    break;

                case 3:
                    System.out.print("Введите три числа для нахождения максимального: ");
                    int x = getValidIntInput(scanner);
                    int y = getValidIntInput(scanner);
                    int z = getValidIntInput(scanner);
                    int maxValue = task2.max3(x, y, z);
                    System.out.println("Максимальное значение: " + maxValue);
                    break;

                case 4:
                    System.out.print("Введите два числа для получения их суммы: ");
                    int a = getValidIntInput(scanner);
                    int b = getValidIntInput(scanner);
                    int sumResult = task2.sum2(a, b);
                    System.out.println("Результат суммы: " + sumResult);
                    break;

                case 5:
                    System.out.print("Введите номер дня недели (1-7): ");
                    int dayNumber = getValidIntInput(scanner);
                    String dayName = task2.day(dayNumber);
                    System.out.println("День недели: " + dayName);
                    break;

                case 0:
                    System.out.println("Выход из задачи 2.");
                    return;

                default:
                    System.out.println("Неверный выбор. Пожалуйста, попробуйте снова.");
            }
        }
    }
    private static void Task3(){
        Scanner scanner = new Scanner(System.in);
        Main task3 = new Main();
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
                    System.out.println("Выход из задачи 3.");
                    return;

                default:
                    System.out.println("Неверный выбор. Пожалуйста, попробуйте снова.");
            }
        }
    }
    private static void Task4 (){
        Scanner scanner = new Scanner(System.in);
        Main task4 = new Main();
        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("1. Найти первый индекс элемента в массиве");
            System.out.println("2. Найти максимальное по модулю число в массиве");
            System.out.println("3. Добавить элементы в массив");
            System.out.println("4. Развернуть массив");
            System.out.println("5. Найти все индексы элемента в массиве");
            System.out.println("0. Выход");

            int choice = getValidIntInput(scanner);

            switch (choice) {
                case 1:
                    System.out.print("Введите размер массива: ");
                    int size1 = getValidIntInputNoNeg(scanner);
                    int[] array1 = new int[size1];
                    System.out.println("Введите элементы массива:");
                    for (int i = 0; i < size1; i++) {
                        array1[i] = getValidIntInput(scanner);
                    }
                    System.out.print("Введите элемент для поиска: ");
                    int elementToFind = getValidIntInput(scanner);
                    int indexFound = task4.findFirst(array1, elementToFind);
                    System.out.println(indexFound != -1 ? "Индекс элемента: " + indexFound : "Элемент не найден.");
                    break;

                case 2:
                    System.out.print("Введите размер массива: ");
                    int size2 = getValidIntInputNoNeg(scanner);
                    int[] array2 = new int[size2];
                    System.out.println("Введите элементы массива:");
                    for (int i = 0; i < size2; i++) {
                        array2[i] = getValidIntInput(scanner);
                    }
                    int maxAbsValue = task4.maxAbs(array2);
                    System.out.println("Максимальное по модулю число: " + maxAbsValue);
                    break;

                case 3:
                    System.out.print("Введите размер основного массива: ");
                    int size3 = getValidIntInputNoNeg(scanner);
                    int[] mainArray = new int[size3];
                    System.out.println("Введите элементы основного массива:");
                    for (int i = 0; i < size3; i++) {
                        mainArray[i] = getValidIntInput(scanner);
                    }

                    System.out.print("Введите размер вставляемого массива: ");
                    int sizeIns = getValidIntInputNoNeg(scanner);
                    int[] insertArray = new int[sizeIns];
                    System.out.println("Введите элементы вставляемого массива:");
                    for (int i = 0; i < sizeIns; i++) {
                        insertArray[i] = getValidIntInput(scanner);
                    }

                    System.out.print("Введите позицию вставки: ");
                    int positionToInsert = getValidIntInputNoNeg(scanner);

                    try {
                        int[] resultArray = task4.add(mainArray, insertArray, positionToInsert);
                        System.out.print("Результирующий массив: ");
                        for (int num : resultArray) {
                            System.out.print(num + " ");
                        }
                        System.out.println();
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }

                    break;

                case 4:
                    System.out.print("Введите размер массива: ");
                    int size4 = getValidIntInputNoNeg(scanner);
                    int[] arrayToReverse = new int[size4];
                    System.out.println("Введите элементы массива:");
                    for (int i = 0; i < size4; i++) {
                        arrayToReverse[i] = getValidIntInput(scanner);
                    }

                    int[] reversedArray = task4.reverseBack(arrayToReverse);
                    System.out.print("Развернутый массив: ");
                    for (int num : reversedArray) {
                        System.out.print(num + " ");
                    }
                    System.out.println();

                    break;

                case 5:
                    System.out.print("Введите размер массива: ");
                    int size5 = getValidIntInputNoNeg(scanner);
                    int[] searchArray = new int[size5];
                    System.out.println("Введите элементы массива:");
                    for (int i = 0; i < size5; i++) {
                        searchArray[i] = getValidIntInput(scanner);
                    }

                    System.out.print("Введите элемент для поиска индексов: ");
                    elementToFind = getValidIntInput(scanner);

                    int[] foundIndices = task4.findAll(searchArray, elementToFind);

                    if (foundIndices.length > 0) {
                        System.out.print("Индексы элемента: ");
                        for (int idx : foundIndices) {
                            System.out.print(idx + " ");
                        }
                        System.out.println();
                    } else {
                        System.out.println("Элемент не найден.");
                    }

                    break;

                case 0:
                    System.out.println("Выход из задачи 4.");
                    return;

                default:
                    System.out.println("Неверный выбор. Пожалуйста, попробуйте снова.");
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            System.out.println("Выберите действие:");
            System.out.println("1. 1 задание");
            System.out.println("2. 2 задание");
            System.out.println("3. 3 задание");
            System.out.println("4. 4 задание");
            System.out.println("0. Выход");
            int choice = getValidIntInput(scanner);
            switch (choice)
            {
                case 1:
                    Task1();
                    break;
                case 2:
                    Task2();
                    break;
                case 3:
                    Task3();
                    break;
                case 4:
                    Task4();
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
