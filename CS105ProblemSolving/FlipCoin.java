package CS105ProblemSolving;

import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many flip coin you want");
		int flipNumber = input.nextInt();
		while (flipNumber != 0) {
			int random = (int) (Math.random() * 10 + 1);
			if (random <= 5) {
				System.out.println("H");
			} else {
				System.out.println("T");
			}
			flipNumber--;
		}
	}

}
