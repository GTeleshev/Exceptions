package Homework.Seminar2;

import java.util.Scanner;

public class Problem4 {
    //    Разработайте программу, которая выбросит Exception,
//    когда пользователь вводит пустую строку.
//    Пользователю должно показаться сообщение,
//    что пустые строки вводить нельзя.
//    Далее запросить повторный ввод строки
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
            } catch (RuntimeException e){
                System.out.println("Введите числовое значение");
            }
        }
    }
}
