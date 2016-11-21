package algorithms.efficient_sorts;

public class QuickSort {
	private static final int INPUT_RANGE = 1_000;
	private static final int INPUT_SIZE = 1_000_000;

	public static void main(String[] args) {
		int[] array = new int[INPUT_SIZE];
		for (int index = 0; index < INPUT_SIZE; index++) {
			array[index] = (int) (Math.random() * INPUT_RANGE + 1);
		}
		long startTimeMillis = System.currentTimeMillis();
		quickSort(array, 0, array.length - 1);
		long endTimeMillis = System.currentTimeMillis();
		System.out.println("Seconds to execute: " + (endTimeMillis - startTimeMillis)/ 1000f);
	}

	public static void quickSort(int[] array, int left, int right) {
		if (left >= right) {
			return;
		}
		int k = partition(array, left, right);
		quickSort(array, left, k - 1);
		quickSort(array, k + 1, right);
	}

	public static int partition(int[] array, int left, int right) {
		int randomIndex = (int) (Math.random()*(right - left + 1) + left);
		swap(array,randomIndex, right);
		int pivot = array[right];
		int k = left - 1;
		for (int index = left; index <= right; index++) {
			if (array[index] <= pivot) {
				k++;
				swap(array, k, index);
			}
		}
		return k;
	}

	public static void swap(int[] array, int index1, int index2) {
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}
}
