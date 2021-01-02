package CS105ProblemSolving;

import java.util.Scanner;

public class StarTriangle {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println("Enter the number");
		int y = x.nextInt();

		for (int i = 0; i <= y; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}

}
