import java.util.Scanner;

public class DoubleLetters {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // creates scanner for user input
		String startingString = scan.nextLine(); // sets the scan to the variable startingString
		String doubled = ""; // initiates a doubled variable

		for (int i = 0; i < startingString.length(); i++) { // iterates for length of startingString
			char c = startingString.charAt(i); // creates a character data type that takes the character in the
												// startingString of the i index
			if (startingString.substring(i, i + 1).equals("!")) {
				doubled = "!!!"; // if the current character is an exclamation point then print 3 exclamation
									// points

			} else if (Character.isLetter(c)) { // if the character is a letter than add 2 of that character to the
												// doubled variable
				if (i < startingString.length()) {
					doubled = startingString.substring(i, i + 1) + startingString.substring(i, i + 1);

				} else { // if you are at the end of the startingString then don't cause an overflow
							// error
					doubled = startingString.substring(i) + startingString.substring(i);
				}

			} else {
				if (i < startingString.length()) {// if the character is not a letter or exclamation point it just adds
													// the original value to doubled
					doubled = startingString.substring(i, i + 1);

				} else { // if you are at the end of the startingString then don't cause an overflow
							// error
					doubled = startingString.substring(i);
				}

			}
			System.out.print(doubled);// prints the doubled string
		}

	}
}
