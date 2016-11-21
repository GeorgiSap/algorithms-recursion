package recursion;

import java.util.Scanner;

public class Zadacha7 {
	public static void main(String[] args) {
		int startNumber = 0;
		int endNumber = 0;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter start number: ");
			startNumber = sc.nextInt();
			System.out.println("Enter end number: ");
			endNumber = sc.nextInt();
		}
		printNumbers(startNumber, endNumber, 1);
	}

	public static void printNumbers(int startNumber, int endNumber, int numbersCount) {
		if (numbersCount > endNumber - startNumber + 1) {
			return;
		}
		int number = startNumber;
		while (number < numbersCount + startNumber) {
			System.out.print(number + " ");
			number++;
		}
		System.out.println();
		printNumbers(startNumber, endNumber, numbersCount + 1);
	}
}
