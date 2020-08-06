package methods;

public class Task4 {

public static double distance(int[][] coords, int i, int j) {

    double dist = Math.sqrt(Math.pow(coords[j][0] - coords[i][0], 2) + Math.pow(coords[j][1] - coords[i][1], 2));

    return dist;
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


    int firstPoint = 0;
    int secondPoint = 0;
    double maxDistance = -1;

    for (int i = 0; i < coordinates.length - 1; i++) {
        for (int j = i + 1; j < coordinates.length; j++) {
            if (maxDistance < distance(coordinates, i, j)) {
                maxDistance = distance(coordinates, i, j);
                firstPoint = i;
                secondPoint = j;
            }
        }
    }

    System.out.println("maxDistance: " + maxDistance + "\nfirstPoint: " + firstPoint + "\nsecondPoint: " + secondPoint);
    }

}

