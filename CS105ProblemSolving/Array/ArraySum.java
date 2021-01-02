package CS105ProblemSolving.Array;

import java.util.Arrays;

public class ArraySum {
	public static int[] arraySum(int[] x, int[] y) {
		int sum[] = new int[x.length];
		for (int i = 0; i < x.length; i++) {
			sum[i] = x[i] + y[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		int x[] = { 1, 2, 3, 4 };
		int y[] = { 1, 2, 3, 4 };

		// int[] sum = arraySum(x, y);

		System.out.println(Arrays.toString(arraySum(x, y)));
	}

}
