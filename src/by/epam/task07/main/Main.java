/*
 * 7. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
 * */

package by.epam.task07.main;

public class Main {
	
	public static int factorial(int number) {
		int fact = 1;
		
		for (int i = 2; i <= number; i++) {
			fact *= i;
		}
		
		return fact;
	}
	
	public static int oddFactorialSum() {
		int sum = 0;
		
		for (int i = 1; i <= 9; i += 2) {
			sum += factorial(i);
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(oddFactorialSum());
	}

}
