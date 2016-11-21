package algorithms.simple_sorts;

public class SelectionSort {
	private static final int INPUT_RANGE = 1_000;
	private static final int INPUT_SIZE = 50_000;

	public static void main(String[] args) {
		int[] array = new int[INPUT_SIZE];
		for (int index = 0; index < INPUT_SIZE; index++) {
			array[index] = (int) (Math.random() * INPUT_RANGE + 1);
		}
		long startTimeMillis = System.currentTimeMillis();
		selectionSort(array);
		long endTimeMillis = System.currentTimeMillis();
		System.out.println("Seconds to execute: " + (endTimeMillis - startTimeMillis) / 1000f);
	}

	public static void selectionSort(int[] array) {
		int start = 0;
		int end = array.length - 1;
		for (int index1 = 0; index1 < array.length / 2; index1++) {
			int maxIndex = start;
			int minIndex = start;
			for (int index2 = start; index2 <= end; index2++) {
				if (array[index2] > array[maxIndex]) {
					maxIndex = index2;
				}
				if (array[index2] < array[minIndex]) {
					minIndex = index2;
				}
			}
			swap(array, maxIndex, end);
			if (minIndex == end) {
				minIndex = maxIndex;
			}
			swap(array, minIndex, start);
			start++;
			end--;
		}
	}

	public static void swap(int[] array, int index1, int index2) {
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}
}
