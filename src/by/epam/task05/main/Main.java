/*
 * 5. Составить программу, которая в массиве A[N] находит второе по величине число. 
 * */

package by.epam.task05.main;

public class Main {
	public static void swap(int[] arr, int firstIndex, int lastIndex) {
		int tmp = arr[firstIndex];
		arr[firstIndex] = arr[lastIndex];
		arr[lastIndex] = tmp;
	}
	
	public static void sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = arr.length - 1; j > i; j--) {
				if (arr[i] > arr[j]) {
					swap(arr, i, j);
				}
			}
		}
		
	}
	
	public static void find(int[] arr) {
		sort(arr);
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				System.out.println(arr[i + 1]);
				break;
			}
		}
	}
	
	public static void main(String[] args) {
        int[] array = {5, 5, 5, 5, 4, 12, 7, 12, 21, 5, 21, 3};
        find(array);
        
	}
}
