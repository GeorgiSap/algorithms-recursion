package recursion;

public class Zadacha2 {
	public static void main(String[] args) {
		int[] arr = { 23, 31, 5, 8, 12, 7, 32, 22, 11, 15 };
		int result = minElement(arr, 0);
		System.out.println(result);
	}

	private static int minElement(int[] arr, int index) {
		if (index == arr.length - 1) {
			return arr[index];
		}
		int minElement = minElement(arr, index + 1);
		return (arr[index] < minElement) ? arr[index] : minElement;
	}
}
