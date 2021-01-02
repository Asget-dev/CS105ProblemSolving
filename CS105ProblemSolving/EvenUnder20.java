package CS105ProblemSolving;

public class EvenUnder20 {
	public static void main(String[] args) {
		int number = 20;
		while (number != 0) {
			if (number % 2 == 0) {
				System.out.println(number);
			}

			number--;
		}
	}
}
