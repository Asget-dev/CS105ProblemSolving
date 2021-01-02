package CS105ProblemSolving;

import java.util.Scanner;

public class HeadOrTail {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter Head or Tail");
		String text = input.next();

		int random = (int) (Math.random() * 10 + 1);
		System.out.println(random);

		if (text == "Head" && random >= 5) {
			System.out.println("You won");
		}
		if (text == "Tail" && random < 5) {
			System.out.println("You won");
		} else {
			System.out.println("sorry, you lost");
		}
	}

}
