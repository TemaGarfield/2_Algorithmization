/*
 * 2. Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
 * */

package by.epam.task02.main;

import java.util.Scanner;

public class Main {
	public static int enter() {
		Scanner in = new Scanner(System.in);
		int value;
		
		System.out.print(">> ");
		while(!in.hasNextInt()) {
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
	
	public static void main(String[] args) {
		int firstNumber = enter();
		int secondNumber = enter();
		int thirdNumber = enter();
		int fourthNumber = enter();
		
		int firstGcd = gcd(firstNumber, secondNumber);
		int secondGcd = gcd(thirdNumber, fourthNumber);
		
		System.out.println("GCD: " + gcd(firstGcd, secondGcd));
	}

}
