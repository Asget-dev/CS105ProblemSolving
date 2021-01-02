package CS105ProblemSolving.Array;

import java.util.ArrayList;

public class ArrayCountGreater0lessThan10 {

	public static ArrayList<Integer> filterOutMultiplesOf3(int[] mult) {

		ArrayList<Integer> multOfThree = new ArrayList<>();
		for (int i = 0; i < mult.length; i++) {
			if (mult[i] % 3 != 0) {
				multOfThree.add(mult[i]);
			}
		}
		return multOfThree;
	}

	public static void main(String[] args) {
		int number[] = { 4, 7, 6, 0, 3, 1, 9, 5 };
		System.out.println(filterOutMultiplesOf3(number));

	}

}
