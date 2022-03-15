package passwordCheck;

import java.util.Scanner;

public class PasswordCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		System.out.println("Create a password containing 7-12 characters, at least one upper case letter, one lower case letter, and a '!':");
		String password = scnr.nextLine();
		
	if (valid(password)) {
		System.out.println("Password valid and accepted");
	
		}
	}

	public static boolean valid (String password) {
		boolean valid = true;
		boolean error = false;
		
		// lower case
		if (password.matches(".*[a-z].*")) {
			
			} else {
				System.out.println("Error");
				return error;
		// upper case		
		} if (password.matches(".*[A-Z].*")) {
				
			} else { 
				System.out.println("Error");
				return error;
		
		// 7 or more characters			
		} if (password.length() < 7) {
			System.out.println("Error");
			return error;
		
		// 12 or fewer characters	
		} if (password.length() > 12) {
				System.out.println("Error");
				return error;		
		
		// contains !
		} if (password.contains("!")) {
			
			} else {
				System.out.println("Error");
				return error;
						
		} 
			return valid;
}
}
