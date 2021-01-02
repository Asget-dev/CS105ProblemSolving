package CS105ProblemSolving.Exam;

public class Question3 {
	public static boolean equalDistance(int x, int y, int z) {
		double one = x - y;
		double two = y - z;

		if (one == two) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {

		System.out.println(equalDistance(3, 8, 13));
	}

}
