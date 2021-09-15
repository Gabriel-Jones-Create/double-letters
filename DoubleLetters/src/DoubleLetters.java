import java.util.Scanner;
public class DoubleLetters {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String string = scan.nextLine();
	int pointer = 0;
	String substring1 = string.substring(pointer,pointer+1);
	String changedString = "";
	
	for(int i = 0;i < string.length(); i++) 
	if(string.substring(pointer,pointer+1).equals("!") == true) {
			changedString = substring1 + substring1 + substring1;
			
			if(pointer <= string.length()-2) {
			substring1 = string.substring(pointer,pointer+1);
			}
			else {
				substring1 = string.substring(pointer);
			}
			System.out.print(changedString);
			pointer++;
		}
	else if(pointer <= string.length()) {
		changedString = substring1 + substring1;
		
		if(pointer <= string.length()){
		substring1 = string.substring(pointer,pointer+1);
		}
		else {
			substring1 = string.substring(pointer);
		}
		System.out.print(changedString);
		
		pointer++;
	}
	
	}
	
	
}
