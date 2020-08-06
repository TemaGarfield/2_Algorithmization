package arrays;

import java.util.Scanner;
import java.util.Random;

public class Task1 {
    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Enter N: ");
        int N = in.nextInt();

        int [] A = new int[N];
        for (int i = 0; i < A.length; i++) {
            A[i] = rand.nextInt(100);
            System.out.print(A[i] + " ");
        }

        System.out.print("Enter K: ");
        int K = in.nextInt();

        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % K == 0) {
                sum += A[i];
            }
        }
        System.out.println("Sum = " + sum);
    }
}
