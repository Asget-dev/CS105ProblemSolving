package CS105ProblemSolving.Function;

public class FindingAverageCharcodeOfString {
	// Function to find average of ASCII value of chars
	public static int averageValue(String s) {
		int sum_char = 0;
		// loop to sum the ascii value of chars
		for (int i = 0; i < s.length(); i++) {
			sum_char += (int) s.charAt(i);
		}
		// Returning average of chars
		return sum_char / s.length();
	}

	// Driver code
	public static void main(String[] args) {
		String s = "Sosina";
		System.out.println(averageValue(s));
	}
}