package methods;

import java.util.Scanner;

public class Task11 {

    public static int count(int number) {

        int counter = 0;
        while (number > 0) {
            number /= 10;
            counter++;
        }

        return counter;
    }

    public static void outComparison(int firstNumber, int secondNumber) {

        if (count(firstNumber) > count(secondNumber)) {
            System.out.print("1st number digits > 2nd number digits");
        } else if (count(firstNumber) < count(secondNumber)) {
            System.out.print("2nd number digits > 1st number digits");
        } else {
            System.out.print("1st number digits = 2nd number digits");
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int firstNumber = in.nextInt();
        System.out.print("Enter 2nd number: ");
        int secondNumber = in.nextInt();

        outComparison(firstNumber, secondNumber);
    }
}
