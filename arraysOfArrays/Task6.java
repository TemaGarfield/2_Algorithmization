package arraysOfArrays;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input n: ");
        int n = in.nextInt();

        byte[][] matrix = new byte[n][n];
        for (int i = 0; i < n; i++) {
            if (i < n / 2) {
                for (int j = i; j < n - i; j++) {
                    matrix[i][j] = 1;
                }
            } else {
                for (int j = i; j > n - i - 2; j--) {
                    matrix[i][j] = 1;
                }
            }
        }



        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("\t" + matrix[i][j]);
            }
            System.out.println();
        }
    }
}
