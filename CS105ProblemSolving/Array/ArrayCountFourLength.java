package CS105ProblemSolving.Array;

public class ArrayCountFourLength {
	public static void countLengthFour(String[] lengthFour) {
		int sum = 0;
		int j = 0;
		for (int i = 0; i < lengthFour.length; i++) {
			if (lengthFour[i].length() >= 4) {
				j++;
			}
		}
		System.out.println(j);
	}

	public static void main(String[] args) {
		String x[] = { "Hello", "Hiii", "food", "book" };
		countLengthFour(x);
	}

}
