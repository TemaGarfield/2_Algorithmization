package arrays;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input N: ");
        int N = in.nextInt();

        int[] array = new int[10];
        System.out.println("Input Array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }

        System.out.print("\nResult: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] > i + 1) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
