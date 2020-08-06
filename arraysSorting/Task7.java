package arraysSorting;

public class Task7 {

    public static int binnarySearch(int[] array, int indexForSearch) {
        int firstIndex = 0;
        int lastIndex = array.length - 1;
        int middleIndex;

        while (firstIndex <= lastIndex) {
            middleIndex = (firstIndex + lastIndex) / 2;
            if (array[middleIndex] < indexForSearch) {
                firstIndex = middleIndex + 1;
            } else if (array[middleIndex] > indexForSearch){
                lastIndex = middleIndex - 1;
            }
        }

        middleIndex = (firstIndex + lastIndex + 1) / 2;
        return middleIndex;
    }

    public static void main(String[] args) {

        int[] firstArray = {2, 5, 7, 9, 25}; // 2, 5, 7, 9, 25, 3, 4, 6, 8, 10, 12, 15, 27
        int[] secondArray = {3, 4, 6, 8, 10, 12, 15, 27, 32};

        for (int i = 0; i < secondArray.length; i++) {
            int index = binnarySearch(firstArray, secondArray[i]);

            System.out.print(index + i + " ");
        }

    }
}
