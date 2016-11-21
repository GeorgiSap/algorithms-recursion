package recursion;

public class Zadacha6 {
	public static void main(String[] args) {
		int number = 123456789;
		int reversedNumber = reverseNumber(number, (int) (Math.log10(number) + 1));
		System.out.println(reversedNumber);
	}

	public static int reverseNumber(int number, int digits) {
		if (number == 0) {
			return number;
		}
		return (int) ((number % 10) * Math.pow(10, digits - 1) + reverseNumber(number / 10, digits - 1));
	}
}
