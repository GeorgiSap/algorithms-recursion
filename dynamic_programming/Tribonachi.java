import java.util.Scanner;

public class Tribonachi {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		sc.close();
		if (input >= 1 && input <= 70) {
			System.out.println(tribonachi(input));
		}
	}
	
	static long tribonachi(long number) {
		if (number <= 2) {
			return 1;
		}
		if (number == 3) {
			return 2;
		}
		return tribonachi(number - 1) + tribonachi(number - 2) + tribonachi(number - 3);
	}
	
}
