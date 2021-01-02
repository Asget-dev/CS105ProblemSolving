package CS105ProblemSolving;

import java.util.Scanner;

public class LargestOfTwoNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first number");
		double inputOne = input.nextDouble();
		System.out.println("Enter the second number");
		double inputTwo = input.nextDouble();
		if (inputOne > inputTwo) {
			System.out.println(inputOne + " Is the largets number");
		}

	}

}
