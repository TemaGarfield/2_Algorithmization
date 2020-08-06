package methods;

import java.util.Scanner;

public class Task1 {

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

    public static int lcm(int firstNumber, int secondNumber) {
        return (firstNumber * secondNumber) / (gcd(firstNumber, secondNumber));
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = in.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = in.nextInt();

        System.out.print("GCD: " + gcd(firstNumber, secondNumber) + "\nLCM: " + lcm(firstNumber, secondNumber));
    }
}
