package arraysOfArrays;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input m: ");
        int m = in.nextInt();
        System.out.print("Input n: ");
        int n = in.nextInt();

        byte[][] matrix = new byte[n][m];
        for (int j = 0; j < m; j++) {
            int counter = 0;
            for (int i = 0; i < n; i++) {
                if (counter != j) {
                    int rand = (int)(Math.random() * n);
                    while (matrix[rand][j] == 1) {
                        rand = (int)(Math.random() * n);
                    }
                    matrix[rand][j] = 1;
                    counter++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("\t" + matrix[i][j]);
            }
            System.out.println();
        }
    }
}
