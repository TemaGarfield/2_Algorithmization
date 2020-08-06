package arraysOfArrays;

import java.util.Scanner;

public class Task13 {
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


        for (int j = 0; j < n; j++) {
            for (int i = n -1; i > 0; i--) {
                for (int k = 0; k < i; k++) {
                    if (matrix[k][j] > matrix[k + 1][j]) {
                        int trash = matrix[k][j];
                        matrix[k][j] = matrix[k + 1][j];
                        matrix[k + 1][j] = trash;
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

        for (int j = 0; j < n; j++) {
            for (int i = n -1; i > 0; i--) {
                for (int k = 0; k < i; k++) {
                    if (matrix[k][j] < matrix[k + 1][j]) {
                        int trash = matrix[k][j];
                        matrix[k][j] = matrix[k + 1][j];
                        matrix[k + 1][j] = trash;
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
