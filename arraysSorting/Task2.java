package arraysSorting;

import java.util.Scanner;
import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input n: ");
        int n = in.nextInt();
        System.out.print("Input m: ");
        int m = in.nextInt();

        int[] firstArray = new int[n];
        int[] secondArray = new int[m];

        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = (int)(Math.random() * 100);
        }

        for (int i = 0; i < m; i++) {
            secondArray[i] = (int)(Math.random() * 100);
        }

        Arrays.sort(firstArray);
        Arrays.sort(secondArray);
        firstArray = Arrays.copyOf(firstArray, firstArray.length + secondArray.length);

        for (int i = firstArray.length - secondArray.length, j = 0; i < firstArray.length; i++, j++) {
            firstArray[i] = secondArray[j];
        }

        Arrays.sort(firstArray);

        System.out.println("Output.");
        for (int i = 0; i < firstArray.length; i++) {
            System.out.print(firstArray[i] + " ");
        }
    }
}
