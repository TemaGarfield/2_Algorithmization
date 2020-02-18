/*
 * 17. Из заданного числа вычли сумму его цифр. Из результата вычли сумму его цифр и т.д.
 *     Сколько таких действий нужно произвести, чтобы получился нуль? 
 * */

package by.epam.task17.main;

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
		} while ((value = in.nextInt()) < 0);
		
		
		return value;
	}
	
    public static int sum(int num) {
        int sum = 0;
        
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }

    public static int count(int num) {
        int counter = 0;
        
        while (num > 0) {
            num -= sum(num);
            counter++;
        }

        return counter;
    }
	
	public static void main(String[] args) {
		int number = enter();
		
		System.out.println(count(number));

	}

}
