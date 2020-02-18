/*
 * 3. Вычислить площадь правильного шестиугольника со стороной a, используя метод вычисления площади треугольника. 
 * */

package by.epam.task03.main;

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
	
    public static float squareTriangle(int side) {
        return (float) (Math.pow(side, 2) * Math.sqrt(3)) / 4;
    }
    
    public static float squareHexagon(int side) {
    	return (float) squareTriangle(side) * 6;
    }
	
	public static void main(String[] args) {
		int sideTriangle = enter();
		
		System.out.println("Square hexagon: " + squareHexagon(sideTriangle));
		
	}

}
