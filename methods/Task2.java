package methods;

import java.util.Scanner;

public class Task2 {

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

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int firstNumber = in.nextInt();
        System.out.print("Enter 2nd number: ");
        int secondNumber = in.nextInt();
        System.out.print("Enter 3rd number: ");
        int thirdNumber = in.nextInt();
        System.out.print("Enter 4th number: ");
        int fourthNumber = in.nextInt();

        int firstGCD = gcd(firstNumber, secondNumber);
        int secondGCD = gcd(thirdNumber, fourthNumber);

        System.out.println("GCD: " + gcd(firstGCD, secondGCD));
    }
}
