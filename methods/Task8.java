package methods;

import java.util.Scanner;

public class Task8 {

    public static int inputNumber(int[] array) {

        Scanner in = new Scanner(System.in);

        do {
            System.out.print("Enter number: ");
            int number = in.nextInt();
            if (number >= array.length) {
                System.out.print("Sorry. Your number bigger then array lenght.\n");
            } else {
                return number;
            }
        } while (true);
    }


    public static int sumArray(int[] array, int number) {

        int sum = 0;
        for (int i = 0; i < 3; i++, number++) {
            if (number >= array.length) {
                number = 0;
            }
            sum += array[number];
        }

        return sum;

    }

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int number = inputNumber(array);

        System.out.print("Sum: " + sumArray(array, number));
    }
}
