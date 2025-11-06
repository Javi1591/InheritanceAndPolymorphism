// Xavier Nazario
// Student ID# 2512208

// Program contains class StringSet with
// An array of objects.

package nazario10;

class StringSet {

	// Constructor to initialize StringSet
	// Use String[] var name
	// Declare currentElements
	// Use integer
	private String[] strings;
	private int currentElements;

	// Sets 1 instance to hold 10 strings
	public StringSet() {
		strings = new String[10];
		// Set currentElements to 0
		currentElements = 0;
	}

	// Set string count to less then 10
	// Use if Statement
	public boolean add(String newStr) {
		if (currentElements < 10) {
			strings[currentElements] = newStr;
			currentElements++;
			return true;
		}
		return false;
	}

	// Returns count of elements in array
	// Use integer
	public int size() {
		return currentElements;
	}

	// Returns total number of characters
	// in all strings
	// Use for loop
	// Use integer
	public int numChars() {
		int totalChars = 0;
		for (int i = 0; i < currentElements; i++) {
			totalChars += strings[i].length();
		}
		return totalChars;
	}

	// Returns integer of times string
	// is passed
	// Use for loop
	// Use integer
	public int countStrings(String subStrToFind) {
		int count = 0;
		for (int i = 0; i < currentElements; i++) {
			count += (strings[i].length() - strings[i].replace(subStrToFind, "").length()) / subStrToFind.length();
		}
		return count;
	}

	// Removes last string in array
	// Use if Statement
	public void pop() {
		if (currentElements > 0) {
			currentElements--;
			strings[currentElements] = null;
		}
	}
}