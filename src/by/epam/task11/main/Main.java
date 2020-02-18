/*
 * 11. Написать метод(методы), определяющие в каком из данных двух чисел больше цифр.
 * */

package by.epam.task11.main;

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
	
    public static int count(int number) {
        int counter = 0;
        while (Math.abs(number) > 0) {
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
		int firstNumber = enter();
		int secondNumber = enter();
		
		outComparison(firstNumber, secondNumber);
	}

}
