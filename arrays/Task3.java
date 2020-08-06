package arrays;

import java.util.Scanner;
import java.util.Random;

public class Task3 {
    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Input N: ");
        int N = in.nextInt();

        float [] array = new float[N];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextFloat() + rand.nextInt();
            System.out.print(array[i] + " ");
        }

        int zero = 0;
        int positive = 0;
        int negative = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                positive++;
            } else if (array[i] < 0) {
                negative++;
            } else {
                zero++;
            }
        }

        System.out.print("\nZero: " + zero + "\nPositive: " + positive + "\nNegative: " + negative);
    }
}
