package arrays;

import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner in = new Scanner(System.in);

        System.out.print("Input N: ");
        int N = in.nextInt();

        double [] array = new double [N];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextFloat() + rand.nextInt();
            System.out.print(array[i] + " ");
        }

        System.out.println();
        System.out.print("Input Z: ");
        double Z = in.nextDouble();

        System.out.print("New Array: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] > Z) {
                array[i] = Z;
            }

            System.out.print(array[i] + " ");
        }
    }
}
