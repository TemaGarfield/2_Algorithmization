package methods;

import java.util.Scanner;

public class Task16 {

    public static int enterNum() {

        Scanner in = new Scanner(System.in);

        do {
            System.out.print("Enter number: ");
            int number = in.nextInt();
            if (number < 1) {
                System.out.println("Number must be >= 1");
            } else {
                return number;
            }
        } while(true);
    }

    public static boolean isOdd(int num) {
        if (num % 2 == 0) {
            return false;
        }

        return true;
    }

    public static int len (int num) {

        int counter = 0;
        while (num > 0) {
            if(!isOdd(num)) {
                counter++;
            }

            num /= 10;
        }

        return counter;
    }

    public static boolean isAllOdd(int num) {

        while (num > 0) {
            if (isOdd(num % 10)) {
                return false;
            }

            num /= 10;
        }

        return true;
    }

    public static int sum(int num) {

        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }

    public static void outNum(int num) {

        for (int i = (int)Math.pow(10, num - 1); i < Math.pow(10, num); i++) {
            if (isAllOdd(i)) {
                System.out.println("sum: " + sum(i) + "\tEven: " + len(sum(i)));
            }
        }
    }


    public static void main(String[] args) {

        int number = enterNum();
        outNum(number);
    }
}
