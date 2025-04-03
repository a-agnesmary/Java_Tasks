package strings;

import java.util.Scanner;

public class EmailValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter an email address: ");
        String email = sc.nextLine();
        sc.close();

        if (isValidEmail(email)) {
            System.out.println("Valid Email Address");
        }
        else {
            System.out.println("Invalid Email Address");
        }
        sc.close();
	}

	private static boolean isValidEmail(String email) {
		if (email == null || email.length() < 8) {
            return false;
        }
        int atIndex = email.indexOf('@');
        int lastAtIndex = email.lastIndexOf('@');
        
        // '@' is not or multiple '@'
        if (atIndex == -1 || atIndex != lastAtIndex) {
            return false; 
        }

        // '@' is not at the start or end
        if (atIndex == 0 || atIndex == email.length() - 1) {
            return false;
        }
        
        int domainStart = email.indexOf('@');
        String userName=email.substring(0,domainStart-1);
		if(userName.charAt(0)=='.'||!(checkUserName(userName)))
		{
			return false;
		}
		
		String domainName=email.substring(domainStart+1, email.length());
		if(!(checkDomain(domainName)))
		{
			return false;
		}
		return true;
	}

	private static boolean checkDomain(String domainName) {
		if(!(domainName.contains(".")))
			return false;
		if(domainName.length()<5) return false;
		String spl="!#$%&'*+/=?^_{|}~";
		for(int i=0;i<domainName.length();i++)
		{
			if(spl.contains(""+domainName.charAt(i))) return false;
		}
		return true;
	}

	private static boolean checkUserName(String username) {
		return username.length()>3 && 
				!(username.contains(" ")) && !(username.contains(",")) &&
				!(username.contains("<>")) && !(username.contains("[]")) &&
				!(username.contains("..")) && !(username.contains("()"));
	}

}