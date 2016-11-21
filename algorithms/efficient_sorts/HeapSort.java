package algorithms.efficient_sorts;

public class HeapSort {
	private static final int INPUT_RANGE = 1_000;
	private static final int INPUT_SIZE = 1_000_000;
	private static int elementsInArray;

	public static void main(String[] args) {
		int[] array = new int[INPUT_SIZE];
		for (int index = 0; index < INPUT_SIZE; index++) {
			array[index] = (int) (Math.random() * INPUT_RANGE + 1);
		}
		long startTimeMillis = System.currentTimeMillis();
		heapSort(array);
		long endTimeMillis = System.currentTimeMillis();
		System.out.println("Seconds to execute: " + (endTimeMillis - startTimeMillis)/ 1000f);
	}

	public static void heapSort(int[] array) {
		heapify(array);
		for (int index = elementsInArray; index > 0; index--) {
			swap(array, 0, index);
			elementsInArray--;
			downHeap(array, 0);
		}
	}
	
	public static void heapify(int[] array) {
		elementsInArray = array.length - 1;
		for (int index = elementsInArray / 2; index >= 0; index--) {
			downHeap(array, index);
		}
	}

	private static void downHeap(int[] array, int index) {
		int leftChildIndex = 2 * index + 1;
		int rightChildIndex = 2 * index + 2;
		int maxIndex = index;
		if (leftChildIndex <= elementsInArray && array[leftChildIndex] > array[index]) {
			maxIndex = leftChildIndex;
		}
		if (rightChildIndex <= elementsInArray && array[rightChildIndex] > array[maxIndex]) {
			maxIndex = rightChildIndex;
		}
		if (maxIndex != index) {
			swap(array, index, maxIndex);
			downHeap(array, maxIndex);
		}
	}

	public static void swap(int[] array, int index1, int index2) {
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}
}
