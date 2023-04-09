import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        /*
          HW1. Task1
          Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента целочисленный одномерный массив.
          Метод должен пройтись по каждому элементу и проверить что он не равен null.
          А теперь реализуйте следующую логику:
          Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
          Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”
         */
        Integer[] array = {1, 10, null, 5, 4, null, 9};
        checkArray(array);

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

}