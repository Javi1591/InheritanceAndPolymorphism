// Xavier Nazario
// Student ID# 2512208

// Program converting StringTester
// using StringBuilder

package nazario10;

// String time is 5082
// StringBuilder time is 26
import java.util.Random;

public class StringTester {

	public static void main(String[] args) {
		Random random = new Random();
		final int MAX = 100000;
		// Change to StringBuildere, Add Max
		StringBuilder test = new StringBuilder(MAX);
		// Add .append("")
		test.append("a");

		long startTime = System.currentTimeMillis();
		// add a character
		for (int i = 0; i < MAX; i++) {
			// Change to test.append("a")
			test.append("a");
		}
		// insert random characters into the test String
		for (int i = 0; i < MAX / 10; i++) {
			// Change equation to (test.length())
			int insertPos = (int) (Math.random() * (test.length() - 1));
			char randomizedCharacter = (char) (random.nextInt(26) + 'a');
			// Change to test.setCharAt(insertPos, randomizedCharacter)
			test.setCharAt(insertPos, randomizedCharacter);
		}
		// find the char at position
		for (int i = 0; i < MAX; i++) {
			// Change to char ch = test.charAt(i)
			char ch = test.charAt(i);
		}
		// remove a character at the end of the string
		for (int i = 0; i < MAX; i++) {
			// Change to test.deleteCharAt(test.length() - 1
			test.deleteCharAt(test.length() - 1);
			// System.out.println("test " + test); diagnostic print
		}

		long endTime = System.currentTimeMillis();
		System.out.println("Execution time = " + (endTime - startTime));

	}

}
