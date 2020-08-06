package methods;

import java.util.Scanner;

public class Task13 {

    public static int enterNumber() {

        Scanner in = new Scanner(System.in);

        do {
            System.out.print("Enter number: ");
            int number = in.nextInt();

            if (number < 2) {
                System.out.print("Number must be > 2\n");
            } else {
                return number;
            }
        } while (true);
    }

    public static boolean isNatural(int number) {

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;

    }

    public static boolean isTwins(int number) {

        if (isNatural(number)) {
            if (isNatural(number + 2)) {
                return true;
            }
        }

        return false;

    }

    public static void findTwins(int number) {
        for (int i = number; i <= number * 2; i++) {
            if (isTwins(i)) {
                System.out.println(i + " " + (i + 2));
            }
        }
    }

    public static void main(String[] args) {

        int number = enterNumber();
        findTwins(number);

    }
}
