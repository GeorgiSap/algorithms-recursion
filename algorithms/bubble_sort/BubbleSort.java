package algorithms.bubble_sort;

public class BubbleSort {
	private static final int INPUT_RANGE = 1_000;
	private static final int INPUT_SIZE = 20_000;

	public static void main(String[] args) {
		int[] array = new int[INPUT_SIZE];
		for (int index = 0; index < INPUT_SIZE; index++) {
			array[index] = (int) (Math.random() * INPUT_RANGE + 1);
		}
		long startTimeMillis = System.currentTimeMillis();
		bubbleSort(array);
		long endTimeMillis = System.currentTimeMillis();
		System.out.println("Seconds to execute: " + (endTimeMillis - startTimeMillis)/ 1000f);
	}

	public static void bubbleSort(int[] array) {
		for (int index1 = 0; index1 < array.length; index1++) {
			boolean hasSwap = false;
			for (int index2 = 0; index2 < array.length - 1 - index1; index2++) {
				if (array[index2] > array[index2 + 1]) {
					swap(array, index2, index2 + 1);
					hasSwap = true;
				}
			}
			if (!hasSwap) {
				break;
			}
		}
	}

	public static void swap(int[] array, int index1, int index2) {
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}
}
