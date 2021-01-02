package CS105ProblemSolving.Exam;

public class JavaTrim {

	public static void main(String[] args) {
		// space remove
		String s = "space testing";
		while (s.indexOf(" ") != -1) {
			s = s.substring(0, s.indexOf(" ")) + s.substring(s.indexOf(" ") + 1);
		}
		System.out.println(s);

		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.split(" "));

	}

}
