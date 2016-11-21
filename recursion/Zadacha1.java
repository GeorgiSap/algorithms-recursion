package recursion;

import java.util.Scanner;

public class Zadacha1 {
	public static void main(String[] args) {
		int number = 1;
		try (Scanner sc = new Scanner(System.in)) {
			number = sc.nextInt();
		}
		long result = factorial(number);
		System.out.println(result);
	}

	public static long factorial(int number) {
		return (number <= 1) ? 1 : number * factorial(number - 1);
	}
}
