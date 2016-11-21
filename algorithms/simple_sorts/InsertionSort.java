package algorithms.simple_sorts;

public class InsertionSort {
	private static final int INPUT_RANGE = 1_000;
	private static final int INPUT_SIZE = 50_000;

	public static void main(String[] args) {
		int[] array = new int[INPUT_SIZE];
		for (int index = 0; index < INPUT_SIZE; index++) {
			array[index] = (int) (Math.random() * INPUT_RANGE + 1);
		}
		long startTimeMillis = System.currentTimeMillis();
		insertionSort(array);
		long endTimeMillis = System.currentTimeMillis();
		System.out.println("Seconds to execute: " + (endTimeMillis - startTimeMillis) / 1000f);
	}

	public static void insertionSort(int[] array) {
		for (int index1 = 1; index1 < array.length; index1++) {
			int temp = array[index1];
			int index2;
			for (index2 = index1 - 1; index2 >= 0 && temp < array[index2]; index2--) {
				array[index2 + 1] = array[index2];
			}
			array[index2 + 1] = temp;
		}
	}
}
