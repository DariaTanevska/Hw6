package hw6;
import java.util.Arrays;

public class Hw6ex1 {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        int[] maxArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 1000);
            }
            maxArr[i] = Arrays.stream(arr[i]).max().getAsInt();
        }
        System.out.println("Массив максимальных значений каждого отдельного массива:");
        System.out.println(Arrays.toString(maxArr));
    }
}
