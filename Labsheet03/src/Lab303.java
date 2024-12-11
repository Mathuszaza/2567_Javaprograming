import java.util.*;
public class Lab303 {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Input a sentence : ");
		String sentence = input.nextLine();
		int indexSpace = 0;
		while (true) {
			
			if (sentence.endsWith(".")) {
				break;
			}
			else {
				System.out.print("Input a sentence,again: ");
				sentence = input.nextLine();
			}
			for (int i = 0; i < sentence.length();i++) {
				char ch = sentence.charAt(i);
				if (ch == (' ')) {
					indexSpace  ++;
				}
				
			}//end of for
			
		}//end of while
		System.out.println("This sentence has " + indexSpace  + " spacebar.");
		System.out.println("This sentence has " + (indexSpace +1) + " word.");
		input.close();
 
	}
 
}