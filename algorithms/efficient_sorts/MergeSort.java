package algorithms.efficient_sorts;

public class MergeSort {
	private static final int INPUT_RANGE = 1_000;
	private static final int INPUT_SIZE = 1_000_000;

	public static void main(String[] args) {
		int[] array = new int[INPUT_SIZE];
		for (int index = 0; index < INPUT_SIZE; index++) {
			array[index] = (int) (Math.random() * INPUT_RANGE + 1);
		}
		long startTimeMillis = System.currentTimeMillis();
		mergeSort(array);
		long endTimeMillis = System.currentTimeMillis();
		System.out.println("Seconds to execute: " + (endTimeMillis - startTimeMillis) / 1000f);
	}

	public static int[] mergeSort(int[] array) {
		if (array.length > 1) {
			int elementsInFirstArray = array.length / 2;
			int elementsInSecondArray = array.length - elementsInFirstArray;
			int[] firstArray = new int[elementsInFirstArray];
			int[] secondArray = new int[elementsInSecondArray];
			for (int index = 0; index < firstArray.length; index++) {
				firstArray[index] = array[index];
			}
			for (int index = elementsInFirstArray; index < elementsInFirstArray + secondArray.length; index++) {
				secondArray[index - elementsInFirstArray] = array[index];
			}
			firstArray = mergeSort(firstArray);
			secondArray = mergeSort(secondArray);
			int arrayIndex = 0;
			int firstArrayIndex = 0;
			int secondArrayIndex = 0;
			while (firstArrayIndex < firstArray.length && secondArrayIndex < secondArray.length) {
				if (firstArray[firstArrayIndex] < secondArray[secondArrayIndex]) {
					array[arrayIndex] = firstArray[firstArrayIndex];
					firstArrayIndex++;
				} else {
					array[arrayIndex] = secondArray[secondArrayIndex];
					secondArrayIndex++;
				}
				arrayIndex++;
			}
			while (firstArrayIndex < firstArray.length) {
				array[arrayIndex] = firstArray[firstArrayIndex];
				firstArrayIndex++;
				arrayIndex++;
			}
			while (secondArrayIndex < secondArray.length) {
				array[arrayIndex] = secondArray[secondArrayIndex];
				secondArrayIndex++;
				arrayIndex++;
			}
		}
		return array;
	}

}
