/*
 * 8. Задан массив D. Определить следующие суммы: D[1] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] + D[5] + D[6].
 * */
package by.epam.task08.main;

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
	
	
	public static int sumArray(int[] array, int number) {

        int sum = 0;
        for (int i = 0; i < 3; i++, number++) {
            if (number >= array.length) {
                number = 0;
            }
            sum += array[number];
        }

        return sum;

    }

	public static void main(String[] args) {
        
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int number;
        
        do {
        	number = enter();
        } while(number >= array.length);

        System.out.print("Sum: " + sumArray(array, number));
	}

}
