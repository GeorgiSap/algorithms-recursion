package recursion;

public class Zadacha4 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		boolean hasDuplicates = hasDuplicates(arr, 0);
		System.out.println(hasDuplicates);
	}

	private static boolean hasDuplicates(int[] arr, int index) {
		if (index + 1 == arr.length) {
			return false;
		}
		for (int element = index + 1; element < arr.length; element++) {
			if (arr[index] == arr[element]) {
				return true;
			}
		}
		return hasDuplicates(arr, index + 1);
	}

}
