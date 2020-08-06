package arrays;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input N: ");
        int N = in.nextInt();

        double[] array = new double[N];
        double sum = 0;

        System.out.print("Input Array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextDouble();
        }

        for (int i = 0; i < array.length; i++) {
            boolean flag = true;
            if (i >= 2) {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag == true) {
                    sum += array[i];
                }
            } else {
                continue;
            }
        }

        System.out.println(sum);

    }
}
