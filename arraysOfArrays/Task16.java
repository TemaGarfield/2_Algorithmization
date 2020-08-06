package arraysOfArrays;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = in.nextInt();

        int[][] matrix = new int[n][n];

        if (n % 2 == 0) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = (n * i) + j + 1;
                }
            }

            for (int i = 0; i < n / 4; i++) {
                for (int j = 0; j < n/ 4; j++) {
                    matrix[i][j] = (n * n + 1 ) - matrix[i][j];
                }
            }

            for (int i = 0; i < n / 4; i++) {
                for (int j = 3 * (n / 4); j < n; j++) {
                    matrix[i][j] = (n * n + 1) - matrix[i][j];
                }
            }

            for (int i = 3 * (n / 4); i < n; i++) {
                for (int j = 0; j < n / 4; j++) {
                    matrix[i][j] = (n * n + 1) - matrix[i][j];
                }
            }

            for (int i = 3 * (n / 4); i < n; i++) {
                for (int j = 3 * (n / 4); j < n; j++) {
                    matrix[i][j] = (n * n + 1) - matrix[i][j];
                }
            }

            for (int i = n / 4; i < 3 * (n / 4); i++) {
                for (int j = n / 4; j < 3 * (n / 4); j++) {
                    matrix[i][j] = (n * n + 1) - matrix[i][j];
                }
            }
        } else {
            int number = 1;
            int row = 0;
            int column = n / 2;
            int curr_row;
            int curr_column;

            while (number <= n * n) {
                matrix[row][column] = number;
                number++;
                curr_row = row;
                curr_column = column;
                row--;
                column++;

                if (row == -1) {
                    row = n - 1;
                }

                if (column == n) {
                    column = 0;
                }

                if (matrix[row][column] != 0) {
                    row = curr_row + 1;
                    column = curr_column;

                    if (row == -1) {
                        row = n - 1;
                    }
                }
            }
        }

        System.out.println("Output.");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
