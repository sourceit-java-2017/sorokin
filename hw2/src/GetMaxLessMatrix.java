import java.util.Arrays;

public class GetMaxLessMatrix {
    public static void matrix() {

        int[][] matrix = new int[][]{
                {8, 2, 2, 4, 1},
                {2, 4, 3, 3, 2},
                {3, 2, 1, 3, 3},
                {2, 4, 8, 3, 1},
                {2, 4, 2, 3, 1}
        };

        StringBuilder row2del = new StringBuilder();
        StringBuilder col2del = new StringBuilder();

        int max = matrix[0][0];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    row2del.setLength(0);
                    col2del.setLength(0);
                }
                if (matrix[i][j] == max) {
                    row2del.append(i);
                    col2del.append(j);
                }
            }
        }

        String row2delArr[] = row2del.toString().split("");
        String col2delArr[] = col2del.toString().split("");

        int[][] newMatrix = new int[matrix.length - row2del.length()][];
        int rowIndex = 0;
        for (Integer i = 0; i < matrix.length; i++) {
            if (!Arrays.asList(row2delArr).contains(Integer.toString(i))) {
                int[] row = newMatrix[rowIndex++] = new int[matrix[i].length - row2delArr.length];
                int colIndex = 0;
                for (int j = 0; j < matrix[i].length; j++) {
                    if (!Arrays.asList(col2delArr).contains(Integer.toString(j))) {
                        row[colIndex++] = matrix[i][j];
                    }
                }
            }
        }
        System.out.println("Looking for maximum number in the following array: ");
        System.out.println(Arrays.deepToString(matrix));
        System.out.println("New Array without max numbers: ");
        System.out.println(Arrays.deepToString(newMatrix));
    }
}
