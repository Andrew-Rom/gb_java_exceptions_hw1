import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /**
         * HW1. Task1
         * Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента целочисленный одномерный массив.
         * Метод должен пройтись по каждому элементу и проверить что он не равен null.
         * А теперь реализуйте следующую логику:
         * Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
         * Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an array of integers > ");
        String line = scanner.nextLine();
        scanner.close();

        Scanner scanner1 = new Scanner(line);
        ArrayList<Integer> digitsFromLine = new ArrayList<>();
        while (scanner1.hasNextInt()) {
            digitsFromLine.add(scanner1.nextInt());
        }
        scanner.close();

        int[] array = new int[digitsFromLine.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = digitsFromLine.get(i);
        }

        System.out.println(Arrays.toString(array));

    }

    public static void checkArray(int[]checkArr) {
        for (int i = 0; i < ; i++) {
            if (checkArr[i] == null) {
                throw
            }

        }
    }

}