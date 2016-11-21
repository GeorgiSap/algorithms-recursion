package recursion;

public class Zadacha3 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		boolean isAscending = isAscending(arr, 0);
		System.out.println(isAscending);
	}

	public static boolean isAscending(int[] arr, int index) {
		if (index + 1 == arr.length) {
			return true;
		}
		if (arr[index + 1] <= arr[index]) {
			return false;
		}
		return isAscending(arr, index + 1);
	}
}
