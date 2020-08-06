package methods;

import java.util.Scanner;

public class Task3 {

    public static float squareTriangle(int side) {
        return (float) (Math.pow(side, 2) * Math.sqrt(3)) / 4;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a: ");
        int sideTriangle = in.nextInt();

        System.out.println("Square of hexagon: " + 6 * squareTriangle(sideTriangle));

    }
}
