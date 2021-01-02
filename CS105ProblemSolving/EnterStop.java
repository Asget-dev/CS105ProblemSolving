package CS105ProblemSolving;

import java.util.Scanner;

public class EnterStop {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = x.nextInt();
		int sum = 0;
		int avg;
		int max = 1;
		int min = 1000;
		while (number != 0) {
			number = x.nextInt();
			if ((max < number) || (min > number)) {
				max = number;
				min = number;
			}

		}
		System.out.println(max);
		System.out.println(min);
	}
}
