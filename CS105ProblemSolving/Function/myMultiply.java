package CS105ProblemSolving.Function;

import java.util.Scanner;

public class myMultiply {

	static void myMultiply(int numOne, int numTwo) {
		Scanner x = new Scanner(System.in);
		System.out.println("Enter the first number");
		int y = x.nextInt();
		System.out.println("Enter the second number");
		int z = x.nextInt();

		int sum = 0;
		sum = y + z;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		myMultiply(5, 6);

	}

}
