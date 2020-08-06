package methods;

import java.util.Scanner;

public class Task15 {

    public static int enterNum() {

        Scanner in = new Scanner(System.in);

        do {
            System.out.print("Enter number: ");
            int number = in.nextInt();
            if (number < 2) {
                System.out.println("Number nust be >= 2");
            } else {
                return number;
            }
        } while (true);
    }

    public static boolean isRising(int num) {

        do {
            int firstDigit = num % 10;
            num /= 10;
            int secondDigit = num % 10;
            if (secondDigit >= firstDigit) {
                return false;
            }
        } while (num > 0);

        return true;
    }

    public static void outNums(int number) {

        for (int i = (int) Math.pow(10, number - 1); i < (int) Math.pow(10, number); i++) {
            if (isRising(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {

        int number = enterNum();
        outNums(number);
    }
}
