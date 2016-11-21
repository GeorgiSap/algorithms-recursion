package algorithms.distribution_sorts;

public class CountingSort {
	private static final int INPUT_MIN_VALUE = -10_000;
	private static final int INPUT_MAX_VALUE = 10_000;
	private static final int INPUT_SIZE = 10_000_000;

	public static void main(String[] args) {
		int[] array = new int[INPUT_SIZE];
		for (int index = 0; index < INPUT_SIZE; index++) {
			array[index] = (int) (Math.random() * INPUT_MAX_VALUE - INPUT_MIN_VALUE + 1) + INPUT_MIN_VALUE;
		}
		long startTimeMillis = System.currentTimeMillis();
		int[] result = countingSort(array);
		long endTimeMillis = System.currentTimeMillis();
		System.out.println("Seconds to execute: " + (endTimeMillis - startTimeMillis) / 1000f);
	}

	public static int[] countingSort(int[] array) {
		int maxValue = Integer.MIN_VALUE;
		int minValue = Integer.MAX_VALUE;
		for (int index = 0; index < array.length; index++) {
			if (array[index] > maxValue) {
				maxValue = array[index];
			}
			if (array[index] < minValue) {
				minValue = array[index];
			}
		}
		int[] countingArray = new int[maxValue - minValue + 1];
		int[] result = new int[array.length];
		for (int index = 0; index < array.length; index++) {
			int num = array[index] - minValue;
			countingArray[num]++;
		}
		for (int index = 1; index < countingArray.length; index++) {
			countingArray[index] += countingArray[index - 1];
		}
		for (int index = 0; index < array.length; index++) {
			int num = array[index] - minValue;
			countingArray[num]--;
			int pos = countingArray[num];
			result[pos] = num + minValue;
		}
		return result;
	}
}
