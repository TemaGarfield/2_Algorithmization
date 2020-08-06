package arraysOfArrays;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input n: ");
        int n = in.nextInt();
        System.out.print("Input m: ");
        int m = in.nextInt();

        int[][] matrix = new int[n][m];

        System.out.println("Input.");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("matrix[" + i + "][" + j + "]: ");
                matrix[i][j] = in.nextInt();
            }
        }

        int maxSum = 0;
        int maxSumColumn = 0;
        for (int j = 0; j < m; j++) {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += matrix[i][j];
            }
            if (sum > maxSum) {
                maxSum = sum;
                maxSumColumn = j;
            }
        }
        System.out.println("maxSum: " + maxSum + " maxSumColumn: " + maxSumColumn);
    }
}
