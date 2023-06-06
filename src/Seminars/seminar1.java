package Seminars;

public class seminar1 {
    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 3, 4};
        int res = test(array);
        if(res == -1){
            System.out.println("Длина массива меньше минимума");
        }
        else {
            System.out.println("Длина массива равна: " + res);
        }
    }

    public static int test(int[] array) {
        int minSize = 4;
        if (array.length < minSize) {
            return -1;
        } else {
            return array.length;
        }
    }

}
