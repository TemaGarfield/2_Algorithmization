package arrays;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input N: ");
        int N = in.nextInt();

        double[] array = new double[2*N];

        for (int i = 0; i < 2 * N; i++) {
            array[i] = in.nextDouble();
        }

        int N1 = 2 * N - 1;
        double max = array[0] + array[N1];
        for (int i = 1; i <  N1; i++, N1--) {
            double sum = 0;
            sum = array[i] + array[N1 - 1];
            if (sum > max) {
                max = sum;
            }
        }

        System.out.println(max);
    }
}
