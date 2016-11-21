 package algorithms.distribution_sorts;

public class RadixSort {
	private static final int INPUT_RANGE = 1_000;
	private static final int INPUT_SIZE = 1_000_000;
	public static void main(String[] args) {
		int[] array = new int[INPUT_SIZE];
		for (int index = 0; index < INPUT_SIZE; index++) {
			array[index] = (int) (Math.random() * INPUT_RANGE + 1);
		}
		long startTimeMillis = System.currentTimeMillis();
		int[] result = radixSort(array);
		long endTimeMillis = System.currentTimeMillis();
		System.out.println("Seconds to execute: " + (endTimeMillis - startTimeMillis)/ 1000f);
	}
	
	public static int[] radixSort(int[] array) {
		int maxDigits = getNumOfDigits(getMaxNum(array));
		for (int index = 1; index <= maxDigits; index++) {
			array = countingSort(array, index);
		}
		return array;
	}

	private static int[] countingSort(int[] array, int digit) {
		int[] numbersCount = new int[10];
		int[] result = new int[array.length];
		for (int index = 0; index < array.length; index++) {
			int num = kthDigit(array[index], digit);
			numbersCount[num]++;
		}
		for (int index = 1; index < numbersCount.length; index++) {
			numbersCount[index] += numbersCount[index - 1];
		}
		for (int index = array.length - 1; index >= 0; index--) {
			int num = array[index];
			int numDigit = kthDigit(num, digit);
			numbersCount[numDigit]--;
			int pos = numbersCount[numDigit];
			result[pos] = num;
		}
		return result;
	}

	private static int kthDigit(int num, int k) {
		int tenOnKth = (int) Math.pow(10, k - 1);
		return (num / tenOnKth) % 10;
	}

	public static int getNumOfDigits(int maxNum) {
		int numOfDigits = 0;
		while (maxNum > 0) {
			maxNum /= 10;
			numOfDigits++;
		}
		return numOfDigits;
	}

	public static int getMaxNum(int[] array) {
		int maxNum = array[0];
		for (int index = 0; index < array.length; index++) {
			if (array[index] > maxNum) {
				maxNum = array[index];
			}
		}
		return maxNum;
	}
}
