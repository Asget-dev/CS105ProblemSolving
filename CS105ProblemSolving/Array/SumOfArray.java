package CS105ProblemSolving.Array;

public class SumOfArray {

	public static void sumOfZero(int[] num) {
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum = sum + num[i];

		}
		if (sum == 0) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

	}

	public static void main(String[] args) {
		int num[] = { 1, 2, 3, 4, 5, 6 };
		sumOfZero(num);

	}

}
