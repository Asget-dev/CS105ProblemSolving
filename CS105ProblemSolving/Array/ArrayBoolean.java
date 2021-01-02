package CS105ProblemSolving.Array;

import java.util.Scanner;

public class ArrayBoolean {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		String input = scanner.next();

		int num = Integer.valueOf(input);
		int min = num;
		int max = num;
		int sum = num;
		int count = 1;
		while (!(input.equalsIgnoreCase("stop"))) {
			System.out.println("Enter the number");
			input = scanner.next();
			if (!(input.equalsIgnoreCase("stop"))) {
				num = Integer.valueOf(input);
				if (num < min) {
					min = num;
				} else if (num > max) {
					max = num;
				}
				sum = sum + num;
				count = count + 1;
			}

		}
		int average = sum / count;
		System.out.println(min);
		System.out.println(max);
		System.out.println(sum);
		System.out.println(average);

	}

}
