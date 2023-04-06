package generaterandomnumbersandprintthenthsmallestnumber;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class FindSmallestNumber {

	public static void main(String[] args) {

		Random rnum = new Random();
		int counter;
		int[] numbers = new int[500];
		numbers[0] = rnum.nextInt(1000);
		int smallest = numbers[0];
		for (counter = 1; counter < 500; counter++) {
			numbers[counter] = rnum.nextInt(1000);
			smallest = Math.min(smallest, numbers[counter]);

		}
		System.out.println("List of array is: " + Arrays.toString(numbers));
		System.out.println("Smallest number is : " + smallest);

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the value of n: ");
		int n = scanner.nextInt();

		if (n < 1 || n > numbers.length) {
			System.out.println("Invalid input for n. n must be between 1 and 500.");
		} else {
			int nthSmallest = numbers[n - 1];
			System.out.println("The " + n + "th smallest number is: " + nthSmallest);
		}
	}
}
