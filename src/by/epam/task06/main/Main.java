/*
 * 6. Написать метод(методы), проверяющих, являются ли данные три числа взаимно простыми.
 * */

package by.epam.task06.main;

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
    
    public static boolean check (int firstNumber, int secondNumber, int thirdNumber) {
        if ((gcd(firstNumber, secondNumber) == 1) && (gcd(secondNumber, thirdNumber) == 1) && (gcd(firstNumber,thirdNumber) == 1)) {
            return true;
        } else {
            return false;
        }
    }

	public static void main(String[] args) {
		
		int firstNumber = enter();
		int secondNumber = enter();
		int thirdNumber = enter();
		
		if (check(firstNumber, secondNumber, thirdNumber)) {
			System.out.println("Relative prime");
		} else {
			System.out.println("No relative prime");
		}

	}

}
