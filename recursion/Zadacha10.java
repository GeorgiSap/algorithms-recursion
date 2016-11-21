package recursion;

public class Zadacha10 {
	public static void main(String[] args) {
		long result = power(2, 10);
		System.out.println(result);
	}

	public static long power(int x, int y) {
		return (y <= 0) ? 1 : product(x, power(x, y - 1));
	}

	public static long product(int x, long y) {
		return (y <= 0) ? 0 : x + product(x, y - 1);
	}
}
