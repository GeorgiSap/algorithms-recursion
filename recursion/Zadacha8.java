package recursion;

import java.util.Scanner;

public class Zadacha8 {
	public static void main(String[] args) {
		int number = 0;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter number: ");
			number = sc.nextInt();
		}
		boolean isPrime = isPrime(number, number - 1);
		System.out.println(isPrime);
	}

	public static boolean isPrime(int number, int index) {
		if (index <= 1) {
			return true;
		}
		if (number % index != 0) {
			return isPrime(number, index - 1);
		}
		return false;
	}
}
