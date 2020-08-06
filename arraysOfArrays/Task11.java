package arraysOfArrays;

public class Task11 {
    public static void main(String[] args) {

        int[][] matrix = new int[10][20];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                matrix[i][j] = (int)(Math.random() * 15);
            }
        }

        System.out.println("Output.");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("\t" + matrix[i][j]);
            }
            System.out.println();
        }

        System.out.print("\nOutput lines: ");
        for (int i = 0; i < 10; i++) {
            int counter = 0;
            for (int j = 0; j < 20; j++) {
                if (matrix[i][j] == 5) {
                    counter++;
                }
                if (counter == 3) {
                    System.out.print(i + " ");
                    break;
                }
            }
        }
    }
}
