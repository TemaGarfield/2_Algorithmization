package methods;

import java.util.Scanner;

public class Task6 {

    public static int gcd(int firstNumber, int secondNumber) {

        while (firstNumber - secondNumber != 0) {
            if (firstNumber > secondNumber) {
                firstNumber -= secondNumber;
            } else {
                secondNumber -= firstNumber;
            }
        }

        return firstNumber;
    }

    public static boolean check (int firstNumber, int secondNumber, int thirdNumber) {
        if ((gcd(firstNumber, secondNumber) == 1) && (gcd(secondNumber, thirdNumber) == 1) && (gcd(firstNumber,thirdNumber) == 1)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int firstNumber = in.nextInt();
        System.out.print("Enter 2nd number: ");
        int secondNumber = in.nextInt();
        System.out.print("Enter 3rd number: ");
        int thirdNumber = in.nextInt();

        if (check(firstNumber, secondNumber, thirdNumber) == true) {
            System.out.println("Relative prime");
        } else {
            System.out.println("No relative prime");
        }
    }
}
