import java.util.Map;

public class FindMax {
    public static int[][] getFilledMatrix() {
        int[][] arr = new int[100000][4];
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr[j].length; i++) {
                    arr[j][i] = (int)(Math.random() * 1000);
            }
        }
        return arr;
    }

    public static int getMax(int[][] arr) {
        int max = 0;

        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr[j].length; i++) {
                if (arr[j][i] > max) {
                    max = arr[j][i];
                }
            }
        }
        return max;
    }
}
