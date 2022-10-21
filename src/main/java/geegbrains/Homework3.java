package geegbrains;

public class Homework3 {
    /*
    Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
    каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. Если длины массивов
    не равны, необходимо как-то оповестить пользователя. Важно: При выполнении метода единственное исключение,
    которое пользователь может увидеть - RuntimeException, т.е. ваше
     */
    public static void main(String[] args) {
        int[] array1 = {1, 6, 9, 5, 8, 10};
        int[] array2 = {1, 5, 4, 3, 11, 9};
        int[] array = arrayElementsDivision(array1, array2);
        printArray(array);
    }

    public static int[] arrayElementsDivision(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            throw new RuntimeException("Operation aborted! Different array sizes!");
        } else {
            int[] array = new int[array1.length];
            for (int i = 0; i < array1.length; i++) {
                array[i] = array1[i] / array2[i];
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
