package methods;

import java.util.Scanner;

public class Task9 {

    public static int squareRectTriangle(int x, int y) {

        int square = (x * y) / 2;

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
        Scanner in = new Scanner(System.in);

        System.out.print("Enter X: ");
        int x = in.nextInt();
        System.out.print("Enter Y: ");
        int y = in.nextInt();
        System.out.print("Enter z: ");
        int z = in.nextInt();
        System.out.print("Enter T: ");
        int t = in.nextInt();

        System.out.println("S quadrangle: " + square(x, y, z, t));
    }
}
