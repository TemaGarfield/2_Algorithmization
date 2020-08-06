package arraysOfArrays;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = in.nextInt();

        double[][] matrix = new double[n][n];

        int counter = 0;

        System.out.println("Initialization.");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / n);
                if (matrix[i][j] > 0) {
                    counter++;
                }
                System.out.print("\t" + matrix[i][j]);
            }
            System.out.println();
        }

        System.out.println("Counter: " + counter);
    }
}
