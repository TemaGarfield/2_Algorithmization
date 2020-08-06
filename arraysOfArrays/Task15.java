package arraysOfArrays;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input n: ");
        int n = in.nextInt();
        System.out.print("Input m: ");
        int m = in.nextInt();

        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = (int)(Math.random() * 100);
            }
        }

        System.out.println("Output.");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("\t" + matrix[i][j]);
            }
            System.out.println();
        }

        int max = matrix[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        System.out.println("Output modified.");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] % 2 != 0) {
                    matrix[i][j] = max;
                }
                System.out.print("\t" + matrix[i][j]);
            }
            System.out.println();
        }
    }
}
