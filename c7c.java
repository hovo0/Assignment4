import java.util.Arrays;

public class c7c {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {-1, -2, -3, -4, -5}};
        int[] arr = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j) {
                    arr[i] = matrix[i][j];
                }
            }
            System.out.println(arr[i]);
        }
    }
}

