/*
 * 12. Даны натуральные числа K и N. Написать метод(методы) формирования массива A,
 *     элементами которого являются числа, сумма цифр которых равна K и которые не больше N.
 * */

package by.epam.task12.main;

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
	
    public static int sumNumbers (int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }

    public static int lenArray(int k, int n) {
        int counter = 0;
        for (int i = 0; i < n; i++) {
            if (sumNumbers(i) == k) {
                counter++;
            }
        }

        return counter;
    }

    public static int[] inArray(int k, int n) {
        int[] array = new int[lenArray(k, n)];

        for (int i = 0, j = 0; i < n; i++) {
            if (sumNumbers(i) == k) {
                array[j] = i;
                j++;
            }
        }

        return array;
    }
    
    public static void outArray(int[] array) {
    	System.out.print("Array: ");
    	for (int element:array) {
    		System.out.print(element + " ");
    	}
    }
	
	public static void main(String[] args) {
		int k = enter();
		int n = enter();
		int[] array = inArray(k, n);
		
		outArray(array);

	}

}
