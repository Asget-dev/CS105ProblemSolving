package CS105ProblemSolving.Function;

import java.util.Arrays;

public class ArrayFilterLength {
	public static String[] filterLength(String[] x, int y) {
		int count = 0;
		String[] z = new String[x.length];
		String m = "";
		while (count < x.length) {

			if (x[count].length() == y) {
				m = x[count];
				z[count] = m;

			}
			count++;
		}

		return z;
	}

	public static void main(String[] args) {

		String[] f = { "Filter", "thise", "test", "word", "word", "now" };
		System.out.println(Arrays.toString(filterLength(f, 4)));

	}

}
