package algorithms.binary_search;

public class BinarySearch {
	private static final int INPUT_SIZE = 100_000_000;

	public static void main(String[] args) {
		int[] array = new int[INPUT_SIZE];
		for (int index = 0; index < INPUT_SIZE; index++) {
			array[index] = index + 1;
		}
		long startTimeMillis = System.currentTimeMillis();
		int index = binarySearch(array, array[(int) (Math.random()*(array.length))], 0, array.length - 1);
		long endTimeMillis = System.currentTimeMillis();
		System.out.println(index);
		System.out.println("Seconds to execute: " + (endTimeMillis - startTimeMillis) / 1000f);
	}

	public static int binarySearch(int[] array, int searchedValue, int startIndex, int endIndex) {
		if (startIndex > endIndex) {
			return -1;
		}
		int middleIndex = (startIndex + endIndex) / 2;
		if (array[middleIndex] == searchedValue) {
			return middleIndex;
		}
		if (array[middleIndex] > searchedValue) {
			return binarySearch(array, searchedValue, startIndex, middleIndex - 1);
		}
		if (array[middleIndex] < searchedValue) {
			return binarySearch(array, searchedValue, middleIndex + 1, endIndex);
		}
		return -1;
	}
}
