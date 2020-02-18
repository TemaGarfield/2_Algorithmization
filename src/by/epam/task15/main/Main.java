/*
 * 15. Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность.
 * */

package by.epam.task15.main;

import java.util.Scanner;

public class Main {
	public static int enter() {	
		Scanner in = new Scanner(System.in);
		int value;
		do {
			System.out.print(">> ");
			while (!in.hasNextInt()) {
				in.next();
				System.out.print(">> ");
			}
		} while((value = in.nextInt()) < 2);
		
		
		return value;
	}
	
    public static boolean isRising(int num) {
        do {
            int firstDigit = num % 10;
            num /= 10;
            int secondDigit = num % 10;
            if (secondDigit >= firstDigit) {
                return false;
            }
        } while (num > 0);

        return true;
    }

    public static void outNums(int number) {
        for (int i = (int) Math.pow(10, number - 1); i < (int) Math.pow(10, number); i++) {
            if (isRising(i)) {
                System.out.print(i + " ");
            }
        }
    }
	
	public static void main(String[] args) {
		int number = enter();
		
		outNums(number);
	}

}
