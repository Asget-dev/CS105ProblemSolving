package CS105ProblemSolving.Exam;

public class Question1 {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if ((i % 4 == 0) && (i % 6 == 0)) {
				System.out.println("amazing");
			} else if (i % 4 == 0) {
				System.out.println("cool");
			} else if (i % 6 == 0) {
				System.out.println("excellent");
			} else {
				System.out.println(i);
			}

		}

	}

}
