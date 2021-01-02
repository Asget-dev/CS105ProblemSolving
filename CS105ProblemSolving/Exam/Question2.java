package CS105ProblemSolving.Exam;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner m = new Scanner(System.in);
		System.out.println("Please enter the string");
		String input = m.nextLine();
		int count = 0;

		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == 'A' || input.charAt(i) == 'B' || input.charAt(i) == 'C' || input.charAt(i) == 'a'
					|| input.charAt(i) == 'b' || input.charAt(i) == 'c') {
				count++;
			}
		}
		System.out.println(count);

	}
}
