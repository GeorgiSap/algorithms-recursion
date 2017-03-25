import java.util.Scanner;

public class TribonachiBottomUp {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		sc.close();
		if (input >= 1 && input <= 70) {
			System.out.println(tribonachi(input));
		}
	}
	
	static long tribonachi(int number) {
		long[] cache = new long[number + 1 > 3 ? number + 1 : 4];
		cache[1] = 1;
		cache[2] = 1;
		cache[3] = 2;
		
		for (int i = 4; i < cache.length; i++) {
			cache[i] = cache[i-1] + cache[i-2] + cache[i-3];
		}
		return cache[number];
	}
	
}
