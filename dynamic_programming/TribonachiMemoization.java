import java.util.Scanner;

public class TribonachiMemoization {
	
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
		cache[1]=1;
		cache[2]=1;
		cache[3]=2;
		if (cache[number] != 0) {
			return cache[number];
		} 
		return  cache[number] = tribonachi(number - 1) + tribonachi(number - 2) + tribonachi(number - 3);
	}
	
}
