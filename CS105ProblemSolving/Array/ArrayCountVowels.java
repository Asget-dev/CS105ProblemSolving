package CS105ProblemSolving.Array;

import java.util.Scanner;

public class ArrayCountVowels {
	public static void main(String[] args) {
		Scanner one = new Scanner(System.in);
		String two = one.next();

		String[] three = new String[two.length()];

		int indexInString = 0;
		int sum = 0;
		int j = 0;
		int x;
		while (indexInString < three.length) {
			for (j = 0; j < three[indexInString].length(); j++) {
				if (three[indexInString].charAt(j) == '0' || three[indexInString].charAt(j) == '2') {
					sum++;
				}

			}
			indexInString++;
		}
		System.out.println(sum);

	}
}
