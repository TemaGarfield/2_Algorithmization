package methods;

import java.util.Scanner;

public class Task12 {

    public static int sumNumbers (int number) {

        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;

    }

    public static int lenArray(int k, int n) {

        int counter = 0;
        for (int i = 2; i < n; i++) {
            if (sumNumbers(i) == k) {
                counter++;
            }
        }

        return counter;

    }

    public static int[] inArray(int k, int n) {

        int[] array = new int[lenArray(k, n)];

        for (int i = 0, j = 0; i < n; i++) {
            if (sumNumbers(i) == k) {
                array[j] = i;
                j++;
            }
        }

        return array;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter K: ");
        int firstNumber = in.nextInt();
        System.out.print("Enter N: ");
        int secondNumber = in.nextInt();

        int[] arr =  inArray(firstNumber, secondNumber);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
