/*
 * 10. Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого являются цифры числа N.
 * */

package by.epam.task10.main;

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
	
	public static int arrayLength(int number) {
		
		int counter = 0;
		
		while (number > 0) {
			number /= 10;
			counter++;
		}
		
		return counter;
	}
	
	public static int[] doArray(int number) {
		
		int[] array = new int[arrayLength(number)];
		
		for (int i = array.length - 1; i >=0 ; i--) {
			array[i] = number % 10;
			number /= 10;
		}
		
		return array;
	}
	
	public static void output(int[] array) {
		System.out.print("Array: ");
		for (int el:array) {
			System.out.print(el + " ");
		}
	}
	
	public static void main(String[] args) {
		int number = enter();
		
		output(doArray(number));
	}

}
