package arraysSorting;

public class Task5 {
    public static int binarySearch(int[] arr, int numberSearch, int lastIndex) {
        int firstIndex = 0;
        int middleIndex;
        while (firstIndex <= lastIndex) {
            middleIndex = (firstIndex + lastIndex) / 2;
            if (arr[middleIndex] < numberSearch) {
                firstIndex = middleIndex + 1;
            } else if (arr[middleIndex] > numberSearch) {
                lastIndex = middleIndex - 1;
            }
        }

        middleIndex = (firstIndex + lastIndex + 1) / 2;

        return middleIndex;
    }

    public static void main(String[] args) {

        int[] array = {10, 20, 30, 40, 1, 32, 25, 7, 21};

        for (int i = 4; i < array.length; i++) {
            int index = binarySearch(array, array[i], i - 1);
            int tmp = array[i];

            for (int j = i; j > index; j--) {
                array[j] = array[j - 1];
            }

            array[index] = tmp;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
