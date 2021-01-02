package CS105ProblemSolving.Exam;

public class LowerCaseToUpper {

	static String LowerToUpper(String s) {
		String result = "";
		char ch = ' ';
		for (int i = 0; i < s.length(); i++) {

			// check valid alphabet and it is in lowercase
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				ch = (char) (s.charAt(i) - 32);
			}
			// else keep the same alphabet or any character
			else {
				ch = (char) (s.charAt(i));
			}

			result += ch; // concatenation, append c to result
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(LowerToUpper("IncludeHelp.com"));

	}

}
