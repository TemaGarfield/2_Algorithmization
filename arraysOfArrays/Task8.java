package arraysOfArrays;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input n: ");
        int n = in.nextInt();
        System.out.print("Input m: ");
        int m = in.nextInt();

        int[][] matrix = new int[n][m];

        System.out.println("Input.");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("matrix[" + i + "][" + j +"]: ");
                matrix[i][j] = in.nextInt();
            }
        }

        System.out.print("Input first column: ");
        int column1 = in.nextInt();
        System.out.print("Input second column: ");
        int column2 = in.nextInt();

        for (int i = 0; i < n; i++) {
            int trash = matrix[i][column1];
            matrix[i][column1] = matrix[i][column2];
            matrix[i][column2] = trash;
        }

        System.out.println("Output.");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("\t" + matrix[i][j]);
            }
            System.out.println();
        }
    }
}
