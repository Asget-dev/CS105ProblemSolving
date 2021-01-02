package CS105ProblemSolving.Function;

import java.util.Arrays;

public class abbreviate {
	public static String[] abbrevate(String[] names) {
		for (int i = 0; i < names.length; i++) {
			for (int j = 0; j < names[i].length(); j++) {
				if (names[i].charAt(j) == ' ') {
					names[i] = names[i].charAt(0) + "." + " " + names[i].substring(names[i].indexOf(' '));
				}
			}
		}
		return names;
	}

	public static void main(String[] args) {
		String[] names = { "Asgedom Hailemariam", "Nardos Hailemariam" };
		System.out.println(Arrays.toString(abbrevate(names)));

	}

}
