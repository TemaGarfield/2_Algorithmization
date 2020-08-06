package arraysSorting;

import java.util.Scanner;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = new int[5];
        int[] array2 = new int[7];

        System.out.println("Array.");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 100);
            System.out.print(array[i] + "  ");
        }

        System.out.println("\nArray2.");
        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int)(Math.random() * 100);
            System.out.print(array2[i] + " ");
        }

        array = Arrays.copyOf(array, array.length+array2.length);

        System.out.print("\nInput k: ");
        int k = in.nextInt();

        for (int i = k, j = 0; i < array2.length + k; i++, j++) {
            if (array[i] != 0) {
                array[array2.length + i] = array[i];
                array[i] = array2[j];
            } else {
                array[i] = array2[j];
            }
        }

        System.out.println("New array.");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
