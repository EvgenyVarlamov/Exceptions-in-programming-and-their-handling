package geegbrains;

public class Homework2 {
    /*
    Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий
    новый массив, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
    Если длины массивов не равны, необходимо как-то оповестить пользователя.
     */
    public static void main(String[] args) {
        int[] array1 = {1, 6, 9, 5, 8, 10, 0};
        int[] array2 = {1, 5, 4, 3, 11, 9};
        int[] array = arrayElementsDifference(array1, array2);
        printArray(array);
    }

    public static int[] arrayElementsDifference(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            System.out.println("Operation aborted! Different array sizes!");
            return new int[0];
        } else {
            int[] array = new int[array1.length];
            for (int i = 0; i < array1.length; i++) {
                array[i] = array1[i] - array2[i];
            }
            return array;
        }
    }

    public static void printArray(int[] array) {
        for (int item : array) {
            System.out.printf("%d \t", item);
        }
    }
}
