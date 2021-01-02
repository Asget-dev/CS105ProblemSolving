package CS105ProblemSolving.Array;

import java.util.Scanner;

public class ArrayCountVowels2 {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println("Enter a Text");
		String y = x.next();

		int count[] = new int[y.length()];
		int sum = 0;
		int g = 0;
		while (sum < count.length) {
			for (int i = 0; i < count[sum]; i++) {
				if (count[sum] == 'e') {
					g++;
				}
			}
			sum++;
		}
		System.out.println(g);

	}
}
