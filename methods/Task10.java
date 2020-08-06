package methods;

import java.util.Scanner;

public class Task10 {

    public static int division(int number) {

        return number % 10;

    }

    public static int len(int number) {

        int counter = 0;
        while (number > 0) {
            number /= 10;
            counter++;
        }

        return counter;

    }

    public static int[] arr(int number) {

        int[] array = new int[len(number)];

        for (int i = 0; i < array.length; i++) {
            array[i] = division(number);
            number /= 10;
        }

        return array;

    }

    public static void o(int[] array) {
        System.out.print("Array: ");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = in.nextInt();

        o(arr(n));

    }
}
