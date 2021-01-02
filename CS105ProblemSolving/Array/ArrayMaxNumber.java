package CS105ProblemSolving.Array;

public class ArrayMaxNumber {

	public static void main(String[] args) {
		int max = 1;
		int min = 1000;
		int avg = 0;
		int sum = 0;
		int x[] = { 11, 2, 300, 4, 5, 100 };
		for (int i = 0; i < x.length; i++) {
			if (min > x[i]) {
				min = x[i];
			}
		}

		for (int i = 0; i < x.length; i++) {
			if (max < x[i]) {
				max = x[i];
			}

		}

		for (int i = 0; i < x.length; i++) {
			sum = x[i] + sum;
			avg = sum / x.length;

		}

		System.out.println("Min = " + min);
		System.out.println("Max = " + max);
		System.out.println("Sum = " + sum);
		System.out.println("avg = " + avg);

	}

}
