package arrays;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = in.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int x = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = x;
                }
            }
        }

        int counter = 0;
        int counter1 = 0;
        int min = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                counter++;
            } else {
                if (counter > counter1) {
                    counter1 = counter;
                    min = array[i];
                } else if (counter == counter1) {
                    if (min > array[i]) {
                        min = array[i];
                    }
                }
                counter = 0;
            }
        }

        System.out.println(min);
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
    }
}
