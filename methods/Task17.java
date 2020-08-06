package methods;

import java.util.Scanner;

public class Task17 {

    public static int enterNum() {

        Scanner in = new Scanner(System.in);

        do {
            System.out.print("Enter number: ");
            int num = in.nextInt();
            if (num <= 0) {
                System.out.println("Number must be > 0");
            } else {
                return num;
            }
        } while (true);
    }

    public static int sum(int num) {

        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }

    public static int count(int num) {

        int counter = 0;
        while (num > 0) {
            num -= sum(num);
            counter++;
        }

        return counter;
    }

    public static void main(String[] args) {

        int number = enterNum();
        System.out.println(count(number));
    }
}
