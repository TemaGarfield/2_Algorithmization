/*
 * 16. Написать программу, определяющую сумму n-значных чисел, содержащих только нечетные цифры.
 * 	   Определить также, сколько четных цифр в найденной сумме.
*/

package by.epam.task16.main;

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
		} while((value = in.nextInt()) < 2);
		
		return value;
	}
	
	public static boolean isOdd(int num) {
        if (num % 2 == 0) {
            return false;
        }

        return true;
    }

    public static int len (int num) {
        int counter = 0;
        
        while (num > 0) {
            if(!isOdd(num)) {
                counter++;
            }
            num /= 10;
        }

        return counter;
    }

    public static boolean isAllOdd(int num) {
        while (num > 0) {
            if (isOdd(num % 10)) {
                return false;
            }
            num /= 10;
        }

        return true;
    }

    public static int sum(int num) {
        int sum = 0;
        
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }

    public static void outNum(int num) {
        for (int i = (int)Math.pow(10, num - 1); i < Math.pow(10, num); i++) {
            if (isAllOdd(i)) {
                System.out.println("Number: " + i + "\t\tsum: " + sum(i) + "\t\tEven: " + len(sum(i)));
            }
        }
    }
	
	public static void main(String[] args) {
		int number = enter();
		
		outNum(number);
	}

}
