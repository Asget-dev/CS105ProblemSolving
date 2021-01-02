package CS105ProblemSolving.Exam;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		Scanner one = new Scanner(System.in);
		String two = one.nextLine();
		String vowel[] = new String[two.length()];

		int indexInString = 0;
		int sum = 0;
		int j = 0;
		int x;
		while (indexInString < two.length()) {
			for (j = 0; j < vowel[indexInString].length(); j++) {
				if (vowel[indexInString].charAt(j) == 'A' || vowel[indexInString].charAt(j) == 'B'
						|| vowel[indexInString].charAt(j) == 'C' || vowel[indexInString].charAt(j) == 'a'
						|| vowel[indexInString].charAt(j) == 'b' || vowel[indexInString].charAt(j) == 'c') {
					sum++;
				}

			}
			indexInString++;
		}
		System.out.println(sum);
	}
}
