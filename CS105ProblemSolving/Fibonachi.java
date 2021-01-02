package CS105ProblemSolving;

import java.util.Scanner;

public class Fibonachi {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println("Enter a number");
		int y = x.nextInt();

		int num1 = 0;
		int num2 = 1;
		System.out.print("Fibonacci Series of " + y + " numbers:");

		for (int i = 0; i <= y; ++i) {
			System.out.print(num1 + " ");

			/*
			 * On each iteration, we are assigning second number to the first number and
			 * assigning the sum of last two numbers to the second number
			 */
			int sumOfPrevTwo = num1 + num2; // 1+2=3
			num1 = num2;// num1=2
			num2 = sumOfPrevTwo;// num2=3
			// 0,1,1,2,3,5,8
		}

	}

}
