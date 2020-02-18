/*
 * 1. Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух натуральных чисел.
 * */

package by.epam.task01.main;

import java.util.Scanner;

public class Main {
	public static int enter() {
		Scanner in = new Scanner(System.in);
		int value;
		System.out.print(">> ");
		while (!in.hasNextInt()) {
			in.next();
			System.out.print(">> ");
		}
		value = in.nextInt();
		return value;
	}
	
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
		int firstNumber = enter();
		int secondNumber = enter();
		System.out.println("GCD: " + gcd(firstNumber, secondNumber) + " LCM: " + lcm(firstNumber, secondNumber));
	}
}
