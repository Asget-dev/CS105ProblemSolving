package CS105ProblemSolving.Array;

import java.util.Arrays;

public class OddIndex {

	public static void main(String[] args) {
		int count = 0;
		int rand[] = new int[10];
		while (count < 10) {
			rand[count] = (int) (Math.random() * 10) + 1;
			count++;
		}
		System.out.println(Arrays.toString(rand));

		int number[] = new int[10];
		for (int i = 0; i < rand.length; i++) {
			if (i % 2 != 0) {
				number[i] = rand[i] * -1;
			} else
				number[i] = rand[i];
		}
		System.out.println(Arrays.toString(number));

	}

}
