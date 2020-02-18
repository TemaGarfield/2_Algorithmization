/*
 * 14. Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
 *     возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k.
 * */

package by.epam.task14.main;

import java.util.Scanner;

public class Main {
	public static int enter() {
		Scanner in = new Scanner(System.in);
		int value;
		
		do {
			System.out.print(">> ");
			while(!in.hasNextInt()) {
				in.next();
				System.out.print(">> ");
			}
		} while ((value = in.nextInt()) < 2);
		
		return value;
	}
	
    public static int sum(int num) {
        int sum = 0;
        int length = len(num);
        while (num > 0) {
            sum += Math.pow(num % 10, length);
            num /= 10;
        }

        return sum;

    }

    public static int len (int num) {
        int counter = 0;
        while (num > 0) {
            counter++;
            num /= 10;
        }

        return counter;
    }

    public static boolean isArm(int num) {
        if (num == sum(num)) {
            return true;
        }

        return false;
    }

    public static void outArm(int number) {
        for (int i = 1; i < number; i++) {
            if(isArm(i)) {
                System.out.print(i + " ");
            }
        }

    }
	
	public static void main(String[] args) {
		int number = enter();
		
		outArm(number);
	}

}
