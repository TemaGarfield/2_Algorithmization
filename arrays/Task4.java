package arrays;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input N: ");
        int N = in.nextInt();

        float[] array = new float[N];

        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextFloat();
        }


        float min = array[0];
        float max = array[0];
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                minIndex = i;
            } else if (max < array[i]){
                max = array[i];
                maxIndex = i;
            }
        }

        float key = array[maxIndex];
        array[maxIndex] = array[minIndex];
        array[minIndex] = key;
        System.out.print("Result: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
