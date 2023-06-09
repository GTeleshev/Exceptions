package Seminars.Seminar2;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Укажите индекс элемента в который хотите хаписать значение 1");

        try {
            int index = scanner.nextInt();
            arr[index] = 1;
            System.out.println(arr[index]);
        } catch (Exception e){
            System.out.println("Указан индекс за пределами массива");
        }

    }
}
