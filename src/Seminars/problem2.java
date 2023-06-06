package Seminars;

public class problem2 {
//    Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
//    Необходимо посчитать и вернуть сумму элементов этого массива.
//    При этом накладываем на метод 2 ограничения: метод может работать только
//    с квадратными массивами (кол-во строк = кол-ву столбцов),
//    и в каждой ячейке может лежать только значение 0 или 1.
//    Если нарушается одно из условий, метод должен бросить
//    RuntimeException с сообщением об ошибке.
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1, 0, 1},
                {0, 0, 5},
                {1, 1, 1}
        };
        try {
            int result = sum(matrix);
            System.out.println("Длина массива равна: " + result);
        } catch (RuntimeException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println("Конец работы");
    }
    public static int sum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix.length != matrix[i].length)
                throw new RuntimeException("Массив не квадратный");
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != 0 && matrix[i][j] != 1)
                    throw new RuntimeException("Элемент с индексами [" + i + ", " + j +
                            "] не равен 1 или 0");
                sum += matrix[i][j];
            }
        }
        return sum;
    }
}
