package arraysOfArrays;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input n: ");
        int n = in.nextInt();

        int [][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("matrix[" + i + "][" + j + "]: ");
                matrix[i][j] = in.nextInt();
            }
        }

        System.out.print("Positives: ");
        for (int i = 0; i < n; i++) {
            if (matrix[i][i] > 0) {
                System.out.print(matrix[i][i] + " ");
            }
        }
    }
}
