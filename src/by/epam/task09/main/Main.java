/*
 * 9. Даны числа X, Y, Z, T -- длины сторон четырехугольника.
 *    Написать метод(методы) вычисления его площади, если угол между сторонами длинной X и Y -- прямой.
 * */
package by.epam.task09.main;

import java.util.Scanner;

public class Main {
	
	public static int enter(String name) {
		
		Scanner in = new Scanner(System.in);
		int value;
		
		System.out.print(name + " >> ");
		while (!in.hasNextInt()) {
			in.next();
			System.out.print(name + " >> ");
		}
		
		value = in.nextInt();
		return value;
	}
	
    public static double squareRectTriangle(int x, int y) {
        
    	double square = (x * y) / 2;

        return square;
    }
    
    public static double diagonal(int x, int y) {

        double diagonal = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

        return diagonal;
    }
    
    public static double squareTriangle(int z, int t, double diagonal) {

        double halfP = (t + z + diagonal) / 2;
        double squareTriangle = Math.sqrt(halfP * (halfP - z) * (halfP - t) * (halfP - diagonal));

        return squareTriangle;
    }
    
    public static double square(int x, int y, int z, int t) {

        return squareRectTriangle(x, y) + squareTriangle(z, t, diagonal(x, y));
    }

	public static void main(String[] args) {
		
		int x = enter("X");
		int y = enter("Y");
		int z = enter("Z");
		int t = enter("T");
		
		System.out.println("Square: " + square(x, y, z, t));
	}

}
