package arrays;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = in.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }

        int min = array[0];
        int quantity = 0;
        for (int i = 1; i < n; i++) {
            if (min >= array[i]) {
                min = array[i];
                quantity++;
            }
        }

        int[] newArray = new int[n - quantity - 1];
        for (int i = 0, j = 0; i < n; i++) {
            if (array[i] != min) {
                newArray[j] = array[i];
                j++;
            }
        }

        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
    }
}
