import java.util.InputMismatchException;
import java.util.Scanner;

public class Task4 {
    public int findFirst(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public int maxAbs(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (Math.abs(num) > Math.abs(max)) {
                max = num;
            }
        }
        return max;
    }

    public int[] add(int[] arr, int[] ins, int pos) {
        if (pos < 0 || pos > arr.length) {
            pos = arr.length ;
        }
        int[] result = new int[arr.length + ins.length];
        System.arraycopy(arr, 0, result, 0, pos);
        System.arraycopy(ins, 0, result, pos, ins.length);
        System.arraycopy(arr, pos, result, pos + ins.length, arr.length - pos);
        return result;
    }

    public int[] reverseBack(int[] arr) {
        int[] reversedArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversedArray[i] = arr[arr.length - 1 - i];
        }
        return reversedArray;
    }

    public int[] findAll(int[] arr, int x) {
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

    public static void main() {
        Scanner scanner = new Scanner(System.in);
        Task4 task4 = new Task4();
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
}