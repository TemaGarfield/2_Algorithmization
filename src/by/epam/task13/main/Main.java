/*
 * 13. Два простых числа называются "близнецами", если они отличаются друг от друга на 2.
 *     Найти и напечатать все пары "близнецов" из отрезка [n, 2n], где n -- заданное натуральное число больше 2.
*/

package by.epam.task13.main;

import java.util.Scanner;

public class Main {
	
	public static int enter() {
		Scanner in = new Scanner(System.in);
		int value;
		do {
			System.out.print(">> ");
			while(!in.hasNextInt() && in.nextInt() < 2) {
				in.next();
				System.out.print(">> ");
			}
		} while((value = in.nextInt()) < 2);

		
		return value;
	}
	
    public static boolean isNatural(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean isTwins(int number) {
        if (isNatural(number)) {
            if (isNatural(number + 2)) {
                return true;
            }
        }

        return false;
    }

    public static void findTwins(int number) {
        for (int i = number; i <= number * 2; i++) {
            if (isTwins(i)) {
                System.out.println(i + " " + (i + 2));
            }
        }
    }
	
	public static void main(String[] args) {
		int number = enter();
		
		findTwins(number);
	}

}
