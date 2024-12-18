import javax.swing.*;
 
public class Lab303_1 {
 
	public static void main(String[] args) {
		
		int countWord=0;
		int countSpacebar=0;
		
		String sentence = JOptionPane.showInputDialog(null,"Input a sentence:");
		while(sentence.endsWith("") || sentence.endsWith(" ")) {
			
			if(sentence.endsWith(".")) {
				break;
				
			}
			sentence = JOptionPane.showInputDialog(null,
					"Input a sentence, again:");
			
		}
		for(int i=0;i<sentence.length();i++) {
			
			if(sentence.charAt(i) ==' ') {
				countSpacebar++;
				
			}
		}
		countWord = countSpacebar +1;
		
		JOptionPane.showMessageDialog(null,
				"This sentence has "+countSpacebar+" spacebar."
				+"\nThis sentence has "+countWord+" word.");
	}
 
}