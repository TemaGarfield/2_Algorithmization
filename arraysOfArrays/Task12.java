package arraysOfArrays;

import java.util.Scanner;

public class Task12 {
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


        for (int i = 0; i < n; i++) {
            for (int j = m -1; j > 0; j--) {
                for (int k = 0; k < j; k++) {
                    if (matrix[i][k] > matrix[i][k + 1]) {
                        int trash = matrix[i][k];
                        matrix[i][k] = matrix[i][k + 1];
                        matrix[i][k + 1] = trash;
                    }
                }
            }
        }

        System.out.println("Output sorted ascending.");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("\t" + matrix[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = m -1; j > 0; j--) {
                for (int k = 0; k < j; k++) {
                    if (matrix[i][k] < matrix[i][k + 1]) {
                        int trash = matrix[i][k];
                        matrix[i][k] = matrix[i][k + 1];
                        matrix[i][k + 1] = trash;
                    }
                }
            }
        }

        System.out.println("Output sorted descending.");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("\t" + matrix[i][j]);
            }
            System.out.println();
        }
    }
}
