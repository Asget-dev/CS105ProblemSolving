package CS105ProblemSolving.Exam;

import java.util.Arrays;

public class Question5 {
	public static int[] ArrayMultiply(int[] x, int[] y) {
		int sum[] = new int[x.length];
		for (int i = 0; i < x.length; i++) {
			sum[i] = x[i] * y[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		int x[] = { 2, 3, 4 };
		int y[] = { 4, 5, 6 };
		System.out.println(Arrays.toString(ArrayMultiply(x, y)));
	}

}
