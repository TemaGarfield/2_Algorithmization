package arraysOfArrays;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input n: ");
        int n = in.nextInt();

        int[][] matrix = new int [n][n];
        System.out.println("Input matrix");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("matrix[" + i + "][" + j + "]: ");
                matrix[i][j] = in.nextInt();
            }
        }

        System.out.println("Output matrix");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("\t" + matrix[i][j]);
            }
            System.out.println();
        }

        System.out.println("Diagonal.");
        for (int i = 0; i < n; i++) {
            System.out.print(matrix[i][i] + " ");
        }
    }
}
