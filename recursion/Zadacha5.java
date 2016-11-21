package recursion;

public class Zadacha5 {
	public static void main(String[] args) {
		int[] arr = { 23, 31, 5, 8, 12, 7, 32, 22, 11, 15 };
		int result = IndexOfMaxElement(arr, 0);
		System.out.println(arr[result]);
	}

	private static int IndexOfMaxElement(int[] arr, int index) {
		if (index == arr.length - 1) {
			return index;
		}
		int indexOfMaxElement = IndexOfMaxElement(arr, index + 1);
		if (arr[index] > arr[indexOfMaxElement]) {
			return index;
		}
		return indexOfMaxElement;
	}
}
