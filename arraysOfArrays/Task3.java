package arraysOfArrays;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input n: ");
        int n = in.nextInt();

        System.out.print("Input m: ");
        int m = in.nextInt();

        int[][] matrix = new int[n][m];
        System.out.println("Input matrix.");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("matrix[" + i + "][" + j + "]: ");
                matrix[i][j] = in.nextInt();
            }
        }

        System.out.println("Output matrix.");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("\t" + matrix[i][j]);
            }
            System.out.println();
        }

        System.out.print("Input k: ");
        int k = in.nextInt();
        System.out.print("Input p: ");
        int p = in.nextInt();

        for (int j = 0; j < m; j++) {
            System.out.print(matrix[k][j] + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(matrix[i][p] + " ");
        }
    }
}
