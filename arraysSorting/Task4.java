package arraysSorting;

public class Task4 {
    public static void main (String[] args) {

        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int i = 0;
        int counter = 0;
        int goodPairs = 0;

        while (true) {

            if (array[i] < array[i + 1]) {
                int tmp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = tmp;
                counter++;
                goodPairs = 0;
            } else {
                goodPairs++;
            }

            i++;

            if (i == array.length - 1) {
                i = 0;
            }

            if (goodPairs == array.length - 1) {
                break;
            }
        }

        for (int j = 0; j < array.length; j++) {

            System.out.print(array[j] + " ");

        }

        System.out.println("\nCounter: " + counter);
    }
}
