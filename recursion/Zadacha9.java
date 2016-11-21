package recursion;

public class Zadacha9 {
	public static void main(String[] args) {
		long result = product(6, 4);
		System.out.println(result);
	}

	public static long product(int x, int y) {
		return (y <= 0) ? 0 : x + product(x, y - 1);
	}
}
