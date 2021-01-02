package CS105ProblemSolving;

import java.util.Scanner;

public class ThreeConditions {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number under 100 first number");
		double inputOne = input.nextDouble();

		if (inputOne > 50 && inputOne % 7 == 0) {
			System.out.println("I like this number");
		} else {
			System.out.println("I do not like this number");
		}

	}
}
