/*
 * 4. На плоскости заданы своими координатами n точек.
 *    Написать метод(методы), определяющие, между какими из пар точек самое большое.
 * */

package by.epam.task04.main;

public class Main {
	
	public static double distance(int[][] coords, int i, int j) {

	    double dist = Math.sqrt(Math.pow(coords[j][0] - coords[i][0], 2) + Math.pow(coords[j][1] - coords[i][1], 2));

	    return dist;
	}
	
	public static int[] maxDistance(int[][] coords) {
		int[] points = new int[2];
		double maxDistance = -1;
		
		for (int i = 0; i < coords.length - 1; i++) {
			for (int j = i + 1; j < coords.length; j++) {
				if (maxDistance < distance(coords, i, j)) {
					maxDistance = distance(coords, i, j);
					points[0] = i;
					points[1] = j;
				}
			}
		}
		
		return points;
	}
	
	public static void main(String[] args) {
	    int[][] coordinates = {
	            {145, 30},
	            {7, 8},
	            {72, 54},
	            {24, 23},
	            {50, 50},
	            {0, -2}
	    };
	    
	    int[] points = maxDistance(coordinates);
	    
	    System.out.println("firstPoint: " + points[0] + " secondPoint: " + points[1]);

	}

}
