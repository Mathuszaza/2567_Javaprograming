import java.util.*;
public class ex3 {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter your password(type 'exit' to quit):");
			String password = input.nextLine();
			//Check if user want to exist
			if (password.equalsIgnoreCase("exit")) {
				System.out.println("Program terminate.");
				break;
			}
			//Validate password
			String error ="";
			//Check for Minimum length
			if (password.length() < 8) {
				error += "- Password must be at least 8 characters long.\n";
				
			}
			//Check for at least one Digit, uppercase, lowercase
			boolean hasUpperCase = false;
			boolean hasLowerCase = false;
			boolean hasDigit = false;
			for (int i = 0; i < password.length(); i++) {
				char ch = password.charAt(i);
				if (ch >= 'A' && ch <= 'Z' ) {
					hasUpperCase = true;
				}
				else if (ch >= 'a' && ch <= 'z') {
					hasLowerCase = true;
					
				}
				else if (ch >= '0' && ch <= '9'){
					hasDigit = true;
				}
				//Concatenate errors been on missing criteria
				
			
			
			}//end of while
			if (!hasUpperCase) {
				error += "- Pasword must contain at lease one uppercase letter(A-Z).\n";
		}
			if (!hasLowerCase) {
				error += "\n- Password must contain at lease one uppercase letter(a-z).\n";
				
			}
			if (!hasDigit) {
				error += "\\n- Password must contain at lease one uppercase letter(0-9).\n";
				
			}
			if (error.isEmpty() ) {
				System.out.println("Your password is secure.");
			}
			else {
				System.out.println("Password validation errors.");
				System.out.println(error);
			}				
		}
		input.close();
 
	}
 
}