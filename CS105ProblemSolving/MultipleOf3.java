package CS105ProblemSolving;

public class MultipleOf3 {

	public static void main(String[] args) {
		int x = 50;
		for (int i = 1; i < x; i++) {
			if (x % 3 == 0) {
				System.out.println(x);

			}
			x--;
		}

	}

}
