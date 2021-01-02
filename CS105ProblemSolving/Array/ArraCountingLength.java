package CS105ProblemSolving.Array;

public class ArraCountingLength {
	public static void countLength(String[] y) {
		int x = 0;
		int sum = 0;

		for (int j = 0; j < y.length; j++) {
			if (y[j].length() == 4) {
				sum++;
			}
		}
		System.out.println(sum);

	}

	public static void main(String[] args) {

		String y[] = { "Hello", "hell", "hell" };
		countLength(y);
	}

}
