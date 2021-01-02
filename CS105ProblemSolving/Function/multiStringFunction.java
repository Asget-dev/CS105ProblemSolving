package CS105ProblemSolving.Function;

public class multiStringFunction {
	public static String multString(String x, int y) {
		int num = 0;
		String sum = "";
		while (num < y) {

			sum = sum + " " + x;
			num++;
			// System.out.println(x);
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(multString("Hello", 3));

	}

}
