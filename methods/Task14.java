package methods;

import java.util.Scanner;

public class Task14 {

    public static int enterNum() {

        Scanner in = new Scanner(System.in);

        do {
            System.out.print("Enter number: ");
            int number = in.nextInt();

            if (number < 2) {
                System.out.println("Number must be >= 2");
            } else {
                return number;
            }
        } while(true);

    }

    public static int sum(int num) {

        int sum = 0;
        int length = len(num);
        while (num > 0) {
            sum += Math.pow(num % 10, length);
            num /= 10;
        }

        return sum;

    }

    public static int len (int num) {

        int counter = 0;
        while (num > 0) {
            counter++;
            num /= 10;
        }

        return counter;
    }

    public static boolean isArm(int num) {

        if (num == sum(num)) {
            return true;
        }

        return false;
    }

    public static void outArm(int number) {

        for (int i = 1; i < number; i++) {
            if(isArm(i)) {
                System.out.println(i);
            }
        }

    }

    public static void main(String[] args) {

        int k = enterNum();
        outArm(k);

    }
}
