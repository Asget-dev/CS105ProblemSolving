package CS105ProblemSolving;

import java.util.Scanner;

public class DistanceBn3numbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first number");
		double inputOne = input.nextDouble();
		System.out.println("Enter the second number");
		double inputTwo = input.nextDouble();
		System.out.println("Enter the threed number");
		double inputThree = input.nextDouble();

		double x = inputOne - inputTwo;
		double y = inputTwo - inputThree;

		if (x == y) {
			System.out.println("Equal distance");
		} else {
			System.out.println("not the same distance");
		}
	}
}