package CS105ProblemSolving;

import java.util.Scanner;

public class countLetterEe {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		String text = x.next();
		// System.out.println(text.length());
		int count = 0;
		int sum = 0;
		while (text.length() != count) {
			if (((text.charAt(count)) == 'e')) {
				sum = sum + 1;
			}
			count++;
		}
		System.out.println(sum);

	}

}
