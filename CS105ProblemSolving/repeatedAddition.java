package CS105ProblemSolving;

import java.util.Scanner;

public class repeatedAddition {

	public static void main(String[] args) {

		int number = (int) (Math.random() * 50);// [0 to 49]0 is inclusice and 50 is exclusive i other words [0-49];
		// double number = Math.random()*50+1;// [1 to 50]
		// double number = Math.floor(Math.random()*50)+45;// [45 to 95]
		// System.out.println(number);

		Scanner x = new Scanner(System.in);
		System.out.println("Enter a first number");
		int input1 = x.nextInt();
		System.out.println("Enter a second number");
		int input2 = x.nextInt();
		int sum = 0;
		while (input2 != 0) {
			sum = sum + input1;
			System.out.println(input1 + " ");
			input2--;
		}
		System.out.println(sum);

	}

}
