package emailApp;

import java.util.Scanner;

public class EmailApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first name and the last name: ");
		String fName = sc.next();
		String lName = sc.next();
		Email email = new Email(fName, lName);
		
		System.out.print("Choose the Department:\n Sales - 1\n development - 2\n Accounting - 3\n");
		System.out.println("Enter the department ID: ");
		int depID = sc.nextInt();
		email.setDepartment(depID);
		
		email.generateEmail();
		email.generatePassword(email.getPswLength());
		
		System.out.println("Congratulations! Your email ID was created.");
		System.out.println("CHANGE PASSWORD: Enter your new Password: ");
		String newPsw = sc.next();
		email.changePsw(newPsw);
		
		System.out.println("Enter your altername email ID: ");
		String altEmailid = sc.next();
		email.setAltEmail(altEmailid);
		

		System.out.println("-----------------------------------");
		System.out.println(email.getInfo());
	}
}
