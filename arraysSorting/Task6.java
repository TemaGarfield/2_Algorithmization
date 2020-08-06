package arraysSorting;

public class Task6 {
    public static void main(String[] args) {
        float[] array = {1.5f, 7.2f, 3.45f, 1.3f, 5.7f, 4.3f};
        int index = 0;
        while (index <= array.length - 2) {
            if (array[index] <= array[index + 1]) {
                index++;
            } else {
                float tmp = array[index];
                array[index] = array[index + 1];
                array[index + 1] = tmp;

                if (index != 0) {
                    index--;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
