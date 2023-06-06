package Homework.Seminar1;

public class Problem3 {
//    Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
//    каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
//    Если длины массивов не равны, необходимо как-то оповестить пользователя.
//    Важно: При выполнении метода единственное исключение, которое пользователь
//    может увидеть - RuntimeException, т.е. ваше

    public static void main(String[] args) {
        int[][] arr1 = new int[][]{{2, 4}, {6, 8}};
        int[][] arr2 = new int[][]{{1, 2}, {3, 4}};
        int[][] arr3 = quotientArray(arr1, arr2);
        print2DArray(arr3);
    }

    public static int[][] quotientArray(int[][] array1, int[][] array2) {
        if (array1 == null || array2 == null) {
            throw new RuntimeException("Один из массивов пустой");
        }
        if (array1.length != array2.length || array1[0].length != array2[0].length) {
            throw new RuntimeException("Размеры массивов не равны");
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i].length != array2[i].length){
                throw new RuntimeException("Размеры массивов не равны");
            }
        }
        int[][] resultArray = new int[array1.length][array1[0].length];
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[0].length; j++) {
                if (array2[i][j] == 0) {
                    throw new RuntimeException("Один из элементов второго массива равен нулю");
                }
            }
        }
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[0].length; j++) {
                resultArray[i][j] = array1[i][j] / array2[i][j];
            }
        }
        return resultArray;
    }
    public static void print2DArray(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
}
