package Seminars.Seminar3;

import java.util.Scanner;

public class Problem1 {
    //    Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
//    и возвращает введенное значение. Ввод текста вместо числа не должно приводить
//    к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
    private static final Scanner iScanner = new Scanner(System.in);

    public static void main(String[] args) {
        float res = returnFloat();
        System.out.println("Введенное число: " + res);
    }

    public static float returnFloat() {
        float res = 0.0f;
        while (true) {
            System.out.print("Введите число с плавающей запятой: ");
            String str1 = iScanner.nextLine();
            try {
                if (str1 != "") {
                    return Float.parseFloat(str1);
                } else {
                    System.out.println("Строка не может быть пустой");
                }
            } catch (RuntimeException e) {
                System.out.println("Введите числовое значение");
            }
        }
    }
}
