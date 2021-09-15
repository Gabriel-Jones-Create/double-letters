import java.util.Scanner;

public class DoubleLetters {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String startingString = scan.nextLine();
		String doubled = "";
		
		for(int i = 0 ; i< startingString.length(); i++) {
			char c = startingString.charAt(i);
			if(startingString.substring(i,i+1).equals("!")) {
				doubled = "!!!";
				
			}
			else if(Character.isLetter(c)) {
				if(i<startingString.length()) {
				doubled = startingString.substring(i,i+1) + startingString.substring(i,i+1);
				
				}
				else {
					doubled = startingString.substring(i) + startingString.substring(i);
				}
				
				
			}
			else {
				if(i<startingString.length()) {
					doubled = startingString.substring(i,i+1);
					
					}
					else {
						doubled = startingString.substring(i);
					}
				
			}
			System.out.print(doubled);
		}
		
		
	}
}
	