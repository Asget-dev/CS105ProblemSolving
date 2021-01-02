package CS105ProblemSolving.Function;

public class reverse {

	static void myMultiply(String x) {
		int i = x.length() - 1;
		String y = "";
		int count = 0;
		while (i >= count) {
			y = y + x.charAt(i);
			i--;
		}
		System.out.println(y);
	}

	public static void main(String[] args) {
		myMultiply("Hello");
	}

}
