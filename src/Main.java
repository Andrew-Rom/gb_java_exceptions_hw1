import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
          HW1. Task1
          Реализуйте метод checkArray(Integer[] arr),
          принимающий в качестве аргумента целочисленный одномерный массив.
          Метод должен пройтись по каждому элементу и проверить что он не равен null.
          А теперь реализуйте следующую логику:
          Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
          Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”
         */
        Integer[] array = {1, 10, null, 5, 4, null, 9};
        checkArray(array);


        /*
          HW1. Task2
          Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
          и возвращающий новый массив,
          каждый элемент которого равен сумме элементов двух входящих массивов в той же ячейке.
          Если длины массивов не равны, необходимо как-то оповестить пользователя.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first array of integers > ");
        String line1 = scanner.nextLine();
        System.out.print("Enter the second array of integers > ");
        String line2 = scanner.nextLine();
        scanner.close();

        Scanner scanner1 = new Scanner(line1);
        ArrayList<Integer> digitsFromLine1 = new ArrayList<>();
        while (scanner1.hasNextInt()) {
            digitsFromLine1.add(scanner1.nextInt());
        }
        scanner1.close();

        Scanner scanner2 = new Scanner(line2);
        ArrayList<Integer> digitsFromLine2 = new ArrayList<>();
        while (scanner2.hasNextInt()) {
            digitsFromLine2.add(scanner2.nextInt());
        }
        scanner2.close();

        int[] firstArray = new int[digitsFromLine1.size()];
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = digitsFromLine1.get(i);
        }

        int[] secondArray = new int[digitsFromLine2.size()];
        for (int i = 0; i < secondArray.length; i++) {
            secondArray[i] = digitsFromLine2.get(i);
        }

        sumOfTwoArrays(firstArray, secondArray);

    }

    public static void checkArray(Integer[] checkArr) {
        ArrayList<Integer> listOfNullIndexes = new ArrayList<>();
        for (int i = 0; i < checkArr.length; i++) {
            if (checkArr[i] == null) {
                listOfNullIndexes.add(i);
            }
        }
        if (listOfNullIndexes.size() == 0) {
            System.out.println("Array does not contain null item");
        } else {
            System.out.println("Array contains null item with index: " + listOfNullIndexes);
        }
    }

    public static void sumOfTwoArrays(int[] array1, int[] array2) {
        int[] sumOfArrays = new int[Math.max(array1.length, array2.length)];
        try {
            for (int i = 0; i < sumOfArrays.length; i++) {
                sumOfArrays[i] = array1[i] + array2[i];
            }
            System.out.println("Result of sum: " + Arrays.toString(sumOfArrays));
        } catch (Exception exception) {
            System.out.println("Error! " + exception.getMessage());
        }
    }
}