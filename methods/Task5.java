package methods;

public class Task5 {

    public static void swap(int[] array, int firstInd, int secondInd) {
        int tmp = array[firstInd];
        array[firstInd] = array[secondInd];
        array[secondInd] = tmp;
    }

    public static void main(String[] args) {
        int[] array = {5, 5, 5, 5, 4, 12, 7, 12, 21, 5, 21, 3};
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[i] < array[j]) {
                    swap(array, i, j);
                }
            }
        }

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1]) {
                System.out.println(array[i + 1]);
                break;
            }
        }
    }
}
